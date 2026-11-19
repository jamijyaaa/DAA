/** LeetCode 144: Binary Tree Preorder Traversal
 * LeetCode supplies the TreeNode class.
 */
import java.util.*;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        visit(root, result);
        return result;
    }

    private void visit(TreeNode node, List<Integer> result) {
        if (node == null) return;
        result.add(node.val);
        visit(node.left, result);
        visit(node.right, result);
    }
}
