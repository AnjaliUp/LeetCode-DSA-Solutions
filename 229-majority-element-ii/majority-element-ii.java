class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int n = nums.length;
        
        List<Integer> list = new ArrayList<>();
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int mini = (int)(n/3)+1;
        
        for(int i=0; i<n; i++){
            int value = map.getOrDefault(nums[i],0);
            map.put(nums[i],value + 1);    
        
        if (map.get(nums[i]) == mini) {
                list.add(nums[i]);
            }
            if (list.size() == 2) break;
        }

        return list;
        
    }
}