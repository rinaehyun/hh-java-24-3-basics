package review.oop.records.bankservice;

import java.math.BigDecimal;

public class Account {
    // Fields
    String accountNumber;
    BigDecimal accountBalance;
    Client client;

    // Constructors
    public Account() {}

    public Account(String accountNumber, BigDecimal accountBalance, Client client) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.client = client;
    }

    // Print
    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                ", client=" + client +
                '}';
    }

    // Methods
    public void deposit(BigDecimal deposit) {
        this.accountBalance = accountBalance.add(deposit);
    }

    public void withdraw(BigDecimal withdrawal) {
        this.accountBalance = accountBalance.subtract(withdrawal);
    }
}
