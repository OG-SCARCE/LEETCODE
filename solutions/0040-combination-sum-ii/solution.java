import java.util.*;

class Solution {

    private void function(int index, int[] nums, int target, List<Integer> current, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) continue;
            if (nums[i] > target) break;

            current.add(nums[i]);
            
            function(i + 1, nums, target - nums[i], current, ans);
            
            current.remove(current.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        
        Arrays.sort(nums);
        
        function(0, nums, target, new ArrayList<>(), ans);
        return ans;
    }
}

