#ifndef SOLUTION_H
#define SOLUTION_H

#include <ranges>

/* Solution using good old for loop. */
int solution();

/*
 * Calculate the sum of the multiples (below 1000) of 3 and 5 minus the sum of
 * the multiples of 15.
 *
 * We have to subtract the sum of the multiples of 15 because the multiples of 5
 * that are also multiples of 3 will have been added twice, so we have to weed
 * out the duplications.
 */
int solutionAlt();

/*
 * Sum up the multiples below 1000 of a given number n using the formula for an
 * arithmetic series where the first term is equal to the common difference.
 */
int sumMul(int num);

/*
 * TODO: Solution using views.
 */
[[deprecated("unimplemented")]] int solutionViews();

#endif // !SOLUTION_H
