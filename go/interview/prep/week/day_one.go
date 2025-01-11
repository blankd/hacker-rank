package week

import (
	"bufio"
	"fmt"
	"io"
	"math"
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

func MinMaxRunSolution(vals []int64) {
	var smallest int64 = math.MaxInt64
	var largest int64 = 0
	var smallInd int
	var largeInd int
	var minimum int64 = 0
	var maximum int64 = 0
	for ind, val := range vals {
		if val < smallest {
			smallest = val
			smallInd = ind
		}
		if val > largest {
			largest = val
			largeInd = ind
		}
	}

	for ind, val := range vals {
		if ind != largeInd {
			minimum += val
		}

		if ind != smallInd {
			maximum += val
		}
	}

	fmt.Println(minimum, maximum)
}
