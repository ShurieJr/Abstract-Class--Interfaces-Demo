package InterfaceExample;

public interface PaymentMethod {
    boolean validatePayment();
    void processPayment(double amount);
}

