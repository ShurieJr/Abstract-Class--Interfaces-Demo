package InterfaceExample;

public class MobileMoneyPayment implements PaymentMethod {

    private String phoneNumber;

    public MobileMoneyPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean validatePayment() {
        System.out.println("Validating mobile money account...");
        return phoneNumber.length() >= 9;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing mobile money payment of $" + amount);
    }
}

