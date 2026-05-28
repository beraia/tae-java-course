/** @author <Temur Beraia> */
package homework4;

public class Calculator {
    static void main(String[] args) {
        double firstNumber = 10;
        double secondNumber = 2;
        char operator = '/';

        switch (operator){
            case '+' -> System.out.println("Result: " + (firstNumber + secondNumber));
            case '-' -> System.out.println("Result: " + (firstNumber - secondNumber));
            case '*' -> System.out.println("Result: " + (firstNumber * secondNumber));
            case '/' -> {
                if(secondNumber == 0){
                    System.out.println("Cannot divide by zero");
                }else{
                    System.out.println("Result: "+ (firstNumber / secondNumber));
                }
            }
            default -> System.out.println("Unknown operation");
        }
    }
}
