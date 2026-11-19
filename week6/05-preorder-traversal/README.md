# Binary Tree Preorder Traversal — LeetCode 144

**Language:** Java  
**Problem:** https://leetcode.com/problems/binary-tree-preorder-traversal/

## 1. Problem

List node values in root, left, right order.

## 2. My Approach

I create a result list. For each node I add its value first, then recursively visit the left subtree and the right subtree. Null nodes are skipped.

### Step-by-step example

```text
    1
     \
      2
     /
    3
```
1. Add root 1: `[1]`.
2. The left subtree is empty.
3. Add 2: `[1, 2]`.
4. Visit the left child 3: `[1, 2, 3]`.

Final answer: `[1, 2, 3]`.

### What I found tricky

The order of the three actions matters. If I add the node after the left call, I accidentally solve inorder traversal instead.

### Cases I would check

- Empty tree (if the problem allows it).
- A tree with one node.
- A tree with only one side.
- The example shown above.

These are useful checks for understanding the algorithm, not a claim that I submitted these cases to LeetCode.

## 3. Time and Space Complexity

**Time Complexity: O(n).** Every node is added exactly once.

**Space Complexity: O(h) auxiliary stack, O(n) result.** The recursion depth is at most h, while the output holds all n values.

Here `n` means the number of nodes, `h` is the height, `m` is the size of the second tree, and `h1` and `h2` are the two heights. Only the symbols relevant to this problem are used.

## 4. Reflection / Improvement

An explicit stack is another O(n)-time solution with O(h) worst-case extra space. It can be useful for very deep trees.

### What I learned

I learned to think about the stopping condition first and then decide what should happen at each node. Writing the example step by step makes it easier to see why the order of operations matters.

## Java Solution

The code is in [Solution.java](Solution.java). It uses the `TreeNode` class provided by LeetCode.
