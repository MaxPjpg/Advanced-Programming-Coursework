package com.AbstractMethods;

abstract class BankAccount{
    float balance;
    public BankAccount(float accountBalance){
        balance = accountBalance;
    }
    public abstract int accountNumber(int accountnumber);
    public abstract String accountName(String name);

    public float deposit(float depositAmount){
        return balance += depositAmount;
    };
}
public class Main extends BankAccount {

    public float withdraw(float withdrawAmount){
        return balance -= withdrawAmount;
    }

    public Main(float accountBalance) {
        super(accountBalance);
    }

    public static void main(String[] args) {
	Main account1 = new Main(0);
        System.out.println(account1.accountNumber(343));
        System.out.println(account1.accountName("Steve"));
        account1.deposit(300);
        System.out.println(account1.balance);
        account1.withdraw(100);
        System.out.println(account1.balance);
    }
    @Override
    public String accountName(String name){
        return name + "!";
    }

    @Override
    public int accountNumber(int accountnumber) {
        return accountnumber;
    }
    @Override
    public float deposit(float depositAmount){
        return balance += depositAmount;
    }
}
