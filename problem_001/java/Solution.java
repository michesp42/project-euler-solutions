import java.util.stream.IntStream;

/**
 * Problem 1. Multiples of 3 or 5.
 *
 * <p>If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and
 * 9.
 *
 * <p>The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Solution {
  public static void main(String[] args) {
    System.out.println(solution());
    System.out.println(solutionAlt());
  }

  /**
   * Solution using streams.
   *
   * @return the sum of multiples of 3 or 5 below 1000.
   */
  private static int solution() {
    return IntStream.range(3, 1000).filter(x -> x % 3 == 0 || x % 5 == 0).sum();
  }

  /**
   * Calculate the sum of the multiples (below 1000) of 3 and 5 minus the sum of the multiples of
   * 15. We have to subtract the sum of the multiples of 15 because the multiples of 5 that are also
   * multiples of 3 will have been added twice, so we have to weed out the duplications.
   *
   * @return the sum of multiples of 3 or 5 below 1000.
   */
  private static int solutionAlt() {
    return sumMul(3) + sumMul(5) - sumMul(15);
  }

  /**
   * Sum up the multiples below 1000 of a given number using the formula for an arithmetic series
   * where the first term is equal to the common difference.
   *
   * @param num the number whose multiple will be calculated
   * @return the sum of multiples of 3 or 5 below 1000.
   */
  private static int sumMul(int num) {
    var numberOfMultiples = 999 / num;
    return numberOfMultiples * (numberOfMultiples + 1) * num / 2;
  }
}
