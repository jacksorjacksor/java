import java.io.FileReader;
import java.io.IOException;

public class CharReader {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("alphabet.txt");
        while (reader.read() >= 0) {
            System.out.println((char) reader.read());
        }
        reader.close();
    }
}
