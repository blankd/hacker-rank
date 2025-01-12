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

	fmt.Println(week.DiagonalDifferenceSolution(reading.PrepareArrayOfInt32Arrays(theFile)))

	err = theFile.Close()
	if err != nil {
		fmt.Println("Error closing file")
		panic(err)
	}
}
