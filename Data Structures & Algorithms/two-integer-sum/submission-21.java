class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> values = new HashMap<Integer, Integer>();
        int [] arr = new int[2];
        for(int i =0; i< nums.length; i++){
            values.put(nums[i],i);
        }

        for(int i =0; i< nums.length; i++){
            int complement = target-nums[i];
            if(values.containsKey(complement) && (values.get(complement) !=i )){
                arr[0] = i;
                arr[1] = values.get(complement);
                return arr;
            }
        }

        return arr;
    }
}
