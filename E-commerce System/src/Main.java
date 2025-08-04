public class Main
{
    public static void main(String[] args)
    {
        System.out.println("=== E-Commerce System Demo ===\n");

        Product laptop = new Product(1, "Gaming Laptop", 1299.99, 10);
        Product mouse = new Product(2, "Wireless Mouse", 29.99, 50);

        System.out.println(laptop);
        System.out.println(mouse);


        Customer customer = new Customer(101, "john_doe", "john@example.com");
        Admin admin = new Admin(201, "admin_mike", "mike@company.com");

        System.out.println(customer);
        System.out.println(admin);

        System.out.println("Different user details:");
        System.out.println(customer.getUserDetails());
        System.out.println(admin.getUserDetails());

        System.out.println("\nDifferent placeOrder methods:");
        customer.placeOrder(1);
        customer.placeOrder(2, 3);
        customer.placeOrder(laptop, 1);

        admin.updateProduct(laptop);

        Payment creditCard = new CreditCardPayment("1234567890123456", "John Doe");
        Payment paypal = new PayPalPayment("john@example.com", "password123");

        System.out.println("Payment Types:");
        System.out.println(creditCard.getPaymentType());
        System.out.println(paypal.getPaymentType());

        System.out.println("\nProcessing Payments:");
        creditCard.processPayment(100.0, "USD");
        paypal.processPayment(50.0, "USD");

    }
}