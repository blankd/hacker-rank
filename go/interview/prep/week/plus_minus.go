package week

import (
	"bufio"
	"fmt"
	"io"
	"strconv"
)

func PlusMinusPrepareData(reader io.Reader) []int64 {
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

func PlusMinusRunSolution(vals []int64) {
	var holdCount [3]float32
	var valsLen = float32(len(vals))
	for _, val := range vals {
		if val < 0 {
			holdCount[1]++
		} else if val > 0 {
			holdCount[0]++
		} else {
			holdCount[2]++
		}
	}
	for _, val := range holdCount {
		fmt.Println(val / valsLen)
	}
}
