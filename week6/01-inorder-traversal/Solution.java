/** LeetCode 94: Binary Tree Inorder Traversal
 * LeetCode supplies the TreeNode class.
 */
import java.util.*;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        visit(root, result);
        return result;
    }

    private void visit(TreeNode node, List<Integer> result) {
        if (node == null) return;
        visit(node.left, result);
        result.add(node.val);
        visit(node.right, result);
    }
}
