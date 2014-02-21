/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if (root == null) {
            return;
        }
        setNext(root);
        if (root.right != null) {
            connect(root.right);
        }
        if (root.left != null) {
            connect(root.left);
        }
    }
    
    public void setNext(TreeLinkNode root) {
        if (root == null) {
            return;
        }
        
        TreeLinkNode findNextFromParent = null;
        if (root.next != null) {
            if (root.next.left != null) {
                findNextFromParent = root.next.left;
            } else if (root.next.right != null) {
                findNextFromParent = root.next.right;
            }
        }
            
        //process right child
        if (root.right != null) {
            root.right.next = findNextFromParent;
        }
        //process left child
        if (root.left != null) {
            if (root.right != null) {
                root.left.next = root.right;
            } else {
                root.left.next = findNextFromParent;
            }
        }

    }
}

