package util

import (
	"io"
	"main/util/reading"
	"strconv"
)

func TestSingleAnswerString(reader io.Reader, what string) bool {
	return what == reading.GetSingleLine(reader)
}
func TestSingleAnswerInt(reader io.Reader, what int) bool {
	ans, _ := strconv.Atoi(reading.GetSingleLine(reader))
	return what == ans
}

func TestSingleAnswerInt32(reader io.Reader, what int32) bool {
	ans, _ := strconv.Atoi(reading.GetSingleLine(reader))
	return what == int32(ans)
}

func TestSingleAnswerInt64(reader io.Reader, what int64) bool {
	ans, _ := strconv.Atoi(reading.GetSingleLine(reader))
	return what == int64(ans)
}

func TestMatchInt32Arr(reader io.Reader, what []int32) bool {
	for ind, line := range reading.PrepareInt32Array(reader) {
		if line != what[ind] {
			return false
		}
	}
	return true
}

func TestMatchIntArr(reader io.Reader, what []int) bool {
	for ind, line := range reading.PrepareIntArray(reader) {
		if line != what[ind] {
			return false
		}
	}
	return true
}
