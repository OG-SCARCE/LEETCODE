class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        ArrayList<Integer> l1 = new ArrayList<>();
        HashSet<Integer> s1 = new HashSet<>();

        for (int no : nums1) {
            s1.add(no);
        }

        for (int no : nums2) {
            if (s1.contains(no)) {
                s1.remove(no);
                l1.add(no);
            }
        }

        int[] arr = new int[l1.size()];
        int i = 0;

        for (int num : l1) {
            arr[i++] = num;
        }

        return arr;
    }
}
