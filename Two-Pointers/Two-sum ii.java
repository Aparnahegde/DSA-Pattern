https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i1=0;
        int i2=numbers.length-1;
        while(i1<i2){
            int sum=numbers[i1]+numbers[i2];
            if(sum==target){
                return new int[]{i1+1,i2+1};
            }
            else if(sum<target){
                i1++;
            }
            else{
                i2--;
            }
        }
        return new int[]{-1,-1};
        
    }
}
