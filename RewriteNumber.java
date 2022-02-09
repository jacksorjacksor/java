import java.util.Scanner;
import java.util.HashMap;

public class RewriteNumber {
    public static void main(String args[]) {
        HashMap<Integer, String> myNewHashMap = new HashMap<Integer, String>();

        myNewHashMap.put(1, "one");
        myNewHashMap.put(2, "two");
        myNewHashMap.put(3, "three");
        myNewHashMap.put(4, "four");
        myNewHashMap.put(5, "five");
        myNewHashMap.put(6, "six");
        myNewHashMap.put(7, "seven");
        myNewHashMap.put(8, "eight");
        myNewHashMap.put(9, "nine");

        Scanner in = new Scanner(System.in);

        System.out.println("Enter an integer between 0 and 9");
        int num = in.nextInt();
        System.out.println("You entered " + myNewHashMap.get(num));
        in.close();
    }
}
