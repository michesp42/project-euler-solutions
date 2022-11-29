/// Problem 1. Multiples of 3 or 5.
/// If we list all the natural numbers below 10 that are multiples of 3 or 5, we
/// get 3, 5, 6 and 9.
///
/// The sum of these multiples is 23.Find the sum of all the multiples of 3 or 5
/// below 1000.

fn main() {
    println!("{}", solution());
    println!("{}", solution_alt());
}

/// Solution using iterators. Nice and easy.
fn solution() -> u64 {
    (1..1000).filter(|x| x % 3 == 0 || x % 5 == 0).sum()
}

/// Calculate the sum of the multiples (below 1000) of 3 and 5 minus the sum of the multiples of
/// 15. We have to subtract the sum of the multiples of 15 because the multiples of 5 that are also
/// multiples of 3 will have been added twice, so we have to weed out the duplications.
fn solution_alt() -> u64 {
    sum_mul(3) + sum_mul(5) - sum_mul(15)
}

/// Sum up the multiples below 1000 of a given number n using the formula for an arithmetic series
/// where the first term is equal to the common difference.
fn sum_mul(num: u64) -> u64 {
    let number_of_multiples = 999 / num;
    number_of_multiples * (number_of_multiples + 1) * num / 2
}
