https://leetcode.com/problems/merge-strings-alternately/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int s1=0;
        int s2=0;
        StringBuilder sb=new StringBuilder("");
        while(s1<word1.length()&&s2<word2.length()){
            sb.append(word1.charAt(s1++));
            sb.append(word2.charAt(s2++));
        }
        while(s1<word1.length()){
            sb.append(word1.charAt(s1++));
        }

        while(s2<word2.length()){
            sb.append(word2.charAt(s2++));
        }

        return sb.toString();
    }
}
