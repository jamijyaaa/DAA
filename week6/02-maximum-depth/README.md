# Maximum Depth of Binary Tree — LeetCode 104

**Language:** Java  
**Problem:** https://leetcode.com/problems/maximum-depth-of-binary-tree/

## 1. Problem

Find how many nodes are on the longest path from the root down to a leaf.

## 2. My Approach

I use recursion. An empty tree has depth 0. For each real node I calculate the depth of both children, take the larger value, and add 1 for the current node.

### Step-by-step example

```text
    3
   / \
  9  20
     / \
    15  7
```
1. Nodes 9, 15, and 7 have depth 1.
2. Node 20 has depth `1 + max(1, 1) = 2`.
3. Root 3 has depth `1 + max(1, 2) = 3`.

Final answer: `3`.

### What I found tricky

At first the important question is whether to count edges or nodes. Here depth counts **nodes**, so even one node has depth 1.

### Cases I would check

- Empty tree (if the problem allows it).
- A tree with one node.
- A tree with only one side.
- The example shown above.

These are useful checks for understanding the algorithm, not a claim that I submitted these cases to LeetCode.

## 3. Time and Space Complexity

**Time Complexity: O(n).** The method visits every node to compare its two subtree depths.

**Space Complexity: O(h) auxiliary stack.** The longest chain of recursive calls is the tree height h; h can be n in a one-sided tree.

Here `n` means the number of nodes, `h` is the height, `m` is the size of the second tree, and `h1` and `h2` are the two heights. Only the symbols relevant to this problem are used.

## 4. Reflection / Improvement

Breadth-first search can also calculate depth in O(n) time and O(w) queue space, where w is the maximum width. It does not improve the worst-case time.

### What I learned

I learned to think about the stopping condition first and then decide what should happen at each node. Writing the example step by step makes it easier to see why the order of operations matters.

## Java Solution

The code is in [Solution.java](Solution.java). It uses the `TreeNode` class provided by LeetCode.
