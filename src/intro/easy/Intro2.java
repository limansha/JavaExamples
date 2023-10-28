package intro.easy;

public class Intro2 {
    static int rev = 0;

    public static void main(String[] args) {
        int ans = reverse(1234, 0);
        System.out.println(ans);
        fun(1234);
        System.out.println(rev);

        System.out.println(evenOrOdd(1234));
        System.out.println(evenOrOdd(123));

        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(123));

        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("abba"));
        
        System.out.println(isPalindrome("madams"));

        System.out.println(countZeros(120402, 0));

        //https://practice.geeksforgeeks.org/problems/find-optimum-operation4504/1
        System.out.println(numberOfSteps(14));
    }

    // reverse a number method 1
    // using rev argument to store the intermediate value between calls
    static int reverse(int n, int rev) {
        if (n == 0)
            return rev;
        rev = rev * 10 + n % 10;
        return reverse(n / 10, rev);
    }

    // method 2 reverse a number
    static void fun(int n) {
        if (n == 0)
            return;
        rev = rev * 10 + n % 10;
        fun(n / 10);
    }

    // bitwise AND Short cut (n bit wise AND with 0001 --> basically checking last
    // bit is 1 or zero)
    static String evenOrOdd(int n) {
        // generic approach is n % 2 == 0 ? "even" : "odd";
        return (n & 1) == 0 ? "even" : "odd";
    }

    // for number
    static String isPalindrome(int n) {
        int rev = reverse(n, 0);
        return (n == rev) ? "palindrome" : "not palindrome";
    }

    /*
    for string compare left side string and right side string from back is same
    madam at d i = 2; len - i = 4 - 2 = 2 
    left = ma
    right = am(from back or rev) = ma
    so its palindrome
    */ 
    static String isPalindrome(String str){
        int len = str.length()-1;
        int i =0,j = len - i;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return "not palindrome string";
            }
            i++;
            j = len - i;
        }
        return "palindrome string";
    }
    //count zeros in number
    /*
     * 10203
     * if rem = n % 10 == 0 then inc count return count 
     */
    static int countZeros(int n, int count){
        if(n == 0) return count;
        if(n % 10 == 0) count = count + 1;
        return countZeros(n / 10, count);
    }

    /*
     * Given an integer num, return the number of steps to reduce it to zero.
        In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
     */
    //if your method in ide given as countZeros(n) and you want to track ans in arguments ->then create helper function 
    
    static int numberOfSteps(int num) {
        return helper(num,0);
    }
    static int helper(int n,int steps){
        if(n == 0) return steps;
        return n % 2 == 0 ? helper(n/2,steps+1) : helper(n-1,steps+1);
    }
}
