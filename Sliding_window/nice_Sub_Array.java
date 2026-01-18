https://leetcode.com/problems/count-number-of-nice-subarrays/description/

// class Solution {
//     public int numberOfSubarrays(int[] nums, int k) {
//         return atMost(nums, k) - atMost(nums, k - 1);
//     }

//     private int atMost(int[] nums, int k) {
//         int start = 0, odd = 0, count = 0;

//         for (int end = 0; end < nums.length; end++) {
//             odd += nums[end] & 1;

//             while (odd > k) {
//                 odd -= nums[start] & 1;
//                 start++;
//             }

//             count += end - start + 1;
//         }

//         return count;
//     }
// }


class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private int atMost(int[] nums, int k) {
        int start = 0;
        int oddCount = 0;
        int count = 0;

        for (int end = 0; end < nums.length; end++) {
            if (nums[end] % 2 != 0) {
                oddCount++;
            }

            while (oddCount > k) {
                if (nums[start] % 2 != 0) {         //odd -= nums[start] & 1; (add 1 if odd .(3) 11&1=1 like this)
                    oddCount--;
                }
                start++;
            }

            count += (end - start + 1);
        }

        return count;
    }
}
