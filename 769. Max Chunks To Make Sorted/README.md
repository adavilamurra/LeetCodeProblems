# 769. Max Chunks To Make Sorted
Given an array `arr` that is a permutation of `[0, 1, ..., arr.length - 1]`, we split the array into some number of "chunks" (partitions), and individually sort each chunk.  After concatenating them, the result equals the sorted array.

What is the most number of chunks we could have made?

**Example:**
```
Input: arr = [4,3,2,1,0]
Output: 1
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
With this problem we receive an array of integers and we have to find the number of subarrays (chunks) that after being sorted, results in a final sorted array. Our goal is to find that number of subarrays (chunks) that we can sort to try to have a final sorted array.
A simple solution I can think of is creating a variable to hold a max value and also another one with the answer. What we will do with these is first to start iterating through the array and comparing the max value that we have stored, and the current element of the array. If the element is larger than the current max, then replace max with the value of the current element. Then we will be checking if the value of max is equals to the current index, and if that's true, then increment the variable for the answer by 1. Every time we increment by one it means that we already found a valid chunk we were able to sort.
In the end of the iterations, we will know how many chunks we could have made.

An example would be: 
**Test 1:**
```
Input: arr = [1,0,2,3,4]
Output: 4
```