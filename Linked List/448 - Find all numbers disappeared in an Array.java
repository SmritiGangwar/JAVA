class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
      for(int i=0;i<nums.length;i++){
          while(nums[i]!=i+1 && nums[i] != nums[nums[i]-1] ){
              int temp = nums[i];
              nums[i] = nums[temp-1];
              nums[temp-1] = temp;
          }
      }
      List<Integer> list = new ArrayList<>();
      for(int i=0;i<nums.length;i++){
          if(nums[i]!=i+1){
              list.add(i+1) 
              //List.add(nums[i]) will add the extra numbers in array
          }
      }
      return list;  
    }
}
