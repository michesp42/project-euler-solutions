#!/usr/bin/env julia

"""
Each new term in the Fibonacci sequence is generated by adding the previous two
terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed
four million, find the sum of the even-valued terms.
"""


"""
Return sum of even Fibonacci numbers below 4M using iterative method.
"""
function solutioniterative()
    curr = 0
    nxt = 1
    total = 0

    while curr < 4000000
        if curr % 2 == 0
            total += curr
        end
        curr, nxt = nxt, curr + nxt
    end

    total
end

println(solutioniterative())
