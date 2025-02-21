class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }

        int num = x;
        int revNum = 0;

        while(num>0){
            revNum = revNum*10 + num%10;
            num/=10;
        }

        return revNum == x;   
        
    }
}