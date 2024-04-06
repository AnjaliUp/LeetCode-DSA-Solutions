class Solution {
    public String longestPalindrome(String s) {
    int n=s.length();
    if(n==1){
        return s;
    }
    String sc="";
    for(int i=1;i<n;i++){
        int low=i;
        int high=i;
       while(s.charAt(low)==s.charAt(high)){
        low--;
        high++;
        if(low==-1||high==n){
            break;
        }
       }
       String palin=s.substring(low+1,high);
       if(palin.length()>sc.length()){
         sc=palin;
       } 
       low=i-1;
       high=i;
       while(s.charAt(low)==s.charAt(high)){
        low--;
        high++;
        if(low==-1||high==n){
            break;
        }
       }
       palin=s.substring(low+1,high);
       if(palin.length()>sc.length()){
        sc=palin;
       }
    }
    return sc;
    }
}