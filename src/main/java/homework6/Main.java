/** @author <Temur Beraia> */
package homework6;

public class Main {
    public static void main(String[] args) {
//        HW6 - Person
//        Person student = new Person("თემო", 29, "temuriberaia1@gmail.com");
//        Person p1 = new Person("ანა", 24, "ana24@gmail.com");
//
//        System.out.println(student.getName());
//        student.introduce();
//        System.out.println(p1.getName());
//        p1.introduce();

//        HW6 - BankAccount
        BankAccount acc = new BankAccount("Temo", 100);
        acc.deposit(50);
        System.out.println("ბალანსი არის : " + acc.getBalance());
    }
}
