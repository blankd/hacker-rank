package main

import (
	"fmt"
	"main/interview/prep/week"
	"main/util"
	"main/util/reading"
	"os"
	"strconv"
)

func main() {
	theFile, err := os.Open(os.Args[1])
	if err != nil {
		panic(err)
	}

	//fmt.Println(week.CaesarCipher("middle-Outz", 2))

	var lines = reading.GetNLines(theFile, 2)
	cipher, err := strconv.Atoi(lines[1])
	if err != nil {
		panic(err)
	}

	answer := week.CaesarCipher(lines[0], int32(cipher))
	correctAnswer, err := os.Open(os.Args[2])
	if err != nil {
		panic(err)
	}
	fmt.Println("Answer:", answer)
	fmt.Println(util.TestSingleLineAnswerString(correctAnswer, answer))

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
