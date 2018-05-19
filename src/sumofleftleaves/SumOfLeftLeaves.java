package sumofleftleaves;

public class SumOfLeftLeaves {
	int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeavesRec(root, false);
    }
    
    public int sumOfLeavesRec(TreeNode node, boolean left) {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null && left)
            return node.val;
        else
            return (sumOfLeavesRec(node.left, true) + sumOfLeavesRec(node.right, false));
    }
}
