# 856. Score of Parentheses
Given a balanced parentheses string `S`, compute the score of the string based on the following rule:

`()` has score 1
`AB` has score `A + B`, where `A` and `B` are balanced parentheses strings.
`(A)` has score `2 * A`, where `A` is a balanced parentheses string.

**Example 1:**
```
Input: "()"
Output: 1
```

**Example 2:**
```
Input: "(())"
Output: 2
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
We have a problem that is similar to the problem of finding out if a string of parenthesis is balanced. This problem is asking for a score of balanced parenthesis, but there is a catch. there are different ways of scoring these balanced parenthesis. So our goal is to find the final score of the string of parenthesis. If we calculate how depth a parenthesis is, we can figure out a score that will be updated continuously. The depth should be the number of balanced parentheses surrounding a position.
If we see an opening parenthesis, then we increase our depth, we can use a stack to store information, so here we would push a 0 because that would be the new depth. When we see a closing bracket, we add twice the score of the previous part. We pop the stack twice and then push one of those pops plus the maximum of 2 times the other pop and 1 (we get the 1 when there's a `()`)
If we keep doing this we will be incrementing the score and the last pop of the stack should have the final score.

An example would be: 
**Test 1:**
```
Input: "()()"
Output: 2
```

**Test 2:**
```
Input: "(()(()))"
Output: 6
```