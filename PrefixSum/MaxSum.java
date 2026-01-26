https://leetcode.com/problems/maximum-subarray/description/

class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<nums.length;i++){
           if(sum>0){               //if the current sum is negative no need to add create new array
            sum+=nums[i];
           }
           else{
            sum=nums[i];
           }

           if(sum>maxsum){
            maxsum=sum;
           }
        }
        return maxsum;

    }
}



// class Solution {
//     public int maxSubArray(int[] nums) {
//         int sum=nums[0];
//         int maxsum=nums[0];
//         for(int i=1;i<nums.length;i++){
//             sum=Math.max(nums[i],sum+nums[i]);
//             maxsum=Math.max(sum,maxsum);
//         }
//         return maxsum;
//     }
// }
