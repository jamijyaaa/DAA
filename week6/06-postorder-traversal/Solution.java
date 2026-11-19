/** LeetCode 145: Binary Tree Postorder Traversal
 * LeetCode supplies the TreeNode class.
 */
import java.util.*;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        visit(root, result);
        return result;
    }

    private void visit(TreeNode node, List<Integer> result) {
        if (node == null) return;
        visit(node.left, result);
        visit(node.right, result);
        result.add(node.val);
    }
}
