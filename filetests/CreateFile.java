import java.io.*;

public class CreateFile {

    public static void main(String[] args) throws IOException {
        BufferedReader myBufferedReader = new BufferedReader(new FileReader(args[1]));
        String line;
        String value = args[0];
        while ((line = myBufferedReader.readLine()) != null) {
            if (line.contains(value)) {
                System.out.println(line);
            }

        }
        myBufferedReader.close();
    }
}
