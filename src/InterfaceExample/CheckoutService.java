package InterfaceExample;

public class CheckoutService {

    public void checkout(PaymentMethod payment, double amount) {
        if (payment.validatePayment()) {
            payment.processPayment(amount);
            System.out.println("Payment successful.");
        } else {
            System.out.println("Payment validation failed.");
        }
    }
}
