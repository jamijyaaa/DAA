# Minimum Depth of Binary Tree — LeetCode 111

**Language:** Java  
**Problem:** https://leetcode.com/problems/minimum-depth-of-binary-tree/

## 1. Problem

Find the number of nodes on the shortest root-to-leaf path. A leaf has no children.

## 2. My Approach

I stop with 0 for an empty tree. If a node has only one child, I must continue through that existing child. If it has two children, I take the smaller depth and add 1.

### Step-by-step example

```text
    1
   /
  2
 /
3
```
1. Node 3 is a leaf, so its depth is 1.
2. Node 2 has no right child, so its depth is `1 + 1 = 2`.
3. Root 1 also has no right child, so its depth is `1 + 2 = 3`.

Final answer: `3`, not `1`.

### What I found tricky

The tricky case is a missing child. Using `1 + min(left, right)` everywhere would incorrectly count an empty branch as a leaf. I handle single-child nodes separately.

### Cases I would check

- Empty tree (if the problem allows it).
- A tree with one node.
- A tree with only one side.
- The example shown above.

These are useful checks for understanding the algorithm, not a claim that I submitted these cases to LeetCode.

## 3. Time and Space Complexity

**Time Complexity: O(n).** In the worst case, recursion visits every node before finding the minimum leaf depth.

**Space Complexity: O(h) auxiliary stack.** Only one recursive call chain is active at a time, up to height h.

Here `n` means the number of nodes, `h` is the height, `m` is the size of the second tree, and `h1` and `h2` are the two heights. Only the symbols relevant to this problem are used.

## 4. Reflection / Improvement

Breadth-first search can stop at the first leaf and may visit fewer nodes. Its worst-case time remains O(n), with O(w) queue space.

### What I learned

I learned to think about the stopping condition first and then decide what should happen at each node. Writing the example step by step makes it easier to see why the order of operations matters.

## Java Solution

The code is in [Solution.java](Solution.java). It uses the `TreeNode` class provided by LeetCode.
