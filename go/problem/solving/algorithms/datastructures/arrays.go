package datastructures

import (
	"math"
)

func ReverseArray(a []int) []int {
	var ret []int
	for i := len(a) - 1; i >= 0; i-- {
		ret = append(ret, a[i])
	}
	return ret
}

func MaxHourGlass(grid [][]int64) int64 {
	var ret int64 = math.MinInt64
	for x := 0; x < len(grid); x++ {
		for y := 0; y < len(grid[x]); y++ {
			if x+2 < len(grid) && y+2 < len(grid[x]) {
				maxHourGlass := grid[x][y] + grid[x][y+1] + grid[x][y+2] + grid[x+1][y+1] + grid[x+2][y] + grid[x+2][y+1] + grid[x+2][y+2]
				if ret < maxHourGlass {
					ret = maxHourGlass
				}
			}
		}
	}
	return ret
}
