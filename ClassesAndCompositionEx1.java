
/**
 * ClassesAndCompositionEx1
 */
public class ClassesAndCompositionEx1 {
    private String name;
    private int idNumber;
    private String school;
    private String email;

    // Constructor: 4 args
    public ClassesAndCompositionEx1(
            String name,
            int idNumber,
            String school,
            String email) {
        this.name = name;
        this.idNumber = idNumber;
        this.school = school;
        this.email = email;
    }

    // Constructor: 2 args
    public ClassesAndCompositionEx1(
            String name,
            int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.school = "";
        this.email = "";
    }

    // Constructor: 0 args
    public ClassesAndCompositionEx1() {
        this.name = "";
        this.idNumber = 0;
        this.school = "";
        this.email = "";
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setIDNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getIdNumber() {
        return this.idNumber;
    }

    public String getSchool() {
        return this.school;
    }

    public String getEmail() {
        return this.email;
    }
}