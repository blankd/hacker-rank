package main

import (
	"fmt"
	"main/problem/solving/algorithms/datastructures"
	"main/util"
	"main/util/reading"
	"os"
)

func main() {
	theFile, err := os.Open(os.Args[1])
	if err != nil {
		panic(err)
	}

	var lines = reading.PrepareIntArray(theFile)

	correctAnswer, err := os.Open(os.Args[2])
	if err != nil {
		panic(err)
	}
	var answer = datastructures.ReverseArray(lines)

	fmt.Println(util.TestMatchIntArr(correctAnswer, answer))

	err = correctAnswer.Close()
	if err != nil {
		panic(err)
	}
	err = theFile.Close()
	if err != nil {
		fmt.Println("Error closing file")
		panic(err)
	}
}
