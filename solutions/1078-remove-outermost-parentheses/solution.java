class Solution {
    public String removeOuterParentheses(String s) {
        int open = 0;
        int close = 0;
        String sb = "";
        for(char x : s.toCharArray()){
            if(x == '('){
                open++;
            }else{
                close++;
            }
            if(open > 1 && open != close){
                sb = sb + x;
            }
            if(open == close){
                open = 0;
                close = 0;
            }
            // System.out.println(sb);
        }
        return sb;

    }
}
