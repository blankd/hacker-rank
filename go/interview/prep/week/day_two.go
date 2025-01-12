package week

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
