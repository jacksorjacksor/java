import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class multiplesWriter {
    public static void main(String[] args) throws IOException {
        FileWriter myWriter = new FileWriter(args[1]);
        PrintWriter myPrinter = new PrintWriter(myWriter);
        for (int i = 1; i < 13; i++) {
            myPrinter.println(i * Integer.parseInt(args[0]));
        }
    }
}
