https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k/

class Solution {
    public boolean hasAllCodes(String s, int k) {

        Set<String> seen = new HashSet<>();

        int required = 1 << k;

        for (int i = 0; i <= s.length() - k; i++) {

            String sub = s.substring(i, i + k);

            seen.add(sub);

            if (seen.size() == required) {
                return true;
            }
        }

        return false;
    }
}
