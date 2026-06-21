class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
        if(words.length!=pattern.length()) return false;
        HashMap<Character,String> out=new HashMap<>();
        Set<String> used=new HashSet<>();
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String w=words[i];
            if(out.containsKey(ch)){
                if(!out.get(ch).equals(w)) return false;
            }
            else{
                if(used.contains(w)) return false;
                out.put(ch,w);
                used.add(w);
            }
        }
        return true;
    }
}
