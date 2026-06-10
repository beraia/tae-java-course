/** @author <Temur Beraia> */
package homework7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        HW7 - Shape interface
//        Shape s1 = new Rectangle(4, 5);
//        System.out.println(s1.area());
//
//        Shape s2 = new Circle(3);
//        System.out.println(s2.area());


//        HW7 - Animal - Abstract class
//        Dog d = new Dog("Rex");
//        d.makeSound();
//        d.sleep();

//        HW7 - Drawable + 3 class — Interface + Polymorphism
//        Drawable[] shapes = {
//                new Square(),
//                new Square(),
//                new Star()
//        };
//        for (Drawable shape : shapes){
//
//            if(shape instanceof Square){
//                System.out.println("This is square");
//            }else if(shape instanceof Triangle){
//                System.out.println("This is triangle");
//            }else if(shape instanceof Star){
//                System.out.println("This is star");
//            }
//
//            shape.draw();
//        }

//        HW7 - Book — Constructor Chaining
//        Book book1 = new Book("Java");
//        Book book2 = new Book("Java", "Bloch");
//        Book book3 = new Book("Java", "Bloch", 2020);
//
//        System.out.println(book1);
//        System.out.println(book2);
//        System.out.println(book3);

//        HW7 - Vehicle - Abstract + Concrete
//        new Car("Toyota").start();
//        new Bike("Trek").stop();

//        HW7 - Person - Comparable Interface
//        Person[] people = {
//                new Person("Ana", 25),
//                new Person("Beka", 30),
//                new Person("Cita", 22)
//        };
//
//        Arrays.sort(people);
//
//        for(Person person : people){
//            System.out.println(person);
//        }

//        HW7 - Employee — Abstract Hierarchy
        Employee[] team = {
                new FullTime("Anna", 5000),
                new PartTime("Beka", 25, 80)
        };

        for (Employee e : team) {
            e.printInfo(); System.out.println(e.calculateSalary());
        }

    }
}
