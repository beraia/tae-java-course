/** @author <Temur Beraia> */
package homework8;

public class AgeValidator {
    public static void validate (int age) throws InvalidAgeException{
        if(age < 0 || age > 150){
            throw new InvalidAgeException("ასაკი არ არის სწორი" + age);
        }
        System.out.println("ასაკი არის : " + age);
    }

    public static void main(String[] args) {
        try{
            validate(25);
        } catch (InvalidAgeException e){
            System.out.println("Exception : " + e);
        }

        try{
            validate(-5);
        } catch (InvalidAgeException e){
            System.out.println("Exception : " + e);
        }

        try{
            validate(200);
        } catch (InvalidAgeException e){
            System.out.println("Exception : " + e);
        }
    }
}
