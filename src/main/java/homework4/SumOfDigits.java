package homework4;

public class SumOfDigits {
    static void main(String[] args) {
        int birthYear = 1997;
        int sum = 0;

        while (birthYear > 0){
            sum += birthYear % 10;
            birthYear = birthYear / 10;
        }
        System.out.println("Sum is " + sum);
    }
}
