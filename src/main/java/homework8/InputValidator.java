/** @author <Temur Beraia> */
package homework8;

public class InputValidator {
    public static int processAge(String input) throws NumberFormatException, IllegalArgumentException {
        int age = Integer.parseInt(input);
        if (age < 0) {
            throw new IllegalArgumentException();
        }
        return age * 12;
    }
    public static void main(String[] args) {
        try {
            System.out.print("processAge(\"abc\") -> ");
            processAge("abc");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }

        try {
            System.out.print("processAge(\"-5\") -> ");
            processAge("-5");
        } catch (NumberFormatException e) {
            System.out.println(e.getClass().getSimpleName());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}