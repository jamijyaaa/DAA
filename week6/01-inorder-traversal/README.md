# Binary Tree Inorder Traversal — LeetCode 94

**Language:** Java  
**Problem:** https://leetcode.com/problems/binary-tree-inorder-traversal/

## 1. Problem

Return the values in left, root, right order.

## 2. My Approach

I use a recursive helper and a list. If the node is null, I stop. Otherwise I visit its left child, add the current value, and visit its right child.

### Step-by-step example

```text
    1
     \
      2
     /
    3
```
1. Start at 1. Its left child is empty.
2. Add 1: `[1]`.
3. Go to 2, then first visit its left child 3: `[1, 3]`.
4. Add 2: `[1, 3, 2]`. The right child is empty.

Final answer: `[1, 3, 2]`.

### What I found tricky

I needed to remember that the root comes **between** the left and right calls. Putting `result.add` first would give preorder, not inorder.

### Cases I would check

- Empty tree (if the problem allows it).
- A tree with one node.
- A tree with only one side.
- The example shown above.

These are useful checks for understanding the algorithm, not a claim that I submitted these cases to LeetCode.

## 3. Time and Space Complexity

**Time Complexity: O(n).** Each node is processed once, and adding to the list takes constant amortized time.

**Space Complexity: O(h) auxiliary stack, O(n) result.** Recursive calls go at most as deep as the tree height h. The returned list stores n values.

Here `n` means the number of nodes, `h` is the height, `m` is the size of the second tree, and `h1` and `h2` are the two heights. Only the symbols relevant to this problem are used.

## 4. Reflection / Improvement

An iterative version with a stack also takes O(n) time and O(h) auxiliary space. Morris traversal can reduce extra traversal space to O(1), but it is harder to understand and temporarily changes pointers.

### What I learned

I learned to think about the stopping condition first and then decide what should happen at each node. Writing the example step by step makes it easier to see why the order of operations matters.

## Java Solution

The code is in [Solution.java](Solution.java). It uses the `TreeNode` class provided by LeetCode.
