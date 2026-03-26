package InterfaceExample;

public class Main {
    static void main() {
        CheckoutService checkout = new CheckoutService();

        PaymentMethod payment1 =
                new CreditCardPayment("1234567890123458");
        checkout.checkout(payment1, 100);
        System.out.println("--------------");

        PaymentMethod mobileMoney = new MobileMoneyPayment("615294858");
        checkout.checkout(mobileMoney, 100);
        System.out.println("---------------");

        PaymentMethod paypalMethod = new PayPalPayment("shuuriye@gmail.com");
        checkout.checkout(paypalMethod, 45);



    }
}
