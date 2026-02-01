https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0, zeros = 0, max = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) zeros++;

            while (zeros > 1) {
                if (nums[left] == 0) zeros--;
                left++;
            }

            max = Math.max(max, right - left);
        }

        return max;
    }
}
