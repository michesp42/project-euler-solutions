#!/usr/bin/env lua

-- If we list all the natural numbers below 10 that are multiples of 3 or 5,
-- we get 3, 5, 6 and 9. The sum of these multiples is 23.
--
-- Find the sum of all the multiples of 3 or 5 below 1000.

-- Solution using good old for loop.
local function solution()
  local sum = 0

  for i = 3, 999 do
    if i % 3 == 0 or i % 5 == 0 then
      sum = sum + i
    end
  end

  return sum
end

-- Sum up the multiples below 1000 of a given number n using the formula for
-- an arithmetic series where the first term is equal to the common
-- difference.
local function sum_mul(num)
  local number_of_multiples = math.floor(999 / num)
  return math.floor(number_of_multiples * (number_of_multiples + 1) * num / 2)
end

-- Calculate the sum of the multiples (below 1000) of 3 and 5 minus the sum of
-- the multiples of 15.We have to subtract the sum of the multiples of 15
-- because the multiples of 5 that are also multiples of 3 will have been
-- added twice, so we have to weed out the duplications.
local function solution_alt()
  return sum_mul(3) + sum_mul(5) - sum_mul(15)
end

print(solution())
print(solution_alt())
