/** @author <Temur Beraia> */
package homework4;

public class GradeCalculator {
    static void main(String[] args) {
        int birthMonth = 13;

        if(birthMonth == 12){
            System.out.println("Grade is : A");
        } else if (birthMonth >= 9 && birthMonth <= 11) {
            System.out.println("Grade is : B");
        }else if (birthMonth >= 6 && birthMonth <= 8) {
            System.out.println("Grade is : C");
        }else if (birthMonth >= 3 && birthMonth <= 5) {
            System.out.println("Grade is : D");
        }else if (birthMonth == 1 || birthMonth == 2) {
            System.out.println("Grade is : F");
        }else{
            System.out.println("Incorrect value");
        }
    }
}