package rightsideviewoftree;

public class RightSideViewOfTree {
	public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        int currDepth = 0;
        findRightSideView(root, currDepth, result);
        return result;
    }
    
    public void findRightSideView(TreeNode curr, int currDepth, List<Integer> result) {
        if (curr == null)
            return;
        if (currDepth == result.size())
            result.add(curr.val);
        findRightSideView(curr.right, currDepth + 1, result);
        findRightSideView(curr.left, currDepth + 1, result);
    }
}
