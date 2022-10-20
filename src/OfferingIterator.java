import java.util.List;
public class OfferingIterator implements Iterator
{
    String user_name;
    public List<Offering>o;
    int index;
    OfferingIterator(String n, List<Offering>offer)
    {
        this.user_name = n;
        this.o= offer;
    }

    public boolean hasNext()
    {
        while(index<o.size())
        {
            Offering o1 = o.get(index);
            if(o1.getUser().equals(user_name))
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
        return null;
    }
    public Offering Nexto()
    {
        Offering o1 = o.get(index);
        index++;
        return o1;

    }

}
