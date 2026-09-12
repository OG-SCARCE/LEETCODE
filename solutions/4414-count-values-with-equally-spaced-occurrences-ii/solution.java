class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        int ans = 0;

        for(ArrayList<Integer> x : map.values()){
            if(x.size() < 3){
                continue;
            }

            int gap = x.get(1) - x.get(0);

            boolean flag = true;

            for(int i = 2; i < x.size(); i++){
                int currGap = x.get(i) - x.get(i - 1);

                if(currGap != gap){
                    flag = false;
                    break;
                }
            }
            if(flag){
                ans++;
            }
        }
        return ans;
    }
}
