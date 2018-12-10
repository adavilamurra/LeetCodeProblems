# 701. Insert into a Binary Search Tree
Given the root node of a binary search tree (BST) and a value to be inserted into the tree, insert the value into the BST. Return the root node of the BST after the insertion. It is guaranteed that the new value does not exist in the original BST.

Note that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion. You can return any of them.

**Example:**
```
Input:
Given the tree:
        4
       / \
      2   7
     / \
    1   3
And the value to insert: 5

Output: 
         4
       /   \
      2     7
     / \   /
    1   3 5
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
The problem here is that we have a tree and we want to add a value to that tree. The goal is to return the root of the final tree. What I would do to solve this would be to traverse tree from left to right and compare the value of each node to the value that I want to insert. Then I would keep traversing until I reach the end and then I would decide to put it in the left (if root.val > val) or in the right (if root.val < val).
Another way to do it would be to compare the value of the main node to the value that I want to add. If the added value is larger than the root value, then just switch those two and find a new place for the previous root value (you can get it by iterating through the tree again)
We can use recursion here.

An example would be: 
**Test 1:**
```
Input:
Given the tree:
        4
       / \
      2   7
     / \
    1   3
And the value to insert: 5

Output: 
         5
       /   \
      2     7
     / \   
    1   3
         \
          4
```