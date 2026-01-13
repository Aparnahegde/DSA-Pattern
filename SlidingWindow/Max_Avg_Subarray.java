https://leetcode.com/problems/maximum-average-subarray-i/description/

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
      for(int i=0; i<k; i++)  {
          sum+=nums[i];
      }
         int st=0;
        double maxs=sum;
        int end=k;
        while(end<nums.length){
            sum-=nums[st];
            st++;

            sum+=nums[end];
            end++;

            maxs=Math.max(maxs,sum);
        }
        return maxs/k;
    }
}
