https://leetcode.com/problems/max-consecutive-ones-iii/
class Solution {
    public int longestOnes(int[] nums, int k) {
        int z=0;
        int s=0;
        int o=0;
        for(int e=0;e<nums.length;e++){
            if(nums[e]==0){
                z++;
            }
            while(z>k){
                if(nums[s]==0)
                    z--;
                    s++;
                
            }
            o=Math.max(o,e-s+1);
        }
        return o;
    }
}
