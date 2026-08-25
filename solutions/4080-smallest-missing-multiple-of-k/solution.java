class Solution {
    public int missingMultiple(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for( int x : nums){
            list.add(x);
        }
        boolean flag = true;
        int counter = 1;
        while(flag){
            int elt = k*counter;
            if(!list.contains(elt)){
                flag = false;
                return elt;
            } else {
                counter++;
            }
        }
        return -1;
    }
}
