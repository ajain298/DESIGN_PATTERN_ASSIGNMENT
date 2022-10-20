public class ProductList extends Reminder
{
    public Iterator getIterator()
    {
        return new ProductIterator();
    }

    public Reminder accept(NodeVisitor visitor) {
        return visitor.visitProduct(this);

    }
}
