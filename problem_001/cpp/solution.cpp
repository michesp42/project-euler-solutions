#include "solution.hpp"

int solution() {
  int sum{0};

  for (int i{3}; i < 1000; i++) {
    if (i % 3 == 0 || i % 5 == 0) {
      sum += i;
    }
  }

  return sum;
}

int solutionAlt() {
  int answer = sumMul(3) + sumMul(5) - sumMul(15);
  return answer;
}

int sumMul(int num) {
  int numberOfMultiples{999 / num};
  return numberOfMultiples * (numberOfMultiples + 1) * num / 2;
}
