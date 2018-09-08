package main

import (
	"fmt"
	"math/rand"
)

func main() {

	var numbers []int = rand.Perm(1000)

	fmt.Println(numbers)

	bubbleSort(numbers)
	fmt.Println(numbers)
}

func bubbleUp(numbers []int) {

	for i := 0; i < len(numbers)-1; i++ {

		var first int = numbers[i]
		var second int = numbers[i+1]

		if first > second {

			numbers[i] = second
			numbers[i+1] = first
		}
	}
}

func bubbleSort(numbers []int) {
	for i := 0; i < len(numbers); i++ {
		bubbleUp(numbers)
	}
}
