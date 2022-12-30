#include "solution.h"

int solution(void) {
    int sum = 0;

    for (int i = 3; i < 1000; i++) {
        if (i % 3 == 0 || i % 5 == 0) {
            sum += i;
        }
    }

    return sum;
}

int solution_alt() {
    int answer = sum_mul(3) + sum_mul(5) - sum_mul(15);
    return answer;
}

int sum_mul(int num) {
    int number_of_multiples = 999 / num;
    return number_of_multiples * (number_of_multiples + 1) * num / 2;
}
