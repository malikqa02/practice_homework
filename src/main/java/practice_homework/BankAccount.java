package practice_homework;

public class BankAccount {
    int balance;
    String owner;
    public BankAccount(int someBalance, String someOwner){
        this.balance = someBalance;
        this.owner = someOwner;
    }
    int getBalance(){
        return this.balance;
    }
    String getOwner(){
        return this.owner;
    }
    void setBalance(int newBalance){
        this.balance = newBalance;
    }
    void setOwner(String newOwner){
        this.owner = newOwner;
    }
    void deposit(int amount){
        balance += amount;
    }
    void withdraw(int amount){
        balance -= amount;
    }
    void printBalance(){
        System.out.println("Баланс - " + getBalance());
    }
}
