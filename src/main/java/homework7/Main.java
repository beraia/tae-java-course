/** @author <Temur Beraia> */
package homework7;

public class main {
    public static void main(String[] args) {
//        HW7 - Shape interface
        Shape s1 = new Rectangle(4, 5);
        System.out.println(s1.area());

        Shape s2 = new Circle(3);
        System.out.println(s2.area());
    }
}
