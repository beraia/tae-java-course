/** @author <Temur Beraia> */
package homework5;

public class SumEvens {
    public static int sumEvens(int from, int to){
        int sum = 0;
        for(int i = from; i <= to; i++){
            if(i % 2 == 0){
                sum = sum + i;
            }
        }
        return sum;
    }

    static void main(String[] args) {
        System.out.println(sumEvens(1, 54));
    }
}
