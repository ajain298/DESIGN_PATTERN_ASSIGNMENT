public class Buyer extends Person
{
    Buyer()
    {
        super(theProductMenu);
    }
    public void showMenu()
    {
        System.out.println("The product items for the Buyer : ");

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
