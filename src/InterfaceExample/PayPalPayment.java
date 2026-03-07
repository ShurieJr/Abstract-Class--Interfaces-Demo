package InterfaceExample;

public class PayPalPayment implements PaymentMethod {

    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public boolean validatePayment() {
        System.out.println("Validating PayPal account...");
        return email.contains("@");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
