/**
 * Problem 1. Multiples of 3 or 5.
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
 * get 3, 5, 6 and 9.
 *
 * The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5
 * below 1000.
 */
package main

import "fmt"

func main() {
	fmt.Println(solution())
	fmt.Println(solutionAlt())
}

// Solution using for-range
func solution() int {
	sum := 0

	for i := range [1000]int{} {
		if i%3 == 0 || i%5 == 0 {
			sum += i
		}
	}

	return sum
}

// Calculate the sum of the multiples (below 1000) of 3 and 5 minus the sum of the multiples of
// 15. We have to subtract the sum of the multiples of 15 because the multiples of 5 that are also
// multiples of 3 will have been added twice, so we have to weed out the duplications.
func solutionAlt() int {
	return sumMul(3) + sumMul(5) - sumMul(15)
}

// Sum up the multiples below 1000 of a given number n using the formula for an
// arithmetic series where the first term is equal to the common difference.
func sumMul(num int) int {
	numberOfMultiples := 999 / num
	return numberOfMultiples * (numberOfMultiples + 1) * num / 2
}
