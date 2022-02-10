
package two;

public class BankAccount {
    private String holderName;
    private double balance;
    private String number;

    // Default constructor:
    // public BankAccount(String holderName, float balance) {}

    // Constructor = first bit (i.e. __init__)
    public BankAccount(String holderName, float balance) {
        this.holderName = holderName;
        this.balance = balance;
    }

    // Main
    public static void main(String[] args) {
        System.out.println(args[0]);
    }

    // Getter
    public String getName() {
        return holderName;
    }

    // Setter
    public void setName(String newName) {
        this.holderName = newName;
    }

    // Method: deposit
    public void depositMoney(float Money) {
        if (Money > 0) {
            this.balance += Money;
        }
    }

    // Method: withdraw
    public void withDraw(float Money) {
        if (Money > 0) {
            this.balance -= Money;
        }
    }

    // Method: view balance
    public double viewBalance() {
        return this.balance;
    }

}
