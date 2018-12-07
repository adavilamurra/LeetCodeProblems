# 495. Teemo Attacking
In LOL world, there is a hero called Teemo and his attacking can make his enemy Ashe be in poisoned condition. Now, given the Teemo's attacking ascending time series towards Ashe and the poisoning time duration per Teemo's attacking, you need to output the total time that Ashe is in poisoned condition.

You may assume that Teemo attacks at the very beginning of a specific time point, and makes Ashe be in poisoned condition immediately.

**Example:**
```
Input: [1,4], 2
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
This looks like a very creative problem. I need to figure out how long Ashe, the enemy, will be in poisoned condition after Teemo, the hero, attacks. My goal is to figure out the total time Ashe is in poisoned condition. 
The input I will receive is an array of integers that contain the time series, and an integer containing the duration of the poison condition of each attack. 
These are some test cases I could use:

**Test Case 1:**
```
Input: [1,2], 2
Output: 3
```

**Test Case 2:**
```
Input: [2,4], 4
Output: 3
```

What I can notice is that if the difference between two consecutive attacks (let's call it *difference*) is larger or equal than the duration of the poison, then you can just add the poison duration twice, because it will definitely last for the whole duration twice. 
If *difference* is smaller than the duration of the poison, then the poison condition will last (*difference* + this whole process again )
Since we may have up to 10000 attack times, we need to keep checking for differences between consecutive attacks, so every time *difference* is smaller than the duration of the poison, we will repeat the whole process to compare the current attack to the next one and determine that *difference* and poison duration.

To test this, we can use the following example:
**Test Case 3:**
```
Input: [2,4,8], 3
Output: 8
```
duration = 3
output = 0
We can see that the difference between the first two attacks is 2 (less than 3), so we will add that differente to the output variable, making it output = 2. After that, we would compare the next two attacks and find that the difference is 4 (more than 3), so we will add the duration twice in the output because two attacks of full poison duration ocurred at time 4 and at time 8. So now the output is 8, and that would be the final answer.