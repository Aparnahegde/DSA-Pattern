https://leetcode.com/problems/subarray-sums-divisible-by-k/description/

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum = 0, result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);   

        for (int num : nums) {
            sum += num;
            int rem = (sum % k+k)%k;

            result += map.getOrDefault(rem, 0);
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        return result;
    }
}
