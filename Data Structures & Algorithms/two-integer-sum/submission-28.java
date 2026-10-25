class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> values = new HashMap<Integer, Integer>();
        int [] arr = new int[2];

        for(int i =0; i< nums.length; i++){
            int complement = target-nums[i];
            if(values.containsKey(complement)){
                arr[1] = i;
                arr[0] = values.get(complement);
                return arr;
            }else{
                values.put(nums[i], i);
            }
        }

        return arr;
    }
}
