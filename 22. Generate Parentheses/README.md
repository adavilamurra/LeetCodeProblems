# 22. Generate Parentheses
Given *n* pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given *n* = 3, a solution set is:
```
[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
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
This problem seems kind of confusing at first. The problem is that I will have to find all the combinations of well formed parenthesis with a given *n* (*n* will be the pairs of valid parenthesis). My goal is to return an list of Strings (each string should have *n* pairs of parenthesis).
What I could do to solve this would be starting with a small instance of the problem and then work my way up.

Input: *n* = 1
Output:
`[ "()" ]` 

Input: *n* = 2
Output: 
`[ "(())", "()()" ]`

Input: *n* = 3
Output:
`[ "((()))", "(()())", "(())()", "()(())", "()()()"]`

With these test cases we can see that every time *n* increases, the resulting pairs contain the pairs that were already calculated with the decreased *n*. So we can have a loop that goes from 0 to *n* so that we can calculate all of these pairs and use them again. Then the result willl be added to the next calculation so that the combinations keep adding up. At each iteration, we use recursion to be getting the results from each calculation (from 0 to *n*) which would be returning a list of String as well. Then you can start adding the extra parenthesis to the previous calculations so that each String has *n* pairs.