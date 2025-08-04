
public class PayPalPayment implements Payment {
    private String email;
    private String password;


    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public boolean processPayment(double amount, String currency) {
        if (!Payment.isValidAmount(amount)) {
            System.out.println("Invalid payment amount: " + amount);
            return false;
        }

        if (!validateCard(email)) {
            System.out.println("Invalid PayPal email");
            return false;
        }

        // Simulate payment processing
        System.out.println("Processing PayPal Payment:");
        System.out.println("Amount: " + amount + " " + currency);
        System.out.println("PayPal Email: " + email);
        System.out.println("Connecting to PayPal servers...");
        System.out.println("Payment processed successfully via PayPal!");

        return true;
    }

    @Override
    public boolean validateCard(String email) {
        // Simple email validation
        if (email == null || email.isEmpty()) {
            return false;
        }

        return email.contains("@") && email.contains(".");
    }

    @Override
    public String getPaymentType() {
        return "PayPal Payment";
    }

    // PayPal specific method
    public boolean authenticateUser() {
        // Simulate authentication
        System.out.println("Authenticating PayPal user: " + email);
        return password != null && password.length() >= 6;
    }

    // Getters
    public String getEmail() {
        return email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }
}