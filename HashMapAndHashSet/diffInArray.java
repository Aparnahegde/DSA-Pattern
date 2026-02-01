https://leetcode.com/problems/find-the-difference-of-two-arrays/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for (int i : nums1) s1.add(i);
        for (int i : nums2) s2.add(i);

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        for (int i : s1) {
            if (!s2.contains(i)) {
                l1.add(i);
            }
        }

        for (int i : s2) {
            if (!s1.contains(i)) {
                l2.add(i);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(l1);
        result.add(l2);

        return result;
    }
}
