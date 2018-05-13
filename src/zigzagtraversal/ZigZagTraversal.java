package zigzagtraversal;

public class ZigZagTraversal {
	List<List<Integer>> zigZagList = new ArrayList<List<Integer>>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null)
            return zigZagList;
        int depth = findDepth(root);
        for (int i = 1; i <= depth; i ++) {
            List<Integer> levelList = new ArrayList<Integer>();
            zigZagList.add(levelList);
            if (i % 2 == 0)
                zigZagTraversal(root, i, false, levelList);
            else
                zigZagTraversal(root, i, true, levelList);
        }
        return zigZagList;
    }
    
    public int findDepth(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(findDepth(root.left), findDepth(root.right)) + 1;
    }
    
    public void zigZagTraversal(TreeNode node, int depth, boolean leftToRight, List<Integer> levelList) {
        if (node == null)
            return;
        if (depth == 1)
            levelList.add(node.val);
        else if (depth > 1) {
            if (leftToRight) {
                zigZagTraversal(node.left, depth - 1, leftToRight, levelList);
                zigZagTraversal(node.right, depth - 1, leftToRight, levelList);
            } else {
                zigZagTraversal(node.right, depth - 1, leftToRight, levelList);
                zigZagTraversal(node.left, depth - 1, leftToRight, levelList);
            }
        }
    }
}
