package findsymmetrictree;

public class FindSymmetricTree {
	public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        boolean isSymmetric = findSymmetric(root.left, root.right);
        return isSymmetric;
    }
    
    public boolean findSymmetric(TreeNode left, TreeNode right) {
        if (left == null || right == null)
            return left == right;
        if (left.val != right.val)
            return false;
        return findSymmetric(left.left, right.right) && findSymmetric(left.right, right.left);        
    }
}
