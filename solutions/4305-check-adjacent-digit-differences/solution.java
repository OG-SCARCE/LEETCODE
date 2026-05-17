class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for (int j = 0; j <s.length()-1;j++){
            int difference = Math.abs(s.charAt(j) - s.charAt(j+1));
            if(difference > 2){
                return false;
            }
        }
        return true;
    }
}
