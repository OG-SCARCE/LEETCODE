class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> last = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);

            if (!first.containsKey(nums[i])){
                first.put(nums[i], i);
            }
            last.put(nums[i], i);
        }

        int ans = 0;

        for(int x : count.keySet()){

            int occurences = count.get(x);
            int firstIndex = first.get(x);
            int lastIndex = last.get(x);

            if (occurences == (lastIndex - firstIndex) + 1) {
                ans++;
            }
        }

        return ans;
    }
}
