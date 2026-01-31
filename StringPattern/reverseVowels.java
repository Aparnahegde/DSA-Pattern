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




//Optimised approach

class Solution {
    public String reverseVowels(String s) {

        // Store vowels in a Set for fast lookup
        Set<Character> vowels = new HashSet<>();
        for (char c : "AEIOUaeiou".toCharArray()) {
            vowels.add(c);
        }

        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // Move left pointer until vowel found
            while (left < right && !vowels.contains(arr[left])) {
                left++;
            }

            // Move right pointer until vowel found
            while (left < right && !vowels.contains(arr[right])) {
                right--;
            }

            // Swap vowels
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }
}

    
