//Better solution
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numMap = new HashMap<>();
        for(int i=0;i<= nums.length-1; i++){
            int rem = target - nums[i];
            if(numMap.containsKey(rem)){
                return new int[] {numMap.get(rem),i};
            }
            else{
                numMap.put(nums[i],i);
            }   
        }
        return new int[]{};
    }
}