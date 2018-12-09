# 553. Optimal Division
Given a list of positive integers, the adjacent integers will perform the float division. For example, [2,3,4] -> 2 / 3 / 4.

However, you can add any number of parenthesis at any position to change the priority of operations. You should find out how to add parenthesis to get the maximum result, and return the corresponding expression in string format. Your expression should NOT contain redundant parenthesis.

**Example:**
```
Input: [1000,100,10,2]
Output: "1000/(100/10/2)"
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
This problem is interesting. The problem is that I need to find the division that will be optimal (highest) when receiving a list of integers. My goal is to compare some divisions and see where I should add the pairs of parenthesis to get the maximum result. The way I think this should be completed is focusing more on the calculations I should make. If we think about how divisions work, if we want to find the maxmimum result of X/Y we should try to make Y as small as possible. On that same note, if we have X/Y/Z, we should maximize (Y/Z) so that the result of X/Y/Z is maximized.
We can do this by making sure the first number is followed by "/(" and then iterate through the list of integers and add a "/" between each one of them. After finishing the iterations, just add a closing parenthesis after the last number of the list.
This would give us the result. It is important to have base cases just in case the list is empty or has only one or two elements.

An example would be: 
**Test 1:**
```
Input: [500,200,20,5]
Output: "500/(200/20/5)"
```