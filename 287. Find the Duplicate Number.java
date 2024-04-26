class Solution {
    public int findDuplicate(int[] nums) {
        int i=0, j=0;
            
        int check = 0;
            
        
        // Implement Tortoise and Hare algorithm
        // since all nums[i] are <n therefore each cell point to other 
        while( true ){
            i = nums[i];
            j = nums[nums[j]];
            
            if( i == j ){
                break;
            }
        }
        
        
        // Step_#2
        // Locate the start node of cycle (i.e., the duplicate number)
        while( true ){
            i = nums[i];
            check = nums[check];
            
            if( i == check ){
                break;
            }
        }
        
        return check;
    }
}