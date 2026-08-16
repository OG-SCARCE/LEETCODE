class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int maxLight = 0;
        for (int light : lights){
            maxLight = Math.max(maxLight, light);
        }
        int answer = 0;
        for (int time : arrivalTime){
            int r = time % period;
            int wait = 0;
            if (r >= maxLight){
                wait = period - r;
            }
            answer = Math.max(answer, wait);
        }
        return answer;
    }
}
