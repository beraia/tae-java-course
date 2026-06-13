/** @author <Temur Beraia> */
package homework8;

public class ArrayReader {
    public static int readSafe(int[] arr, int index) {

        try {
            return arr[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ინდექსი არასწორი: " + index);
            return -1;
        }
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30};

        System.out.println(readSafe(numbers, 1));
        System.out.println(readSafe(numbers, 10));
    }
}
