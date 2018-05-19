package sametree;

public class SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if ((p == null && q != null) || (p != null && q == null))
            return false;
        return isSameTreeRec(p, q);        
    }
    
    public boolean isSameTreeRec(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if ((p == null && q != null) || (p != null && q == null))
            return false;
        if (p.val == q.val)
            return true;
        return isSameTreeRec(p.left, q.left) && isSameTreeRec(p.right, q.right);
    }
}
