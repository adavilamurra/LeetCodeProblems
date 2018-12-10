# 667. Beautiful Arrangement II
Given two integers `n` and `k`, you need to construct a list which contains `n` different positive integers ranging from `1` to `n` and obeys the following requirement: 
Suppose this list is [a1, a2, a3, ... , an], then the list [|a1 - a2|, |a2 - a3|, |a3 - a4|, ... , |an-1 - an|] has exactly `k` distinct integers.

If there are multiple answers, print any of them.

**Example:**
```
Input: n = 3, k = 1
Output: [1, 2, 3]
```

### IDEAL
```
* Identify the problem
* Define your goal
* Explore possible strategies
* Anticipate outcomes and act
* Look and learn
```

### Duke's 7 Steps
```
1. Work some small instances by hand
2. Write down what you did
3. Find patterns
4. Check by hand
5. Translate to code
6. Run test cases
7. Debug failed test cases
```

## Solving this problem with IDEAL and Duke's 7 steps
For this problem, I will create a list with integers that go from 1 to `n`. The trick is that every consecutive tuple must have `k` distinct elements. 

An example would be: 
**Test 1:**
```
Input: n = 3, k = 2
Output: [1, 3, 2]
```

I think I would approach this problem by first creating an array with `n` elements. Then I would fill out the array for it to go from `1` to `n`. Then if I reverse the subarray  from `1` to `n-1`. Then that would mean that `k` is 1. If I reverse the subarray from `2` to `n-2` then `k` would be 2. So depending on the value of k, that would be the number of times we would reverse subarrays starting on the `k` index and ending in the `n-k` index.
At the end we just return the array where we have been doing all the changes.