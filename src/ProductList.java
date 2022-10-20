import java.util.List;
public class ProductList extends Reminder implements ProductMenu
{
    List<Product> prod;
    public Iterator getIterator(String ty)
    {
        return new ProductIterator(ty, this.prod);
    }

    public Reminder accept(NodeVisitor visitor) {
        return visitor.visitProduct(this);

    }
    public void assignPerson(int usertype)
    {

    }
    public void addProduct(Product p)
    {

    }
    public ProductIterator iterator(String type)
    {
        return null;
    }

}
