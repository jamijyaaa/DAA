# Binary Tree Paths — LeetCode 257

**Language:** Java  
**Problem:** https://leetcode.com/problems/binary-tree-paths/

## 1. Problem

Return every root-to-leaf path as a string with `->` between values.

## 2. My Approach

I carry a string showing the path so far. At each node I append its value. If the node is a leaf, I save the completed path. Otherwise I continue to its children.

### Step-by-step example

```text
    1
   / \
  2   3
   \
    5
```
1. Start at 1: path is `"1"`.
2. Go left to 2: `"1->2"`.
3. Go to leaf 5: save `"1->2->5"`.
4. Return to 1 and go right to leaf 3: save `"1->3"`.

Final answer: `["1->2->5", "1->3"]`.

### What I found tricky

The important part is to save a path only at a leaf. I also need to add `->` only after the first value, so the string does not start with an arrow.

### Cases I would check

- Empty tree (if the problem allows it).
- A tree with one node.
- A tree with only one side.
- The example shown above.

These are useful checks for understanding the algorithm, not a claim that I submitted these cases to LeetCode.

## 3. Time and Space Complexity

**Time Complexity: O(nh) for bounded-length node values.** There are n node visits. Creating a new path string can copy up to h values at each visit, so the total can reach O(nh). If values have many digits, string length also matters.

**Space Complexity: O(h) recursion stack plus O(nh) stored path characters in the worst case.** The recursion depth is h. Returned strings can contain many repeated prefixes, so the total output can be much larger than n.

Here `n` means the number of nodes, `h` is the height, `m` is the size of the second tree, and `h1` and `h2` are the two heights. Only the symbols relevant to this problem are used.

## 4. Reflection / Improvement

Using one StringBuilder with backtracking avoids copying the prefix at every recursive call. It still must spend time creating the final output strings; its running time is O(n + total output characters).

### What I learned

I learned to think about the stopping condition first and then decide what should happen at each node. Writing the example step by step makes it easier to see why the order of operations matters.

## Java Solution

The code is in [Solution.java](Solution.java). It uses the `TreeNode` class provided by LeetCode.
