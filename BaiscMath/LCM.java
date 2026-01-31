class Solution {
  // Method to find GCD
  private int gcd(int a, int b) 
  { 
            return b==0?a:gcd(b,a%b); 
  } 
  // Method to find LCM 
  public int lcm(int a, int b) 
  { 
    return (a * b) / gcd(a, b);
  } 
}
