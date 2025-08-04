public interface Payment
{
    boolean processPayment(double amount, String currency);
    boolean validateCard(String cardNumber);

    default String getPaymentType()
    {
        return "Generic Payment";
    }

    static boolean isValidAmount(double amount)
    {
        return amount > 0;
    }
}