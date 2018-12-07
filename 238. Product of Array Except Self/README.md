# 238. Product of Array Except Self
Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

**Example:**
```
Input:  [1,2,3,4]
Output: [24,12,8,6]
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
The problem here is that we are given an array of numbers, and we must find the product of all the elements in the array except the current element. The output should be an array that contains the product already mentioned.
I can think of a possible strategy. One way to do this would be to create a variable to hold the product. Then we could create one array called output which would be a copy of the nums array. This way we can traverse the given array and the created one. The strategy I'm thinking about is one where we can basically compare each element from each array with each other. Starting with the first element in nums, we would start multiplying starting from the second element, then to the third, and keep going until we reach the end of the array. We would store that product in the first index of the output array. Then for the second element in output, we would do the same of multiplying the values from nums, but now we would start at with the first element, and skip the second one (the current one).

We would keep going with this method until the output array is filled. 
This example should work:
```
Input:  [3,1,5,2]
Output: [10,30,6,15]
```

In here we would start with the first element 3 (index 0), so we would multiply 1*5*2 and store that value in the first element of output (index 0), then keep going with the second element 1 (index 1), and multiply 3*5*2 and store that value in the second element (index 1) of output.
This is not the most efficient solution, but it works.