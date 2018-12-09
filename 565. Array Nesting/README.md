# 565. Array Nesting
A zero-indexed array A of length N contains all integers from 0 to N-1. Find and return the longest length of set S, where S[i] = {A[i], A[A[i]], A[A[A[i]]], ... } subjected to the rule below.

Suppose the first element in S starts with the selection of element A[i] of index = i, the next element in S should be A[A[i]], and then A[A[A[i]]]… By that analogy, we stop adding right before a duplicate element occurs in S.

**Example:**
```
Input: A = [5,4,0,3,1,6,2]
Output: 4
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
I like this problem, it seems confusing at first but after working on it you can get more comfortable and know what to do. The problem is that I have an array of integers where all the indexes included in the array are values in the array. My goal is to return the longest length of a set S, where S[i] = {A[i], A[A[i]], A[A[A[i]]], ... }. This means that the set will start with an element that has a specific value, then the next element should be gotten from the index which value is the previous value, and so on...

An example would be: 
**Test 1:**
```
Input: A = [3,1,0,2,4]
Output: 4
```

In this example, we can see that the new set S would start with [3]. Then the next element would be A[3], so it would be 2. Then the next one would be A[2], so it would be 0. Then the next one would be A[0], which means that we would stop here.
```
S[0] = {A[0], A[3], A[2]} = {3, 2, 0}
S[1] = {A[1]} = {1}
S[2] = {A[2], A[0], A[3]} = {0, 3, 2}
S[3] = {A[3], A[2], A[0]} = {2, 0, 3}
S[4] = {A[4]} = {4}
```
The result would be `3` because that's the max number of elements in a set where we do the array nesting. We just have to check if we already visited an index to know when to stop. If we visit one that we had already visited, then that means that that's the end of the nesting and you have to count the number of elements in the set.
