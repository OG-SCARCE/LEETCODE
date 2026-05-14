class Solution {
    public void pop(int n,int openP,int closeP,String s,List<String> res){
        if(openP+closeP==n*2){
            res.add(s);
            return;
        }
        if(openP<n){
            pop(n,openP+1,closeP,s+"(",res);
        }
        if(closeP<openP){
            pop(n,openP,closeP+1,s+")",res);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        pop(n,0,0,"",res);
        return res;
    }
}

