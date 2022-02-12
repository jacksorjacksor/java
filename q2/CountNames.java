import java.util.ArrayList;

public class CountNames {
    public static void main(String args[]) {

        String[] names = { "Tommy Lee Jones", "William Hurt", "Nicole Kidman",
                "Catherine Zeta-Jones", "JAMES EARL JONES", "Tom Hardy",
                "Judi Dench", "Sean Bean", "Carey Mulligan", "Toby Jones" };

        ArrayList<String> jonesFamily = new ArrayList<>();
        for (String name : names) {
            if (name.toLowerCase().endsWith("jones")) {
                jonesFamily.add(name);
            }
        }
        System.out.println(jonesFamily);
    }
}
