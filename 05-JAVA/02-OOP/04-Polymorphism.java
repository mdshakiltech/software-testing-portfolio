class Payment {
    void pay() {
        System.out.println("Processing payment");
    }
}

class UpiPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Payment through UPI");
    }
}

class CardPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Payment through debit or credit card");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Payment payment;

        payment = new UpiPayment();
        payment.pay();

        payment = new CardPayment();
        payment.pay();
    }
}
