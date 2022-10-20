import java.util.List;
public class ProductList extends Reminder
{
    List<Product> prod;
    public Iterator getIterator(String ty)
    {
        return new ProductIterator(ty, this.prod);
    }

    public Reminder accept(NodeVisitor visitor) {
        return visitor.visitProduct(this);

    }
}
