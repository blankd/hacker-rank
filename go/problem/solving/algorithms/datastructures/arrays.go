package datastructures

func ReverseArray(a []int) []int {
	var ret []int
	for i := len(a) - 1; i >= 0; i-- {
		ret = append(ret, a[i])
	}
	return ret
}
