public class ReminderVisitor extends NodeVisitor{
    private Reminder m_Reminder;
    public Reminder visitProduct(ProductList product)
    {
        System.out.println("Displaying product");
        return product;
    }
    public void visitTrading(Trading trading)
    {
        System.out.println("Displaying trading");
    }
    public void visitFacade(Facade facade)
    {
        System.out.println("Displaying facade");
    }

}
