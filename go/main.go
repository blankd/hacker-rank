package main

import (
	"fmt"
	"main/interview/prep/week"
	"main/util"
	"main/util/reading"
	"os"
)

func main() {
	theFile, err := os.Open(os.Args[1])
	if err != nil {
		panic(err)
	}

	var lines = reading.GetNLines(theFile, 2)

	correctAnswer, err := os.Open(os.Args[2])
	if err != nil {
		panic(err)
	}
	var answers []int32
	for _, line := range lines {
		n, m := reading.PrepareSplitStringTwoInt32s(line)
		answers = append(answers, week.TowerBreakers(n, m))
	}

	fmt.Println(util.TestMatchInt32Arr(correctAnswer, answers))

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
