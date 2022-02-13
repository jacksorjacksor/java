import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FivesWriter {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("myfile.txt", true);
        PrintWriter out = new PrintWriter(writer);
        for (int i = 1; i < 13; i++) {
            out.println(i * 5);
        }
        out.close();
    }
}
