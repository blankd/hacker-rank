package week

import (
	"math"
)

func LonelyIntegerSolution(ints []int32) int32 {
	nums := make(map[int32]int32)

	for _, value := range ints {
		if _, ok := nums[value]; !ok {
			nums[value] = 1
		} else {
			nums[value] += 1
		}
	}
	for key, item := range nums {
		if item == 1 {
			return key
		}
	}
	return -1
}

func DiagonalDifferenceSolution(numbers [][]int32) int32 {
	var sumLeft int32
	var sumRight int32

	for index, _ := range numbers {
		sumLeft += numbers[index][index]
	}

	for index := len(numbers) - 1; index >= 0; index-- {
		sumRight += numbers[(len(numbers)-1)-index][index]
	}

	return int32(math.Abs(float64(sumLeft - sumRight)))
}

func FirstCountingSortSolution(numbers []int64) [100]int64 {
	ret := [100]int64{}
	for _, value := range numbers {
		ret[value]++
	}
	return ret
}
