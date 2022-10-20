import java.util.List;
public class OfferingList
{
    List<Offering> offer;
    public Iterator getIterator(String userName)
    {
        return new OfferingIterator(userName, this.offer);
    }

}
