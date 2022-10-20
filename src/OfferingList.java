public class OfferingList
{
    public static String OfferList1[] = {"Beef","Tomato"};
    public static String OfferList2[] = {"Beef","Onion"};
    public static String OfferList3[] = {"Beef","Tomato","Onion"};

    public Iterator getIterator()
    {
        return new OfferingIterator();
    }
    static String[] Offer_list(int user,String s)
    {
        if((user == 0) && ((s.equalsIgnoreCase("tutu"))))
        {
            return OfferList1;
        }
        else if((user == 0) && ((s.equalsIgnoreCase("mimi"))))
        {
            return OfferList2;
        }
        else
        {
            return OfferList3;
        }
    }

}
