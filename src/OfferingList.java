import java.util.List;
public class OfferingList implements OfferMenu
{
    List<Offering> offer;
    public Iterator getIterator(String userName)
    {
        return new OfferingIterator(userName, this.offer);
    }
    public void addOffering(Offering o)
    {

    }
    public OfferingIterator iterator(String userName)
    {
        return null;
    }

}
