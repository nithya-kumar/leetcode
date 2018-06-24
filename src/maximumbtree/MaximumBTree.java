package maximumbtree;
/*
 * https://leetcode.com/problems/maximum-binary-tree/description/
 */
public class MaximumBTree {
	public TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode root = constructTree(nums, 0, nums.length);
        return root;
    }
    
    public TreeNode constructTree(int[] nums, int start, int end) {
        if (start == end) {
            return null;
        }
        int max = findMax(nums, start, end);
        TreeNode node = new TreeNode(nums[max]);
        node.left = constructTree(nums, start, max);
        node.right = constructTree(nums, max + 1, end);
        return node;
    }
    public int findMax(int[] nums, int start, int end) {
        int max = start;
        for (int i = start; i < end; i ++) {
            if (nums[i] > nums[max]) {
                max = i;
            }
        }
        return max;
    }
}
