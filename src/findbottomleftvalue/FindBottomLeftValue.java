package findbottomleftvalue;

public class FindBottomLeftValue {
	Integer flag = null;
    public int findBottomLeftValue(TreeNode root) {
        if (root == null)
            return 0;
        int depth = findDepth(root);
        findRecursive(root, depth);   
        return flag;
    }
    
    public int findDepth(TreeNode root) {
        if (root != null) {
            int leftHeight = findDepth(root.left);
            int rightHeight = findDepth(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
        return 0;
    }
    
    public void findRecursive(TreeNode root, int depth) {
        if (root == null)
            return;
        if (depth == 1 && flag == null)
            flag = root.val;            
        findRecursive(root.left, depth - 1);
        findRecursive(root.right, depth - 1);
    }
}

/*
 * public int findLeftMostNode(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
        root = queue.poll();
        if (root.right != null)
            queue.add(root.right);
        if (root.left != null)
            queue.add(root.left);
    }
    return root.val;
}
*/
