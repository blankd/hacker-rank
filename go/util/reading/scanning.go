package reading

import (
	"bufio"
	"io"
	"strconv"
)

func PrepareInt64Array(reader io.Reader) []int64 {
	scanning := bufio.NewScanner(reader)
	var ret []int64
	for scanning.Scan() {
		num, err := strconv.ParseInt(scanning.Text(), 10, 64)
		if err != nil {
			panic(err)
		} else {
			ret = append(ret, num)
		}
	}
	return ret
}

func PrepareInt32Array(reader io.Reader) []int32 {
	scanning := bufio.NewScanner(reader)
	var ret []int32
	for scanning.Scan() {
		num, err := strconv.ParseInt(scanning.Text(), 10, 64)
		if err != nil {
			panic(err)
		} else {
			ret = append(ret, int32(num))
		}
	}
	return ret
}

func GetNLines(reader io.Reader, lines int) []string {
	var ret []string
	var stop int
	scanning := bufio.NewScanner(reader)
	for scanning.Scan() {
		ret = append(ret, scanning.Text())
		if stop == lines {
			break
		}
		stop++
	}
	return ret
}

func GetOneLine(reader io.Reader) string {
	return GetNLines(reader, 1)[0]
}
