package Synchronization;

public class BankBalance {
    private int balance = 1000;

    public synchronized void deposit(int amount){
        int temp = balance;
        temp = temp + amount;
        balance = temp;
    }
    public synchronized void withdraw(int amount){
        int temp = balance;
        temp = temp - amount;
        balance = temp;
    }
    public int getBalance(){
        return balance;
    }
}
