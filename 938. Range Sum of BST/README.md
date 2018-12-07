# 938. Range Sum of BST
Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).

The binary search tree is guaranteed to have unique values.

**Example:**
```
Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
Output: 32
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
I found this problem to be similar to quite a few I have completed before. The first thing I have to do is to identify the problem. So I have to find the sum of all the nodes with value between L and R. That means that I have to traverse the tree and visit each node and then check if the value of that node falls between L and R. If it does, I will add it to a variable that will keep the sum of all the valid values. We can use recursion to check the left node and then use it again to check the right node.

An example would be: 
**Test 1:**
```
Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
Output: 23
```