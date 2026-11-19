/** LeetCode 257: Binary Tree Paths
 * LeetCode supplies the TreeNode class.
 */
import java.util.*;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        visit(root, "", result);
        return result;
    }

    private void visit(TreeNode node, String path, List<String> result) {
        if (node == null) return;
        String current = path.isEmpty() ? String.valueOf(node.val)
            : path + "->" + node.val;
        if (node.left == null && node.right == null) {
            result.add(current);
            return;
        }
        visit(node.left, current, result);
        visit(node.right, current, result);
    }
}
