package main

import (
	"fmt"
	"main/problem/solving/algorithms/datastructures"
	"main/util"
	"main/util/reading"
	"os"
)

func main() {
	//theFile, err := os.Open(os.Args[1])
	theFile, err := os.Open("testing/2d_arr_input_3.txt")
	if err != nil {
		panic(err)
	}

	var lines = reading.PrepareArrayOfInt64Arrays(theFile)

	//correctAnswer, err := os.Open(os.Args[2])
	correctAnswer, err := os.Open("testing/2d_arr_solution_3.txt")
	if err != nil {
		panic(err)
	}

	var answer = datastructures.MaxHourGlass(lines)

	fmt.Println(util.TestSingleAnswerInt64(correctAnswer, answer))

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
