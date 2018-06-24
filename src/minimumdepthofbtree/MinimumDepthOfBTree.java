package minimumdepthofbtree;
/*
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/description/
 */
public class MinimumDepthOfBTree {
	 public int minDepth(TreeNode root) {
	        if (root == null) {
	            return 0;
	        }
	        return findDepth(root, 1);
	    }
	    
	    public int findDepth(TreeNode node, int depth) {
	        if (node == null) {
	            return Integer.MAX_VALUE;
	        }
	        if (node.left == null && node.right == null) {
	            return depth;
	        }
	        int left = findDepth(node.left, depth + 1);
	        int right = findDepth(node.right, depth + 1);
	        return Math.min(left, right);
	    }
}
