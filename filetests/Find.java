import java.io.*;

/**
 * Find
 */
public class Find {
    public static void main(String[] args) {

        File f = new File("aNewFile.txt");
        FileReader fr = new FileReader(f);
        BufferedReader inStream = new BufferedReader(fr);

        System.out.println(System.getProperty("user.dir"));
        // FileReader myFinder = new FileReader("aNewFile.txt");
    }
}