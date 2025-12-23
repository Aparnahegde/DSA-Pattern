https://leetcode.com/problems/container-with-most-water/description/
class Solution {
    public int maxArea(int[] height) {
   int left=0,right=height.length-1;
        int maxArea=0;
        while(left<right){
            int currentmax=(right-left)*Math.min(height[left],height[right]);
            maxArea=Math.max(maxArea,currentmax);
            if(height[left]<height[right])left++;
            else right--;
        }
        return maxArea;
    }
}
