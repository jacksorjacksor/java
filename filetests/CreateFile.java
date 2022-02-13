import java.io.*;

public class CreateFile {
    FileWriter writer = new FileWriter(" textwriteexample.txt ");
    PrintWriter out = new PrintWriter(writer);
    // out.println( " One " ); // writes " One "
    // out.println( 2 ); // writes "2"
    // out.println( 3.0 ) ; // writes "3.0"
    // out.close()
}
