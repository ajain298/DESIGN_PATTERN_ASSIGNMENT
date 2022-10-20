
public class ProductIterator implements Iterator
{

    public boolean hasNext(Iterator I)
    {
            return I.hasNext(I);
    }
    public Product Nextp(Iterator I)
    {
        if(this.hasNext(I))
        {
            return I.Nextp(I);
        }
        else
            return null;
    }
    public Offering Nexto(Iterator I)
    {
        return null;
    }
    public void MoveToHead(Iterator I)
    {

    }
    public void Remove(Iterator I)
    {
        if(this.hasNext(I))
        {
            I.Nextp(I);
        }
    }
}
