package homework4;

public class EvenOddCounter {
    static void main(String[] args) {
        int birthYear = 1997;
        int lastTwoDigits = birthYear % 100;
        int oddCounter = 0;
        int evenCounter = 0;

        String odds = "";
        String evens = "";

        for(int i=1; i<=lastTwoDigits; i++){
            if(i % 2 == 0){
                evenCounter++;
                evens += i + " ";
            }
            else{
                oddCounter++;
                odds += i + " ";
            }
        }
        System.out.println("Odd " + oddCounter + " (" + odds.trim() + ")");
        System.out.println("Even " + evenCounter + " (" + evens.trim() + ")");
    }
}
