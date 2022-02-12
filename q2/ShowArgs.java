public class ShowArgs {
    public static void main(String[] args) {
        System.out.println(args.length);
        if (args.length > 0) {
            for (String arg : args) {
                System.out.println(arg);
            }
        }
    }
}
