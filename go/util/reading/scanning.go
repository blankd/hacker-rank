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

func PrepareArrayOfInt32Arrays(reader io.Reader) [][]int32 {
	var ret [][]int32
	scanning := bufio.NewScanner(reader)
	for scanning.Scan() {
		var row []int32
		for _, strInt := range strings.Split(scanning.Text(), " ") {
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

func PrepareArrayOfInt64Arrays(reader io.Reader) [][]int64 {
	var ret [][]int64
	scanning := bufio.NewScanner(reader)
	for scanning.Scan() {
		var row []int64
		for _, strInt := range strings.Split(scanning.Text(), " ") {
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
