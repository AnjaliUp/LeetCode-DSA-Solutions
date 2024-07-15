class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroCount = 0;
        int start = 0;
        int max_Ones = 0;
        
        for(int i= 0; i<nums.length;i++){
            if(nums[i]==0)
                zeroCount++;
            
            while(zeroCount>k){
                if(nums[start]==0){
                    zeroCount--;
                }
                
                start++;
            }
            
            max_Ones = Math.max(max_Ones, i-start+1);
            
        }
        
        return max_Ones;
        
    }
}