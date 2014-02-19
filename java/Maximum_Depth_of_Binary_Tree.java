/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lenL = 0;
        int lenR = 0;
        if (root.left != null) {
            lenL = maxDepth(root.left);
        }
        if (root.right != null) {
            lenR = maxDepth(root.right);
        }
        return lenL >= lenR ? (lenL + 1) : (lenR + 1);
    }
}

