public class OfferingList
{
    public String[][] OfferList = {
            {"tutu","Beef"},
            {"tutu","Tomato"},
            {"mimi","Beef"},
            {"mimi","Onion"},
            {"pepe","Beef"},
            {"pepe","Tomato"},
            {"pepe","Onion"}
    };
    public Iterator getIterator()
    {
        return new OfferingIterator();
    }
}
