/** @author <Temur Beraia> */
package homework7;

abstract class Vehicle {
    protected String brand;

    public Vehicle(String brand){
        this.brand = brand;
    }

    abstract void start();

    void stop(){
        System.out.println(brand + " stopped");
    }
}
