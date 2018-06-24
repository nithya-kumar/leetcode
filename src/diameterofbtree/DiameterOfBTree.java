package diameterofbtree;
/*
 * https://leetcode.com/problems/diameter-of-binary-tree/description/
 */
public class DiameterOfBTree {
	int dia;
    public int diameterOfBinaryTree(TreeNode root) {
        dia = 1;
        depth(root);
        return dia - 1;
    }
    
    public int depth(TreeNode node) {
        if (node == null)
            return 0;
        int left = depth(node.left);
        int right = depth(node.right);
        dia = Math.max(dia, left + right + 1);
        return Math.max(left, right) + 1;
    }
}
