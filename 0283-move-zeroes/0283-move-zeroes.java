class Solution {
    public void moveZeroes(int[] nums) {
        int p =-1;        
        for(int j =0 ;j<nums.length;j++){
            if(nums[j]==0){
                p = j;
                break;
            }
        }
        if(p!=-1){
        for(int i= p+1 ;i <nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[p];
                nums[p] = nums[i];
                nums[i] = temp; 
                p++;
            }            
        }
        }
        
    }
}