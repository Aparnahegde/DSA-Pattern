class Solution {
    public int gcd(int a, int b) {
      return b==0?a:gcd(b,a%b);
}


  class Solution {
    public int gcd(int a, int b) {

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }
}

