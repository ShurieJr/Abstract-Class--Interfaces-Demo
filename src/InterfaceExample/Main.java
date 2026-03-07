package InterfaceExample;

public class Main {
    static void main() {
        CheckoutService checkout = new CheckoutService();

        PaymentMethod payment1 =
                new CreditCardPayment("1234567890123456");
        checkout.checkout(payment1, 100);
        System.out.println("--------------");

        PaymentMethod payment2 =
                new PayPalPayment("customer@email.com");
        checkout.checkout(payment2, 50);

    }
}
