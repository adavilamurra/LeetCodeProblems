class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null) return 0;
        int valid = (root.val <= R && root.val >= L) ? root.val : 0;
        return valid + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
    }
}