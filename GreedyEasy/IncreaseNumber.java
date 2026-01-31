https://leetcode.com/problems/increasing-triplet-subsequence/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public boolean increasingTriplet(int[] nums) {
       int min1 = Integer.MAX_VALUE;
       int min2 = Integer.MAX_VALUE;
       for(int n : nums) {
           if(n <= min1) 
           min1 = n;

           else if(n <= min2) 
           min2 = n;

           else 
           return true;
       }
       return false;
    }
}
