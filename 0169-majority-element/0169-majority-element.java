class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length / 2 ;
        
        Map<Integer,Integer> XMap = new HashMap<>();
        for(int i =0 ;i <nums.length ;i++){
            XMap.put(nums[i],XMap.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : XMap.entrySet()){
           if(entry.getValue()> n){
            return entry.getKey();
           } 
        }
        return -1;
    }
}