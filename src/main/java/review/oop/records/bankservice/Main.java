package review.oop.records.bankservice;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Sam", "Smith", "C123");

        Account account1 = new Account("A123", new BigDecimal("30000"), client1);
        Account account2 = new Account("A456", new BigDecimal("15000"), client1);

        account1.deposit(new BigDecimal("2500"));
        System.out.println(account1);
        account1.deposit(new BigDecimal("1080"));
        System.out.println(account1);

        account1.withdraw(new BigDecimal("20000"));
        System.out.println(account1);


        Set<Account> accountSet = new HashSet<>();
        accountSet.add(account1);
        accountSet.add(account2);

        BankService bankService1 = new BankService(accountSet);
        System.out.println((bankService1));
    }
}
