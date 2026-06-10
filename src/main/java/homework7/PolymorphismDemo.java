/** @author <Temur Beraia> */
package homework7;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Rex"),
                new Dog("Toby"),
                new Cat("Luna"),
                new Cat("Lucy")
        };

        for(Animal animal : animals){
            if(animal instanceof Dog){
                System.out.println( animal.name + " (Dog)");
            }
            else if(animal instanceof Cat) {
                System.out.println( animal.name + " (Cat)");
            }

            animal.makeSound();
            animal.sleep();
        }
    }
}
