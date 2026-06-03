/** @author <Temur Beraia> */
package homework5;

public class Fibonacci {
    public static long fib(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        long a = 0;
        long b = 1;

        for(int i = 2; i <= n; i++){
            long c = a + b;
            a = b;
            b = c;
        }

        return b;

    }

    static void main(String[] args) {
        System.out.println(fib(10));
        System.out.println(fib(20));
        System.out.println(fib(25));
    }
}
