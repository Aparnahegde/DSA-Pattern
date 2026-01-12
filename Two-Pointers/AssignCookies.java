https://leetcode.com/problems/assign-cookies/description/

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int totalCookies = s.length;
        if (totalCookies == 0) return 0;

        Arrays.sort(g);
        Arrays.sort(s);

        int happyChildrenCount = 0;
        int cookiePointer = totalCookies - 1;
        int childPointer = g.length - 1;

        while (cookiePointer >= 0 && childPointer >= 0) {

            if (s[cookiePointer] >= g[childPointer]) {
                happyChildrenCount++;
                cookiePointer--;
                childPointer--;
            } else {
                childPointer--;
            }
        }

        return happyChildrenCount;
    }
}
