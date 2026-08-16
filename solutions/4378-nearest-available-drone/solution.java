class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int minDistance = Integer.MAX_VALUE;
        int answer = -1;
        for (int i = 0; i < drones.length; i++){
            int x = drones[i][0];
            int y = drones[i][1];
            int range = drones[i][2];

            int distance = Math.abs (x - target[0]) + Math.abs(y - target[1]);

            if (distance <= range) {
                if (distance < minDistance){
                    minDistance = distance;
                    answer = i; 
                }
            }
        }
        return answer;
    }
}
