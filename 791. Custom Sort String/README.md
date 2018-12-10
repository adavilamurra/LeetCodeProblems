# 791. Custom Sort String
`S` and `T` are strings composed of lowercase letters. In `S`, no letter occurs more than once.

`S` was sorted in some custom order previously. We want to permute the characters of `T` so that they match the order that `S` was sorted. More specifically, if `x` occurs before `y` in `S`, then `x` should occur before `y` in the returned string.

Return any permutation of `T` (as a string) that satisfies this property.

**Example:**
```
Input: 
S = "cba"
T = "abcd"
Output: "cbad"
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
The problem here is that we have two strings made of lowercase letters. The first one is sorted in some way and the second one should follow the same sorting as the first one. The result should be the second string with the correct sorting.
What I would do first would be to create an array of characters (26) and iterate through the second string and get the character index of each character. Then I would iterate through the first string and do the same thing, but now I will store the index of the character which is in the array of characters (array_chars[S.charAt(i)-'a']) then I would check if this value is larger than 0. If it is, then we would add the current character of the first string to a new string and then we would decrease the value that we checked. It is kind of hard to explain the procedure but in the end you return the new string that was created. So, as a summary: 1. count the characters in the second string. 2. Sort the characters both in T and S by the order of S. 3. Finally, group the characters in T but not in S.