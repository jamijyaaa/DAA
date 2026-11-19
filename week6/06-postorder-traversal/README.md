# Binary Tree Postorder Traversal — LeetCode 145

**Language:** Java  
**Problem:** https://leetcode.com/problems/binary-tree-postorder-traversal/

## 1. Problem

List node values in left, right, root order.

## 2. My Approach

I recursively visit the left and right children before adding the current node to the result. If a node is null, I return immediately.

### Step-by-step example

```text
    1
     \
      2
     /
    3
```
1. The left side of 1 is empty.
2. At node 2, visit its left child 3 and add 3: `[3]`.
3. Add node 2 after its children: `[3, 2]`.
4. Add root 1 last: `[3, 2, 1]`.

Final answer: `[3, 2, 1]`.

### What I found tricky

I must wait until both subtrees are finished before adding a parent. Adding it too early changes the traversal order.

### Cases I would check

- Empty tree (if the problem allows it).
- A tree with one node.
- A tree with only one side.
- The example shown above.

These are useful checks for understanding the algorithm, not a claim that I submitted these cases to LeetCode.

## 3. Time and Space Complexity

**Time Complexity: O(n).** Each node is visited and added once.

**Space Complexity: O(h) auxiliary stack, O(n) result.** The recursion chain has length at most h, and the result contains n elements.

Here `n` means the number of nodes, `h` is the height, `m` is the size of the second tree, and `h1` and `h2` are the two heights. Only the symbols relevant to this problem are used.

## 4. Reflection / Improvement

An iterative solution with stacks is possible in O(n) time, but recursion is shorter and easier for me to follow.

### What I learned

I learned to think about the stopping condition first and then decide what should happen at each node. Writing the example step by step makes it easier to see why the order of operations matters.

## Java Solution

The code is in [Solution.java](Solution.java). It uses the `TreeNode` class provided by LeetCode.
