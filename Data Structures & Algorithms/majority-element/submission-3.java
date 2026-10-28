class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int maxKey=0;
        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
            int count = map.get(num);
            if(max < count){
                max = count;
                maxKey=num;
            }
        }
        return maxKey;
    }
}