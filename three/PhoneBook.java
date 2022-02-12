public class PhoneBook {
    private String name;
    private String number;

    public PhoneBook(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", number='" + getNumber() + "'" +
                "}";
    }

}
