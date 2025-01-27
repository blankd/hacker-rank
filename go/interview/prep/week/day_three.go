package week

func makeAlpha() ([]string, []string) {
	var lower []string
	var upper []string
	for ch := 'a'; ch <= 'z'; ch++ {
		lower = append(lower, string(ch))
	}

	for ch := 'A'; ch <= 'Z'; ch++ {
		upper = append(upper, string(ch))
	}

	return lower, upper
}

func lessThan26(what int32) int32 {
	if what > 26 {
		return lessThan26(what - 26)
	}
	return what
}
func CaesarCipher(s string, k int32) string {
	lower, upper := makeAlpha()
	theK := lessThan26(k)
	shaLower := append(lower[theK:], lower[:theK]...)
	shaUpper := append(upper[theK:], upper[:theK]...)
	cipher := make(map[string]string)

	for ind, val := range upper {
		cipher[val] = shaUpper[ind]
	}

	for ind, val := range lower {
		cipher[val] = shaLower[ind]
	}

	var ret = ""
	for _, val := range s {
		if _, ext := cipher[string(val)]; ext {
			ret += cipher[string(val)]
		} else {
			ret += string(val)
		}
	}
	return ret
}
