# 890. Find and Replace Pattern
You have a list of words and a pattern, and you want to know which words in words matches the pattern.

A word matches the pattern if there exists a permutation of letters p so that after replacing every letter x in the pattern with p(x), we get the desired word.

(Recall that a permutation of letters is a bijection from letters to letters: every letter maps to another letter, and no two letters map to the same letter.)

Return a list of the words in words that match the given pattern. 

You may return the answer in any order.

## Questions for interviewer
These are all the questions I would ask:
* Is the input always a list of Strings, or can ir be of different types?
* How long can the list be?
* How should I handle words longer or shorter than the pattern?
* How should I handle an empty list?
* Should I return an empty list of no words match the pattern?

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
The problem here is that I need to analyze a list of words and check if each word matches a pattern given.

#### Define your goal
The goal of this problem is to return a list of all the words that match the pattern given.

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
*Input:* words = ["xyzz", "xxxy", "xyyy", "errr", "olll"], pattern = "abbb"
*Output: ["xyyy", "errr", "olll"]

#### Write down what you did
I compared each word from the list of words with the pattern. 

Every time I found a word that would match the pattern, I would add it to a new list.

#### Find patterns
There must be a loop to iterate through the list of words.

There are conditions (comparisons of the pattern and the words).

We need an additional list to store the data we will return.

#### Check by hand
Let's say we have a list of words: ["xyz", "xxy", "wxy"], and the pattern: "abc"

If we look at the character of each word and compare it to the character of the pattern, we must make sure that it appears the same number of times. 
If it does not appear the same number of times, it does not follow the pattern and it will not be added to the new list.

#### Translate to code
Look at the code in the file: problem.java

#### Run test cases
*Input:* words = [], pattern = "ab"
*Output: []

*Input:* words = ["xx"], pattern = "ab"
*Output: []

*Input:* words = ["xyzz", "xxxy", "xyyy", "errr", "olll"], pattern = "abbb"
*Output: ["xyyy", "errr", "olll"]

#### Debug failed test cases
The list of words should have a max of 50 words, which means that the code should handle lists that are larger than that.

The words should have at least 1 character and at most 20 characters of length. The code should also handle empty Strings and words that are larger than 20 characters.
