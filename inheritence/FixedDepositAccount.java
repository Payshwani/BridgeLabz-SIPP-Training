// FixedDepositAccount subclass
public class FixedDepositAccount extends BankAccount {
    private int termMonths;

    public FixedDepositAccount(String accountNumber, double balance, int termMonths) {
        super(accountNumber, balance);
        this.termMonths = termMonths;
    }

    public void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}
