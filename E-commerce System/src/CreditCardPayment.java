public class CreditCardPayment implements Payment
{
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName)
    {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public boolean processPayment(double amount, String currency)
    {
        System.out.println("Processing Credit Card Payment:");
        System.out.println("Amount: " + amount + " " + currency);
        System.out.println("Cardholder: " + cardHolderName);
        System.out.println("Payment processed successfully!");
        return true;
    }

    @Override
    public boolean validateCard(String cardNumber)
    {
        return cardNumber != null && cardNumber.length() == 16;
    }

    @Override
    public String getPaymentType()
    {
        return "Credit Card Payment";
    }
}