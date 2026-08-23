class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        long prev = (long) lower - 1;
        
        for(int num : nums){
            if (num < lower) {
                continue;
            }
            if (num > upper){
                break;
            }
            if ((long) num - prev >= 2) {
                List<Integer> range = new ArrayList<>();
                range.add((int) (prev + 1));
                range.add(num - 1);
                
                ans.add(range);
            }

            prev = num;
        }

        if ((long) upper - prev >= 1) {
            List<Integer> range = new ArrayList<>();

            range.add((int) (prev + 1));
            range.add(upper);
            
            ans.add(range);
        }

    return ans;
    }
}
