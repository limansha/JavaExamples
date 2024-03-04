package intro.easy;

public interface RecursionIntro {
    public static void main(String[] args) throws Exception {
        int n = 5;
        printNto1(n);
        System.out.println();
        print1ToN(n);
        System.out.println();
        System.out.println(sumNto1(n));
        System.out.println(numberOfDigits(1234));
        System.out.println(numberOfDigitsSC(1234));
       // System.out.println(sumOfDigits(12345));
       System.out.println(sumOfDigitsRecursive(12345));
    }
    //Exmaple 1
    static void printNto1(int n){
        if(n == 0) return;
        System.out.print(n+" ");
        printNto1(n-1);
    }
    //Example 2 
    static void print1ToN(int n){
        if(n == 0) return;
        print1ToN(n-1);
        System.out.print(n+ " ");
    }
    //return sum of Nto1
    static int sumNto1(int n){
        if(n == 0) return 0;
        return n + sumNto1(n-1);
    }
    //number of digits
    static int numberOfDigits(int n){
        /* 
         * n = 123 o/p : 3
         * n = 123 = n / 10 = 12 --> 12 % 10 = 1 --> do it till the number exhaust and inc count 
         */
        int count = 0;
        while(n  > 0){ //O(no. of digits)
            count++;
            n =  n / 10;
        }
        return count;
    }
    //short cut use Math.log(n)+1;  base 10
    static int numberOfDigitsSC(int n){
        return (int) (Math.log10(n)+1);
    }
    //sum of digits iterative
    static int sumOfDigits(int n){
        int sum = 0;
        while(n  > 0){ //O(no. of digits)
            sum =sum + n % 10; // % --> gives reminder / --> gives quotient
            n =  n / 10;
        }
        return sum;
    }
    
    //sum of digits
    static int sumOfDigitsRecursive(int n){
        if(n == 0) return 0;
        return n % 10 + sumOfDigitsRecursive(n / 10);
    }
}