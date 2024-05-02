package org.example.Teht14;

import java.util.HashMap;

public class Bank {
    public HashMap<String, Account> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    public void addAcc(Account account) {
        accounts.put(account.getAccNum(), account);
    }

    public void delAcc(String accNum) {
        accounts.remove(accNum);
    }

    public void showAccInfo(String accNum) {
        Account account = accounts.get(accNum);
        account.accInfo();
    }


}
