package review.oop.records.bankservice;

import java.util.HashSet;
import java.util.Set;

public class BankService {
    // Fields
    Set<Account> accountSet;

    // Constructors
    public BankService() {
        this.accountSet = new HashSet<>();
    }

    public BankService(Set<Account> accountSet) {
        this.accountSet = new HashSet<>(accountSet);
    }

    // Print
    @Override
    public String toString() {
        return "BankService{" +
                "accountSet=" + accountSet +
                '}';
    }
}
