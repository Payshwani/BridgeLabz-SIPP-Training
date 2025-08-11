import java.util.*;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) { super(msg); }
}
class BankAccount {
    double balance;
    BankAccount(double balance) { this.balance = balance; }
    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) throw new IllegalArgumentException("Invalid amount!");
        if (amount > balance) throw new InsufficientBalanceException("Insufficient balance!");
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}
public class BankTransactionDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter withdrawal amount: ");
        double amt = sc.nextDouble();
        try {
            acc.withdraw(amt);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
