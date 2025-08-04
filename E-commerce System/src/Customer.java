import java.util.ArrayList;
import java.util.List;

public class Customer extends User
{
    private List<String> orderHistory;


    public Customer(int userId, String username, String email)
    {
        super(userId, username, email);
        this.orderHistory = new ArrayList<>();
    }

    // Method overloading - different versions of placeOrder
    public void placeOrder(int productId)
    {
        String order = "Order placed for Product ID: " + productId;
        orderHistory.add(order);
        System.out.println("Customer " + username + " placed order: " + order);
    }

    public void placeOrder(int productId, int quantity)
    {
        String order = "Order placed for Product ID: " + productId + ", Quantity: " + quantity;
        orderHistory.add(order);
        System.out.println("Customer " + username + " placed order: " + order);
    }

    public void placeOrder(Product product, int quantity)
    {
        if (product.getStock() >= quantity)
        {
            product.reduceStock(quantity);
            String order = "Order placed for " + product.getName() +
                    " (ID: " + product.getProductId() + "), Quantity: " + quantity;
            orderHistory.add(order);
            System.out.println("Customer " + username + " placed order: " + order);
        } else
        {
            System.out.println("Sorry, not enough stock for " + product.getName());
        }
    }

    @Override
    public String getUserDetails()
    {
        return "Customer{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", totalOrders=" + orderHistory.size() +
                '}';
    }

    public List<String> getOrderHistory()
    {
        return new ArrayList<>(orderHistory);
    }

    public void displayOrderHistory()
    {
        System.out.println("Order History for " + username + ":");
        if (orderHistory.isEmpty())
        {
            System.out.println("No orders placed yet.");
        } else
        {
            for (String order : orderHistory)
            {
                System.out.println("- " + order);
            }
        }
    }
}