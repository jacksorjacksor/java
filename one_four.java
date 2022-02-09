public class one_four {
    public static void main(String[] args) {
        String outputString = "";
        for (int i = 5; i < 46; i = i + 5) {
            outputString += String.valueOf(i) + ", ";
        }
        System.out.println(outputString);
    }
}
