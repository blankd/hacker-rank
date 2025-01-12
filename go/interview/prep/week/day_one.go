package week

import (
	"fmt"
	"math"
	"strconv"
	"strings"
)

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

func ConvertTo24HoursSolution(timeStr string) string {
	var theSplit []string = strings.Split(timeStr, ":")
	var hours, _ = strconv.ParseInt(theSplit[0], 10, 64)
	var isPm = strings.EqualFold(theSplit[2][2:], "PM")
	if isPm && hours != 12 {
		hours = hours + 12
	} else if !isPm && hours == 12 {
		hours = hours - 12
	}

	return fmt.Sprintf("%02d:%s:%s", hours, theSplit[1], theSplit[2][:2])
}
