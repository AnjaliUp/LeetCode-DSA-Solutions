class Solution {
    public int maxDepth(String s) {
        
        int depth = 0, open = 0;
        
        for(char x : s.toCharArray()){
            if(x == '('){
                open++;
            }if(x == ')'){
                open--;
            }
            
            depth = Math.max(depth, open);
        }
        
        return depth;
        
    }
}