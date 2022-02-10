public class ClassesCreator {
    public static void main(String[] args) {
        ClassesAndCompositionEx1 newStudent1 = new ClassesAndCompositionEx1("Rich", 1, "School", "me@me.me");
        System.out.println(newStudent1.getName());
        System.out.println(newStudent1.getIdNumber());
        System.out.println(newStudent1.getSchool());
        System.out.println(newStudent1.getEmail());
    }
}
