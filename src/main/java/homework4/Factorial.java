package homework4;

public class Factorial {
    static void main(String[] args) {
        int birthMonth = 5;
        long sum = 1;
        while (birthMonth > 0){
            sum = sum * birthMonth;
            birthMonth --;
        }
        System.out.println(sum);
    }
}
