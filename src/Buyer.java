public class Buyer extends Person
{
    Buyer()
    {
        super(theProductMenu);
    }
    public ProductMenu CreateProductMenu(String p)
    {
        if(p.equalsIgnoreCase("Meat Product"))
        {
            return new MeatProductMenu();
        }
        else
        {
            return new ProduceProductMenu();
        }


    }

}
