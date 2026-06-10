/** @author <Temur Beraia> */
package homework6;

public class Car extends Vehicle {
    private int doors;

    public Car(String brand, int year, int doors){
        super(brand, year);
        this.doors = doors;
    }

    @Override
    public void info(){
        System.out.println(brand + " " + year + ", " + doors + " doors");
    }
}
