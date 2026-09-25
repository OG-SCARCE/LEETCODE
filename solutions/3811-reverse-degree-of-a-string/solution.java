class Solution {
    public int reverseDegree(String s) {
        char[] charArray = s.toCharArray();
        int sum = 0;
        for(int i =  0;  i < s.length(); i++){
            int str = charArray[i];
            int x = str - 71;
            int idx = (x - (x - 26) * 2) ;
            sum += idx * (i + 1);
            // System.out.println(sum);
        }
        return sum;
    }
}
