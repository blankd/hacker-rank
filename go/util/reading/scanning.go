package reading

import (
	"bufio"
	"fmt"
	"io"
	"strconv"
	"strings"
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

func PrepareIntArray(reader io.Reader) []int {
	scanning := bufio.NewScanner(reader)
	var ret []int
	for scanning.Scan() {
		num, err := strconv.ParseInt(scanning.Text(), 10, 64)
		if err != nil {
			panic(err)
		} else {
			ret = append(ret, int(num))
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

func GetSingleLine(reader io.Reader) string {
	return GetNLines(reader, 1)[0]
}

func PrepareArrayOfInt32Arrays(reader io.Reader, spliter ...rune) [][]int32 {
	var ret [][]int32
	var split = ' '
	if len(spliter) > 0 {
		split = spliter[0]
	}
	scanning := bufio.NewScanner(reader)
	for scanning.Scan() {
		var row []int32
		for _, strInt := range strings.Split(scanning.Text(), string(split)) {
			num, err := strconv.ParseInt(strInt, 10, 64)
			if err != nil {
				fmt.Println("Failed to parse int")
				panic(err)
			}
			row = append(row, int32(num))
		}
		ret = append(ret, row)
	}
	return ret
}

func PrepareArrayOfInt64Arrays(reader io.Reader, spliter ...rune) [][]int64 {
	var ret [][]int64
	var split = ' '
	if len(spliter) > 0 {
		split = spliter[0]
	}
	scanning := bufio.NewScanner(reader)
	for scanning.Scan() {
		var row []int64
		for _, strInt := range strings.Split(scanning.Text(), string(split)) {
			num, err := strconv.ParseInt(strInt, 10, 64)
			if err != nil {
				fmt.Println("Failed to parse int")
				panic(err)
			}
			row = append(row, num)
		}
		ret = append(ret, row)
	}
	return ret
}

func PrepareSplitStringTwoInt64s(theStr string, spliter ...rune) (int64, int64) {
	var split rune
	if len(spliter) > 0 {
		split = spliter[0]
	}
	broken := strings.Split(theStr, string(split))
	one, _ := strconv.Atoi(broken[0])
	two, _ := strconv.Atoi(broken[1])
	return int64(one), int64(two)
}

func PrepareSplitStringTwoInt32s(theStr string, spliter ...rune) (int32, int32) {
	var split = ' '
	if len(spliter) > 0 {
		split = spliter[0]
	}
	broken := strings.Split(theStr, string(split))
	one, _ := strconv.Atoi(broken[0])
	two, _ := strconv.Atoi(broken[1])
	return int32(one), int32(two)
}

func PrepareSplitStringTwoInt16s(theStr string, spliter ...rune) (int16, int16) {
	var split = ' '
	if len(spliter) > 0 {
		split = spliter[0]
	}
	broken := strings.Split(theStr, string(split))
	one, _ := strconv.Atoi(broken[0])
	two, _ := strconv.Atoi(broken[1])
	return int16(one), int16(two)
}

func PrepareSplitStringTwoInts(theStr string, spliter ...rune) (int, int) {
	var split = ' '
	if len(spliter) > 0 {
		split = spliter[0]
	}
	broken := strings.Split(theStr, string(split))
	one, _ := strconv.Atoi(broken[0])
	two, _ := strconv.Atoi(broken[1])
	return one, two
}
