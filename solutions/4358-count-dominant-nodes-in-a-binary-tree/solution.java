/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans = 0;
    public int countDominantNodes(TreeNode root) {
        dfs(root);
        return ans;
    }

    private int dfs(TreeNode node){
        if (node == null) return Integer.MIN_VALUE;

        int left = dfs(node.left);
        int right = dfs(node.right);

        int mx = Math.max(node.val,Math.max(left, right));

        if(node.val == mx) ans++;

        return mx;
    }
}
