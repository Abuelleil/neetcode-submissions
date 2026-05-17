class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet <Integer> unique = new HashSet<>();
        for(int i=0; i < nums.length; i++){
            if(unique.contains(nums[i])){
                return true;
            }else{
                unique.add(nums[i]);
                // int val = unique.get(nums[i]);
            }
        }
        return false;
    }
}