class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }

        int ans = 0;
        for(ArrayList<Integer> x : map.values()){
            if(x.size() != 3){
                continue;
            }

            int a = x.get(0);
            int b = x.get(1);
            int c = x.get(2);

            if(b - a == c - b){
                ans++;
            }
        }
        return ans;
    }
}
