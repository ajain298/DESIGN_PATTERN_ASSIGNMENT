public class ReminderVisitor extends NodeVisitor{
    private Reminder m_Reminder;
    public Reminder visitProduct(ProductList product)
    {
        System.out.println("Displaying PRODUCT");
        return product;
    }
    public void visitTrading(Trading trading)
    {
        System.out.println("Displaying TRADING");
    }
    public void visitFacade(Facade facade)
    {
        System.out.println("Displaying FACADE");
    }

}
