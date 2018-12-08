# 537. Complex Number Multiplication
Given two strings representing two complex numbers.

You need to return a string representing their multiplication. Note i2 = -1 according to the definition.

**Example:**
```
Input: "1+1i", "1+1i"
Output: "0+2i"
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
This problem is dealing with complex numbers and their multiplication. I will be receiving two strings, each string is a complex number. I need to multiply those two complex numbers and return the product. 

**Test Case:**
```
Input: "1+-1i", "1+-1i"
Output: "0+-2i"
```

Well, just to get started, we can use the equation to multiply complex numbers:
```
(a+bi)(c+di) = ac + adi + bci + bdi^2
```
What I would do would be to divide the string and use a split to separate the real partes from the imaginary ones. this way we can get all the elements we need from that equation. In the end, I would just follow the equation and return this: `ac + adi + bci + bdi^2`.
I think this would be enough to solve this problem.
