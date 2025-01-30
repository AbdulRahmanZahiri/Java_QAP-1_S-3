// Write a test program called TestAccount (in another source file called TestAccount.java) which uses the Account class
public class TestAccount {
    public static void main(String[] args) {
        // Create two accounts with specified balances
        Account acc1 = new Account("1", "Account Number 1", 10000);
        Account acc2 = new Account("2", "Account Number 2", 8000);

        // Display balance of both accounts
        System.out.println("Balance of Account 1: " + acc1.getBalance());
        System.out.println("Balance of Account 2: " + acc2.getBalance());

        // Transfer $1000 from account 1 to account 2
        acc1.transferTo(acc2, 1000);

        // Display balance of both accounts again
        System.out.println("Balance of Account 1 after transfer: " + acc1.getBalance());
        System.out.println("Balance of Account 2 after transfer: " + acc2.getBalance());
    }
}
