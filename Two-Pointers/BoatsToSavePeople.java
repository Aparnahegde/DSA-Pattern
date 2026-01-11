https://leetcode.com/problems/boats-to-save-people/description/

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int first=0;
        int b=0;
        int last=people.length-1;
        while(first<=last){
            if(people[first]+people[last]<=limit){
                first++;  
            }
            last--;
             b++;
        }
        return b;
    }
}
