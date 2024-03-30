class Solution {
    public String countAndSay(int n) {
        if(n==1)
        return "1";
       
        // Recursion 
        
        String s=countAndSay(n-1);
       
        // C as counter 
        
        int c=0;
        String ans = "";

        for(int i=0;i<s.length();i++){
            c++;
            if(i==s.length()-1 || s.charAt(i)!=s.charAt(i+1)){
                ans = ans + c + s.charAt(i);
                c=0;
            }
        }
        return ans.toString();
        
    }
}