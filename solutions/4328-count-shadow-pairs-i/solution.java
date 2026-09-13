class Solution {
    public long shadowPairs(int[] nums) {
        long ans = 0;
        ArrayList<Integer> st = new ArrayList<>();

        for(int x : nums){
            int l = 0, r = st.size();

            while (l < r){
                int m = (l + r) / 2;

                if(st.get(m) < x){
                    l = m + 1;
                }
                else{
                    r = m;
                }
            }
            ans += l;

            while (!st.isEmpty() && st.get(st.size() - 1) > x){
                st.remove(st.size() - 1);
            }
            st.add(x);
        }
        return ans;
    }
}
