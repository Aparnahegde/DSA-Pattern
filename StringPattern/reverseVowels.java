https://leetcode.com/problems/reverse-vowels-of-a-string/submissions/1902620766/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public String reverseVowels(String s) {
        String v="AEIOUaeiou";
        int st=0;
        int e=s.length()-1;
        char[] arr=s.toCharArray();
        while(st<e){
            if(v.indexOf(arr[st]) != -1){
                if(v.indexOf(arr[e]) != -1){
                    char temp=arr[st];
                    arr[st]=arr[e];
                    arr[e]=temp;
                    st++;
                    e--;
                }
                else{
                    e--;
                }
            }
            else{
                st++;
            }
        }
        return new String(arr);
    }
}
