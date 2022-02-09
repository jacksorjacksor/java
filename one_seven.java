import java.util.Scanner;

public class one_seven {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Width: ");
        int width = in.nextInt();
        System.out.println("Height: ");
        int height = in.nextInt();

        for (int i = 0; i < height; i++) {
            String row = "";
            for (int j = 0; j < width; j++) {
                row += "*";
            }
            System.out.println(row);
        }

        in.close();
    }
}
