https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/description/

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashSet<Integer> windowSet = new HashSet<>();
        long windowSum = 0;
        long maxSum = 0;

        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            while (windowSet.contains(nums[right])) {
                windowSet.remove(nums[left]);
                windowSum -= nums[left];
                left++;
            }

            windowSet.add(nums[right]);
            windowSum += nums[right];

            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, windowSum);

                
                windowSet.remove(nums[left]);
                windowSum -= nums[left];
                left++;
            }
        }

        return maxSum;
    }
}
