# 442. Find All Duplicates in an Array
Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements that appear twice in this array.

## Questions for interviewer
These are all the questions I would ask:
* Is the input always a list of integers, or can ir be of different types?
* How long can the list be?
* Can the list be empty? How should we handle that?
* Can elements appear three times in one list?

## Solving this problem with IDEAL and Duke's 7 steps
These are all the steps I took to try to solve this problem:

### IDEAL
```
* Identify the problem
* Define your goal
* Explore possible strategies
* Anticipate outcomes and act
* Look and learn
```
#### Identify the problem
The problem here is that I need to analyze a list of integers and check how many times each element appears.

#### Define your goal
The goal of this problem is to return a list of all the integers that appear twice in the list.

#### Explore possible strategies
See Duke's 7 steps below.

#### Anticipate outcomes and act
See Duke's 7 steps below.

#### Look and learn
Thinking of the goal and trying out the different strategies is very helpful. Tracing the code also helped a lot.

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

#### Work some small instances by hand
*Input:* nums = [1,2,3,4,4,2]
*Output:* [2,4]

#### Write down what you did
I iterated through the list of integers and kept a count of how many times each integer appeared. 

If an element appeard twice, I added it to a new list.

#### Find patterns
There must be a loop to iterate through the list of integers.

There are conditions (to check if an integer already appeared).

We need an additional list to store the data we will return.

#### Check by hand
Let's say we have a list of integers: [5,6,1,5]

If we go though the list, we can see that the number 5 has appeared only once, then we check that the number 6 has also appeared only once, then the number 1 has also appeared only once, then when we get to number 5 again we now it had already appeared before, so we add it to the new list.

#### Translate to code
Look at the code in the file: problem.java

#### Run test cases
*Input:* words = []
*Output:* []

*Input:* words = [1]
*Output:* []

*Input:* nums = [1,2,3,4,4,2]
*Output:* [2,4]

#### Debug failed test cases
I would have to check if an element can appear three times, because with my code, when I see that an element appeared twice, I added to the list. This means that if an element appears three times, it would be added to the list when I see it for the second time, and this would be wrong. We need to handle this.
