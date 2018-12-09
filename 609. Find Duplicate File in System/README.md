# 609. Find Duplicate File in System
Given a list of directory info including directory path, and all the files with contents in this directory, you need to find out all the groups of duplicate files in the file system in terms of their paths.

A group of duplicate files consists of at least two files that have exactly the same content.

A single directory info string in the input list has the following format:

`"root/d1/d2/.../dm f1.txt(f1_content) f2.txt(f2_content) ... fn.txt(fn_content)"`

It means there are n files (`f1.txt`, `f2.txt` ... `fn.txt` with content `f1_content`, `f2_content` ... `fn_content`, respectively) in directory `root/d1/d2/.../dm`. Note that n >= 1 and m >= 0. If m = 0, it means the directory is just the root directory.

The output is a list of group of duplicate file paths. For each group, it contains all the file paths of the files that have the same content. A file path is a string that has the following format:

`"directory_path/file_name.txt"`

**Example:**
```
["root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"]
Output:  
[["root/a/2.txt","root/c/d/4.txt","root/4.txt"],["root/a/1.txt","root/c/3.txt"]]
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
This problem is very similar to others we have completed that do the same thing: find the duplicate element. In this case the elements are files with directories. What I would do would be to create a HashMap that has a String as a key and a list of Strings as the value. This way I can iterate through each file and look for the content. I will put that content as the key and the file to the list of String values. I would go through each file and see if the content (key) was already added to the HashMap. If it was, then it means that the file is a duplicate, so I would just add that file to the list that is in the values.
After going through the whole list, the HashMap should be filled with keys and values and to get the answer we just have to find all the values (list) that have more than 1 element.
This problem was so similar to the other ones that I just had to follow the same procedure.