package intro.concepts;

public class Concepts {
    public static void main(String[] args) {
        fun(5);
        funOverflows(5);
    }
    /*
     * n-- vs --n
     * n = n-1
     * n-- pass n then subsract 1(in our case after function returns) so goes to infinate loop
     * so we use --n to avoid it or n-1
     */
    static void funOverflows(int n){
        if(n == 0) return;
        System.out.println(n);
        funOverflows(n--); //overflows
    }
    static void fun(int n){
        if(n == 0) return;
        System.out.println(n);
        fun(--n); //or n-1
    }
}
