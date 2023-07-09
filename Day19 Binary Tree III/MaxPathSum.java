class Solution {
    public int MaxSum = Integer.MIN_VALUE;
    public int Solve(TreeNode root){
        if(root == null) return 0;
        int leftSum = Math.max(0,Solve(root.left));
        int rightSum = Math.max(0,Solve(root.right));
        MaxSum= Math.max(MaxSum, leftSum+ rightSum+root.val);
        return root.val + Math.max(leftSum, rightSum);
    }
    public int maxPathSum(TreeNode root) {
        if(root.left == null && root.right == null) return root.val;
        int ans = Solve(root);
        MaxSum = Math.max(MaxSum, ans);
        return MaxSum;
    }
}