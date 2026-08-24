import java.util.*;

class Solution {
    Set<List<Integer>> sets = new HashSet<>();

    void function(int[] arr, int idx, int target,
                  List<Integer> current,
                  List<List<Integer>> ans) {
        

        if (target == 0) {
            if (!sets.contains(new ArrayList<>(current))) {
                sets.add(new ArrayList<>(current));
                ans.add(new ArrayList<>(current));
                return;
            }
        }

        if (idx == arr.length || target < 0) {
            return;
        }

        // 1. Select current + move next
        current.add(arr[idx]);
        function(arr, idx + 1, target - arr[idx], current, ans);

        // 2. Select current + don't move
        function(arr, idx, target - arr[idx], current, ans);

        // Backtrack
        current.remove(current.size() - 1);

        // 3. Skip current + move next
        function(arr, idx + 1, target, current, ans);
    }

    public List<List<Integer>> combinationSum(
            int[] candidates,
            int target) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combin = new ArrayList<>();

        function(
                candidates,
                0,
                target,
                combin,   
                ans       
        );

        return ans;
    }
}
