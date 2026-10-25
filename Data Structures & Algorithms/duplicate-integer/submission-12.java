class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> duplicates = new HashSet<Integer>();
        for(int num: nums){
            if(duplicates.contains(num)){
                return true;
            }else{
                duplicates.add(num);
            }
        }
        return false;   
    }
}