class Solution {
    public int removeDuplicates(int[] nums) {

        LinkedHashSet<Integer> hash = new LinkedHashSet<>();

        for(int i=0; i<nums.length; i++){
            hash.add(nums[i]);
        }
        int k = hash.size();
        int j=0; 
        for(int x: hash){
            nums[j++] = x;
        }

        return k;
        
    }
}