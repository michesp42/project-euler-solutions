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
  }

  private static int solution() {
    return IntStream.range(3, 1000).filter(x -> x % 3 == 0 || x % 5 == 0).sum();
  }
}
