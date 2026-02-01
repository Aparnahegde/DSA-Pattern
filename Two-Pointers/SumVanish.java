https://leetcode.com/problems/max-number-of-k-sum-pairs/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);

        
        int i = 0, j = nums.length - 1, count = 0;

        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == k) {
                count++;
                i++;
                j--;
            } else if (sum < k) {
                i++;
            } else {
                j--;
            }
        }
        return count;
    }
}
