public class ReminderVisitor extends NodeVisitor
{

    public Reminder visitProduct(ProductList product)
    {
        System.out.println("Product list accessed");
        return product;
    }
    public void visitTrading(Trading trading)
    {
        System.out.println("Finding out Trading information");
    }
    public void visitFacade(Facade facade)
    {
        System.out.println();
    }

}
