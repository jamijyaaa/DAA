# Merge Two Binary Trees — LeetCode 617

**Language:** Java  
**Problem:** https://leetcode.com/problems/merge-two-binary-trees/

## 1. Problem

Combine two trees. If both have a node in the same position, add their values; otherwise keep the node that exists.

## 2. My Approach

If one node is null, I return the other node. If both exist, I add the second value into the first node and recursively merge their left children and right children. This solution modifies the first tree.

### Step-by-step example

```text
Tree 1:       Tree 2:       Result:
    1             2             3
   / \           / \           / \
  3   2         1   3         4   5
 /               \   \       / \   \
5                 4   7     5   4   7
```
1. At the roots: `1 + 2 = 3`.
2. At left children: `3 + 1 = 4`.
3. Keep node 5 because only the first tree has it.
4. Keep node 4 from the second tree where the first has no node.
5. At right children: `2 + 3 = 5`, and keep node 7.

Final level-order result: `[3,4,5,5,4,null,7]`.

### What I found tricky

I have to handle null nodes **before** adding values. I also need to remember that this method changes the first tree, which is allowed for this solution.

### Cases I would check

- Empty tree (if the problem allows it).
- A tree with one node.
- A tree with only one side.
- The example shown above.

These are useful checks for understanding the algorithm, not a claim that I submitted these cases to LeetCode.

## 3. Time and Space Complexity

**Time Complexity: O(n + m) worst-case upper bound.** Only positions where both trees have nodes need recursive merging. Each such pair is processed once; a branch with a missing node is returned immediately. This is at most O(n + m) for tree sizes n and m.

**Space Complexity: O(min(h1, h2)) auxiliary recursion stack.** Recursion continues only while both matching nodes exist, so its depth cannot exceed the smaller tree height. Existing nodes are reused.

Here `n` means the number of nodes, `h` is the height, `m` is the size of the second tree, and `h1` and `h2` are the two heights. Only the symbols relevant to this problem are used.

## 4. Reflection / Improvement

If I wanted to keep both input trees unchanged, I could create new nodes for the merged tree. That would still take O(n + m) worst-case time but could use O(n + m) output storage.

### What I learned

I learned to think about the stopping condition first and then decide what should happen at each node. Writing the example step by step makes it easier to see why the order of operations matters.

## Java Solution

The code is in [Solution.java](Solution.java). It uses the `TreeNode` class provided by LeetCode.
