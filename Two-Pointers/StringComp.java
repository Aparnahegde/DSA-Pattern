https://leetcode.com/problems/string-compression/description/

class Solution {
    public int compress(char[] chars) {
        int r=0;
        int w=0;
        while(r<chars.length){
            char cur=chars[r];
            int count=0;

            while(r<chars.length && chars[r]==cur){
                r++;
                count++;
            }

            chars[w++]=cur;

            if(count>1){
                 for (char c : String.valueOf(count).toCharArray()) {
                    chars[w++] = c;
                }
            }
        }
        return w;
    }
}
