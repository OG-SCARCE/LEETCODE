class Solution 
{ public void f(int idx, List<String> ans, String s, String curr, int dots, String part)

 { 
int n = s.length();
 if(dots > 3) return; 
if(part.length() > 3) return; 
 if(part.length() > 0 && Integer.parseInt(part) > 255)
 return; 
if(part.length() > 1 && part.charAt(0) == '0') return;
 if(idx >= n) { 
if(dots == 3 && part.length() > 0) 
{ ans.add(curr); }
 return; 
}
 // Start new segment
 f(idx + 1, ans, s, curr + "." + s.charAt(idx),
 dots + 1, String.valueOf(s.charAt(idx))); 

// Continue current segment
 f(idx + 1, ans, s, curr + s.charAt(idx),
 dots, part + s.charAt(idx)); }
 public List<String> restoreIpAddresses(String s) 
{ List<String> ans = new ArrayList<>();
 String start = "";
 start += s.charAt(0);
 f(1, ans, s, start, 0, start);
 return ans; } 
}
