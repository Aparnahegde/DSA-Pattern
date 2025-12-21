https://leetcode.com/problems/sort-array-by-parity/

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] res=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]%2!=0){
                res[right]=nums[i];
                right--;
            }
            else{
                res[left]=nums[i];
                left++;
            }
        }
        return res;
    }
}
