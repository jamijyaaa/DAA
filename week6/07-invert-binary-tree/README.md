# Invert Binary Tree — LeetCode 226

**Language:** Java  
**Problem:** https://leetcode.com/problems/invert-binary-tree/

## 1. Problem

Mirror a binary tree by swapping the left and right child at every node.

## 2. My Approach

I swap the two children of the current node using a temporary variable. Then I do the same recursively for both children. An empty node needs no work.

### Step-by-step example

```text
Before:          After:
    4               4
   / \             / \
  2   7           7   2
 / \ / \         / \ / \
1  3 6  9        9  6 3  1
```
1. At 4, swap children 2 and 7.
2. At 7, swap 6 and 9.
3. At 2, swap 1 and 3.

The returned root is the same object, but the tree is mirrored.

### What I found tricky

After swapping, I still need to process **both** children. The temporary variable prevents losing one child reference.

### Cases I would check

- Empty tree (if the problem allows it).
- A tree with one node.
- A tree with only one side.
- The example shown above.

These are useful checks for understanding the algorithm, not a claim that I submitted these cases to LeetCode.

## 3. Time and Space Complexity

**Time Complexity: O(n).** Every node is visited once and performs a constant-time swap.

**Space Complexity: O(h) auxiliary stack.** The method changes the existing tree, so it does not allocate a second tree. Recursive calls take at most h frames.

Here `n` means the number of nodes, `h` is the height, `m` is the size of the second tree, and `h1` and `h2` are the two heights. Only the symbols relevant to this problem are used.

## 4. Reflection / Improvement

A queue-based solution also uses O(n) time and O(w) extra space. Neither improves the worst-case time because every node must be swapped.

### What I learned

I learned to think about the stopping condition first and then decide what should happen at each node. Writing the example step by step makes it easier to see why the order of operations matters.

## Java Solution

The code is in [Solution.java](Solution.java). It uses the `TreeNode` class provided by LeetCode.
