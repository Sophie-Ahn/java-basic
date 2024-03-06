package oop1.ex;

public class Account {
    int balance = 0;

    int deposit(int amount) {
        balance += amount;
        return balance;
    }

    int withdraw(int amount){
        if (balance < amount) {
            System.out.println("잔액 부족");
        } else {
            balance -= amount;
        }

        return balance;
    }
}
