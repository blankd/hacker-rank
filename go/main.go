package main

import (
	"fmt"
	"main/interview/prep/week"
	"main/util/reading"
	"os"
)

func main() {
	theFile, err := os.Open(os.Args[1])
	if err != nil {
		panic(err)
	}

	week.ConvertTo24HoursSolution(reading.GetNLines(theFile, 1)[0])

	err = theFile.Close()
	if err != nil {
		fmt.Println("Error closing file")
		panic(err)
	}
}
