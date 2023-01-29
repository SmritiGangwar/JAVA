class Solution {
    public int findNumbers(int[] nums) {
        //Boundary Values are from 1 to 100000
        int count=0;
        for(int i=0;i<nums.length;i++){
            // 0 to 100 ,100 to 999 are odd,  1000 to 10000, 10000 to 99999 are odd, 100000
            if((nums[i]>9 && nums[i]<100) || (nums[i]>999 && nums[i]<10000) || nums[i]==100000)
                count++;
        }
        return count;
    }
}
