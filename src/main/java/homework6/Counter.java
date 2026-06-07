/** @author <Temur Beraia> */
package homework6;

public class Counter {
    protected int count;
    protected int maxValue;

    public void increment(){
        if(count < maxValue){
            this.count++;
        }
    }

    public void reset(){
        this.count = 0;
    }

    public void countTo(int target){
        for (int i = 1; i <= target; i++){
            this.count++;
        }
    }
}
