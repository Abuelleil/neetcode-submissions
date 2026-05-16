class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> arr = new HashMap<>();
        int [] arr2 = new int [2];
        for(int i= 0; i< nums.length;i++){
            if(arr.containsKey(target-nums[i])){
                arr2[1] = i;
                arr2[0] = arr.get(target-nums[i]);
            }else arr.put(nums[i],i);
        }
        // for(int i=0; i < nums.length ;i++){
        //     if(arr.containsKey(target-nums[i])){
        //         arr2[1] = i;
        //         arr2[0] = arr.get(target-nums[i]);
        //     }
        // }
        return arr2;
    }
}
