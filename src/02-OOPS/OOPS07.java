/*
OOPS 07 — ENCAPSULATION

- Encapsulation means wrapping data and methods
  together inside a class.

- It also provides controlled access to data.

- 'private' is commonly used to hide data.

Example:

private int balance;

- Access private data through methods like:
  getBalance()
  setBalance()

Remember:

private data
     ↓
 getter / setter
     ↓
 outside world

Encapsulation = Data hiding + controlled access.
*/

class BankAccount {

    // Private Data

    private String accountHolder;
    private double balance;

    // Setter for accountHolder

    void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;

    }

    // Getter for accountHolder
    String getAccountHolder() {
        return accountHolder;
    }

    // Setter for Balance
    void  setBalance(double balance) {
        this.balance = balance;
    }

    // Getter for Balance
    double getBalance() {
        return balance;
    }
}

public class OOPS07 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setAccountHolder("Dipika");
        account.setBalance(500);
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Balance: " + account.getBalance());


    }
}


