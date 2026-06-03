/** @author <Temur Beraia> */
package homework5;

public class NumberClassifier {
    public static String classify(int n){
        if(n > 0){
            return "Positive";
        }else if(n < 0){
            return "Negative";
        }else{
            return "Zero";
        }
    }

    public static String classify(double n){
        String result;

        if(n > 0){
            result = "Positive";
        }else if(n < 0){
            result = "Negative";
        }else{
            return "Zero";
        }

        if(n % 1 == 0){
            return result + " · Whole double";
        }else{
            return result + " · Decimal";
        }
    }

    static void main(String[] args) {
        System.out.println(classify(3.14));
        System.out.println(classify(7.0));
        System.out.println(classify(3));
        System.out.println(classify(-3));
    }
}
