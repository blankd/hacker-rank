package util

import (
	"io"
	"main/util/reading"
)

func TestSingleLineAnswerString(reader io.Reader, what string) bool {
	return what == reading.GetSingleLine(reader)
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
