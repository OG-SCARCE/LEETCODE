class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        if(source[0] == target[0] && source[1] == target[1]){
            return 0;
        }
        if((source[0] + source[1]) % 2 != (target[0] + target[1]) % 2){
            return -1;
        }
        if(Math.abs(source[0] - target[0]) == Math.abs(source[1] - target[1])){
            return 1;
        }
        return 2;
    }
}
