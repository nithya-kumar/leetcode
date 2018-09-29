package longestunivaluepath;
/*
 * https://leetcode.com/problems/longest-univalue-path/solution/
 */
public class LongestUnivaluePath {
	int result;
    public int longestUnivaluePath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        result = 0;
        findLongestUnivaluePath(root);
        return result;        
    }
    
    public int findLongestUnivaluePath(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = findLongestUnivaluePath(node.left);
        int right = findLongestUnivaluePath(node.right);
        int univalueLeft = 0;
        int univalueRight = 0;
        if (node.left != null && node.left.val == node.val) {
            univalueLeft += left + 1;
        }
        if (node.right != null && node.right.val == node.val) {
            univalueRight += right + 1;
        }
        result = Math.max(result, univalueLeft + univalueRight);
        return Math.max(univalueLeft, univalueRight);
    }
}
