package two;

public class BankCreator {
    public static void main(String[] args) {
        BankAccount newBankAccount = new BankAccount("Rich", 123.12f);
        double myBalance = newBankAccount.viewBalance();
        System.out.println(myBalance);
    }
}
