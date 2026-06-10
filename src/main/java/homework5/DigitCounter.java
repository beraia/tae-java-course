/** @author <Temur Beraia> */
package homework5;

public class DigitCounter {
    public static int countDigits(int n){
        n = Math.abs(n);
        int count = 0;

        if(n == 0){
            return 1;
        }

        while (n > 0){
            n = n / 10;
            count ++;
        }
        return count;
    }

    static void main(String[] args) {
        System.out.println(countDigits(1997));
    }
}
