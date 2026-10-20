abstract class ATM {
    abstract void withdrawMoney();

    void insertCard() {
        System.out.println("Card inserted successfully");
    }
}

class BankATM extends ATM {
    @Override
    void withdrawMoney() {
        System.out.println("Verifying PIN...");
        System.out.println("Checking account balance...");
        System.out.println("Cash dispensed successfully");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        ATM atm = new BankATM();

        atm.insertCard();
        atm.withdrawMoney();
    }
}
