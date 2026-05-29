/** @author <Temur Beraia> */
package homework4;

public class PrimeCheck {
    static void main(String[] args) {
        int age = 8;
        boolean isPrime = true;


        for (int i = 2; i <= age / 2; i++){
            if(age % i == 0){
                isPrime = false;
                break;
            }
            else{
                isPrime = true;
            }
        }
            System.out.println("IsPrime " + isPrime);
    }
}

