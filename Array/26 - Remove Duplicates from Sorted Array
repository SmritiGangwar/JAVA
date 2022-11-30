class Solution {
    public int removeDuplicates(int[] nums) {
        //NON - DECREASING ORDER
        int idx = 0;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                nums[++idx]=nums[i];
            }
        }
        return idx+1;
    }
}
