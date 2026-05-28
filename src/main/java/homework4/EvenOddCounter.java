package homework4;

public class EvenOddCounter {
    static void main(String[] args) {
        int birthYear = 1997;
        int lastTwoDigits = birthYear % 100;
        int oddCounter = 0;
        int evenCounter = 0;

        for(int i=1; i<=lastTwoDigits; i++){
            if(i % 2 == 0){
                evenCounter++;
            }
            else{
                oddCounter++;
            }
        }
        System.out.println("Odd numbers count " + oddCounter);
        System.out.println("Even numbers count " + evenCounter);
    }
}
