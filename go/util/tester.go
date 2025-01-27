package util

import (
	"fmt"
	"io"
	"main/util/reading"
)

func TestSingleLineAnswerString(reader io.Reader, what string) bool {
	line := reading.GetSingleLine(reader)
	fmt.Println(line)
	return what == line
}
