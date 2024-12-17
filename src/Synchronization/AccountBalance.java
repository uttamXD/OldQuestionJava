package Synchronization;

public class AccountBalance {
    public static void main(String[] args) {
        BankBalance Bal = new BankBalance();

        // Creating threads
        Thread threadDeposit = new Thread(() -> {
            Bal.deposit(500);
        });

        Thread threadWithdraw = new Thread(() -> {
            Bal.withdraw(600);
        });

        // Starting threads and ensuring they complete before printing the balance
        try {
            threadDeposit.start();
            threadWithdraw.start();

            threadDeposit.join();
            threadWithdraw.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final balance
        System.out.println("Final Balance: " + Bal.getBalance());
    }
}
