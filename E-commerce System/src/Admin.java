public class Admin extends User
{
    public Admin(int userId, String username, String email)
    {
        super(userId, username, email);
    }

    public void updateProduct(Product product)
    {
        System.out.println("Admin " + username + " can update product: " + product.getName());
    }

    @Override
    public String getUserDetails()
    {
        return "Admin{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", role=Administrator" +
                '}';
    }
}