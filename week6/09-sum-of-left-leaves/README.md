# Sum of Left Leaves — LeetCode 404

**Language:** Java  
**Problem:** https://leetcode.com/problems/sum-of-left-leaves/

## 1. Problem

Add the values of nodes that are both leaves and left children of their parent.

## 2. My Approach

For each node I inspect its left child. If that child exists and has no children, I add its value. Otherwise I search inside that left subtree. I also search the right subtree because it may contain left leaves.

### Step-by-step example

```text
    3
   / \
  9  20
     / \
    15  7
```
1. At root 3, its left child 9 is a leaf: sum = 9.
2. Visit the right subtree rooted at 20.
3. Its left child 15 is a leaf: sum = `9 + 15 = 24`.
4. Node 7 is a right leaf, so it does not count.

Final answer: `24`.

### What I found tricky

Not every left child is a left **leaf**. I check that it has no children before adding it. I also cannot skip right subtrees because they may contain left leaves deeper down.

### Cases I would check

- Empty tree (if the problem allows it).
- A tree with one node.
- A tree with only one side.
- The example shown above.

These are useful checks for understanding the algorithm, not a claim that I submitted these cases to LeetCode.

## 3. Time and Space Complexity

**Time Complexity: O(n).** Every node is visited at most once, and the leaf check takes constant time.

**Space Complexity: O(h) auxiliary stack.** The deepest recursive call chain follows a path of height h.

Here `n` means the number of nodes, `h` is the height, `m` is the size of the second tree, and `h1` and `h2` are the two heights. Only the symbols relevant to this problem are used.

## 4. Reflection / Improvement

I could pass a boolean saying whether the current node is a left child. That is another O(n)-time, O(h)-stack solution, not a faster complexity.

### What I learned

I learned to think about the stopping condition first and then decide what should happen at each node. Writing the example step by step makes it easier to see why the order of operations matters.

## Java Solution

The code is in [Solution.java](Solution.java). It uses the `TreeNode` class provided by LeetCode.
