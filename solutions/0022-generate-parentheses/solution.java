class Solution {

    private void function(int n, int a, int b, String s, List<String> ans) {

        if (a == n && b == n) {
            ans.add(s);
            return;
        }

        if (a < n) {
            function(n, a + 1, b, s + "(", ans);
        }

        if (b < a) {
            function(n, a, b + 1, s + ")", ans);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();

        function(n, 0, 0, "", ans);

        return ans;
    }
}
