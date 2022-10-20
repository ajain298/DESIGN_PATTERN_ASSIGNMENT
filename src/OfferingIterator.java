public class OfferingIterator implements Iterator
{
    public boolean hasNext(Iterator I)
    {
        return I.hasNext(I);
    }
    public Offering Nexto(Iterator I)
    {
        if(this.hasNext(I))
        {
            return I.Nexto(I);
        }
        else
            return null;
    }
    public Product Nextp(Iterator I)
    {
        return null;
    }

}
