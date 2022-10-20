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
    public void MoveToHead(Iterator I)
    {

    }
    public void Remove(Iterator I)
    {
        if(this.hasNext(I))
        {
            I.Nexto(I);
        }

    }
}
