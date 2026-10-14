class Solution {
    public int helper(TreeNode root, boolean isLeft) {
        if (root.left == null && root.right == null && isLeft) return root.val;

        int sum = 0;

        if (root.left != null) sum += helper(root.left, true);
        if (root.right != null) sum += helper(root.right, false);

        return sum;
    }

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        return helper(root, false);
    }
}
