class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int cf = 0;
        int tt = 0;
        for (int floor : requests) {
            tt +=Math.abs(floor - cf);
            cf = floor;
        }
        return tt;
    }
}
