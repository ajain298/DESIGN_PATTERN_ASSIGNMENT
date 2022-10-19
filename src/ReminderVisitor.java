public class ReminderVisitor extends NodeVisitor{
    private Reminder m_Reminder;
    public Reminder visitProduct(Product product)
    {
        return m_Reminder;
    }
    public Reminder visitTrading(Trading trading)
    {
        return m_Reminder;
    }
    public void visitFacade(Facade facade)
    {

    }

}
