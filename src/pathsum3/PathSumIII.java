package pathsum3;

public class PathSumIII {
	int count = 0;
    public int pathSum(TreeNode root, int sum) {
        if (root == null)
            return 0;
        return countPath(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
    
    public int countPath(TreeNode node, int sum) {
        int count = 0;
        if (node == null)
            return count;
        if (sum - node.val == 0)
            count ++;
        count += countPath(node.left, sum - node.val);
        count += countPath(node.right, sum - node.val);
        return count;
    }
}
