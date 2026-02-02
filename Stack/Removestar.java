https://leetcode.com/problems/removing-stars-from-a-string/description/?envType=study-plan-v2&envId=leetcode-75
https://leetcode.com/problems/removing-stars-from-a-string/?envType=study-plan-v2&envId=leetcode-75
// class Solution {
//     public String removeStars(String s) {
//         StringBuilder sb = new StringBuilder();

//         for (char c : s.toCharArray()) {
//             if (c == '*') {
//                 sb.deleteCharAt(sb.length() - 1);
//             } else {
//                 sb.append(c);
//             }
//         }

//         return sb.toString();
//     }
// }

class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '*') {
                stack.pop();   // remove previous character
            } else {
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }

        return sb.toString();
    }
}

