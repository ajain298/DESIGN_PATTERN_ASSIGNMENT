public class ProductList extends Reminder
{
    public static String ProdList1[]= {"Beef","Pork", "Mutton"};
    public static String ProdList2[] = {"Tomato","Onion"};
    public Iterator getIterator()
    {
        return new ProductIterator();
    }

    public Reminder accept(NodeVisitor visitor)
    {
        return visitor.visitProduct(this);

    }
    static String[] List(String type)
    {
        if((type.equalsIgnoreCase("Meat product")))
        {
            return ProdList1;
        }
        else
        {
            return ProdList2;
        }
    }


}
