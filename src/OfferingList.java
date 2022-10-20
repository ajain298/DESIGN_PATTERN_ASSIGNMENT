public class OfferingList
{
    public String OfferList1[] = {"Beef","Tomato"};
    public String OfferList2[] = {"Beef","Onion"};
    public String OfferList3[] = {"Beef","Tomato","Onion"};

    public Iterator getIterator()
    {
        return new OfferingIterator();
    }
}
