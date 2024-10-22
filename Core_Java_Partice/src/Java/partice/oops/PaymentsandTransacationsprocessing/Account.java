package Java.partice.oops.PaymentsandTransacationsprocessing;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private double balance;
    private List<Transaction> transactions;

    public Account(double initialBalance) {
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
    }

    public void sendMoneyToAccount(Account accountTo, double moneyAmount) {
        if (moneyAmount <= 0 || moneyAmount > this.balance) {
            throw new IllegalArgumentException("Insufficient balance or invalid amount.");
        }
        this.withdrawMoney(moneyAmount);
        accountTo.depositMoney(moneyAmount);
        transactions.add(new Transaction(StandardAccountOperations.SEND, moneyAmount));
    }

    public void withdrawMoney(double moneyAmount) {
        if (moneyAmount <= 0 || moneyAmount > this.balance) {
            throw new IllegalArgumentException("Insufficient balance or invalid amount.");
        }
        this.balance -= moneyAmount;
        transactions.add(new Transaction(StandardAccountOperations.WITHDRAW, moneyAmount));
    }

    public void depositMoney(double moneyAmount) {
        if (moneyAmount <= 0) {
            throw new IllegalArgumentException("Invalid deposit amount.");
        }
        this.balance += moneyAmount;
        transactions.add(new Transaction(StandardAccountOperations.DEPOSIT, moneyAmount));
    }

    public Transaction[] getTransactions() {
        return transactions.toArray(new Transaction[0]);
    }

    public double getBalance() {
        return balance;
    }

    public static class Transaction {
        private StandardAccountOperations operationType;
        private double amount;

        public Transaction(StandardAccountOperations operationType, double amount) {
            this.operationType = operationType;
            this.amount = amount;
        }

        public StandardAccountOperations getOperationType() {
            return operationType;
        }

        public double getAmount() {
            return amount;
        }

        @Override
        public String toString() {
            return "Transaction{" +
                    "operationType=" + operationType +
                    ", amount=" + amount +
                    '}';
        }
    }
}
