package main

import (
	"fmt"
	"main/interview/prep/week"
	"os"
)

func main() {
	theFile, err := os.Open(os.Args[1])
	if err != nil {
		panic(err)
	}

	week.MinMaxRunSolution(week.PrepareInt64Array(theFile))

	err = theFile.Close()
	if err != nil {
		fmt.Println("Error closing file")
		panic(err)
	}
}
