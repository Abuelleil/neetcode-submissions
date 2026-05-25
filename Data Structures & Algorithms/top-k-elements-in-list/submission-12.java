class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        HashMap<Integer, Integer> freq = new HashMap<>();
        int [] arr = new int[k];
        for(int i=0; i<nums.length;i++){
            if(freq.containsKey(nums[i])){
                freq.put(nums[i],freq.get(nums[i])+1);
            }else{
                freq.put(nums[i],1);
            }
        }
        for(int key : freq.keySet()){
            pq.add(new int[]{key, freq.get(key)});      
        }

        for (int i=0; i < k; i++){
            arr[i] = pq.poll()[0];
        }

        return arr;
    }
}
