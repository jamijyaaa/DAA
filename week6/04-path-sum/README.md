# Path Sum — LeetCode 112

**Language:** Java  
**Problem:** https://leetcode.com/problems/path-sum/

## 1. Problem

Check if a path from the root to any leaf adds up to the target number.

## 2. My Approach

I subtract each node value from the remaining target. When I reach a leaf, I check whether its value equals the amount still needed. I search the left or right subtree.

### Step-by-step example

```text
      5
     / \
    4   8
   /     \
  11      4
 /  \
7    2
```
Target: `22`.
1. At 5, remaining target is `22 - 5 = 17`.
2. Go left to 4: remaining `17 - 4 = 13`.
3. Go left to 11: remaining `13 - 11 = 2`.
4. The path through 7 does not match, but the leaf 2 matches.

Final answer: `true`, because `5 + 4 + 11 + 2 = 22`.

### What I found tricky

I have to check the target **at a leaf**. Finding the correct sum at an internal node is not enough because the problem requires a full root-to-leaf path.

### Cases I would check

- Empty tree (if the problem allows it).
- A tree with one node.
- A tree with only one side.
- The example shown above.

These are useful checks for understanding the algorithm, not a claim that I submitted these cases to LeetCode.

## 3. Time and Space Complexity

**Time Complexity: O(n).** In the worst case I may need to explore all nodes before returning false. Short-circuit `||` can stop earlier if a matching path is found.

**Space Complexity: O(h) auxiliary stack.** Each recursive branch follows one path, and the maximum depth is h.

Here `n` means the number of nodes, `h` is the height, `m` is the size of the second tree, and `h1` and `h2` are the two heights. Only the symbols relevant to this problem are used.

## 4. Reflection / Improvement

An iterative depth-first search with a stack also has O(n) worst-case time. It can avoid recursion but is not asymptotically faster.

### What I learned

I learned to think about the stopping condition first and then decide what should happen at each node. Writing the example step by step makes it easier to see why the order of operations matters.

## Java Solution

The code is in [Solution.java](Solution.java). It uses the `TreeNode` class provided by LeetCode.
