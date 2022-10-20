public class Product
{
    public static String ProdList1[]= {"Beef","Pork", "Mutton"};
    public static String ProdList2[] = {"Tomato","Onion"};

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
