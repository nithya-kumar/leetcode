package pathsum2;

public class PathSumII {
	List<List<Integer>> result = new ArrayList<List<Integer>>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null)
            return result;
        List<Integer> list = new ArrayList<Integer>();
        pathSum(root, sum, list);
        return result;
    }
    
    public void pathSum(TreeNode node, int sum, List<Integer> list) {
        if (node == null)
            return;
        list.add(node.val);
        if (node.left == null && node.right == null && sum - node.val == 0)
            result.add(new ArrayList(list));
        else {
            pathSum(node.left, sum - node.val, list);
            pathSum(node.right, sum - node.val, list);
        }
        list.remove(list.size() - 1);
    }
}
