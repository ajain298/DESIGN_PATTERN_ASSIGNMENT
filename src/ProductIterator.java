import java.util.List;
public class ProductIterator implements Iterator
{
    String type;
    public List<Product> p;
    int index;
    ProductIterator(String ty, List<Product>prod)
    {
        this.type = ty;
        this.p = prod;
    }

    public boolean hasNext()
    {
        while(index<p.size())
        {
            Product p1 = p.get(index);
            if(p1.getCategory().equals(type))
            {
                return true;
            }
            else
                index++;
        }
        return false;
    }
    public Product Nextp()
    {
        Product p1 = p.get(index);
        index++;
        return p1;

    }
    public Offering Nexto()
    {
        return null;
    }

}
