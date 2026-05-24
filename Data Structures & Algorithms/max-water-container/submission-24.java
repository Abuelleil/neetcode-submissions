class Solution {
    public int maxArea(int[] heights) {
        int right=heights.length-1;
        int left=0;
        int maxArea=0;
        while(left <=right){
            int currArea = Math.abs(left - right) * Math.min(heights[left],heights[right]);
            System.out.println(currArea);
                if(heights[left] <= heights[right]){
                    left++;
                }else{
                    right--;
                }
            maxArea=Math.max(currArea, maxArea);
            }

        return maxArea;
    }
}
