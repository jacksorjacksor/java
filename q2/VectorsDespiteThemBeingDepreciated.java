import java.util.ArrayList;
import java.util.Scanner;

public class VectorsDespiteThemBeingDepreciated {
    public static void main(String[] args) {
        Scanner aScannerDarkly = new Scanner(System.in);
        ArrayList<String> myLovelyBuffer = new ArrayList<String>();
        // Luis myLovelyBuffer = new StringBuffer();
        System.out.println("PLEASE ENTER TEXT . ENTER A BLANK LINE WHEN YOU ARE FINISHED :");
        while (true) {
            String userInput = aScannerDarkly.nextLine();
            if (userInput.length() > 0) {
                myLovelyBuffer.add(userInput);
            } else {
                break;
            }
        }
        System.out.println("YOUR INPUT REVERSED :");
        for (String line : myLovelyBuffer) {
            StringBuffer buff = new StringBuffer();
            System.out.println(buff.append(line).reverse());
        }

        aScannerDarkly.close();
    }
}
