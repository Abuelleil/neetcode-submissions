class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> seq = new HashSet<Integer>();
        int output=0;
        for(int num: nums){
            seq.add(num);
        }
        int curr=0;
        for(int key: seq){
            if(!seq.contains(key-1)){
                curr=1;
                int currkey=key;
                while(seq.contains(currkey+1)){
                    curr++;
                    currkey++;
                }
                output=Math.max(curr,output);
            }
        } 
        return output;
    }
}
