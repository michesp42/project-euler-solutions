#!/usr/bin/env python3

"""
Problem 1. Multiples of 3 and 5.

If we list all the natural numbers below 10 that are multiples of 3 or 5, we
get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
"""


def solution() -> int:
    """Solution to Problem 1 using generators."""
    return sum(n for n in range(3, 1000) if n % 3 == 0 or n % 5 == 0)


def sum_mul(num: int) -> int:
    """
    Sum up the multiples below 1000 of a given number n using the formula for
    an arithmetic series where the first term is equal to the common
    difference.
    """
    number_of_multiples: int = 999 // num
    return number_of_multiples * (number_of_multiples + 1) * num // 2


def solution_alt() -> int:
    """
    Calculate the sum of the multiples (below 1000) of 3 and 5 minus the sum of
    the multiples of 15.We have to subtract the sum of the multiples of 15
    because the multiples of 5 that are also multiples of 3 will have been
    added twice, so we have to weed out the duplications.
    """
    return sum_mul(3) + sum_mul(5) - sum_mul(15)


if __name__ == "__main__":
    print(solution())
    print(solution_alt())
