class Solution {
    public int missingNumber(int[] nums) {
        int[] hash = new int[nums.length+1];
        for(int i=0 ; i<nums.length; i++){
            hash[nums[i]] = 1;
        }
        for(int j=0;j<=nums.length;j++){
            if(hash[j]==0){
                return j ;
            }
        }
        return -1;
}
}