public class Account {
    private int number;
    private double balance;
    private String ownerName;

    public Account() {
        this(0.0);
    }

    public Account(double balance) {
        //this.balance = balance;
        credit (balance);
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double creditAmount) {
        balance += creditAmount;
    }

    public double debit(double debitAmount) {
        double actualDebitAmount;
        if (debitAmount <= balance) {
            actualDebitAmount = debitAmount;
        } else {
            actualDebitAmount = balance;
        }
        balance -= actualDebitAmount;
        return actualDebitAmount;
    }

    public void transferFromMeTo(Account account, double amount) {
        if (amount <= balance) {
            account.credit(debit(amount));
        } else {
            System.out.println("Balance is low");
        }
    }
}
