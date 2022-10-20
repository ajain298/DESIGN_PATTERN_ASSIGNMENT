public class Seller extends Person
{
    ProductMenu theProduct;
    Seller()
    {
        super(theProductMenu);
    }

    public void showMenu()
    {
        System.out.println("The product items for the Seller : ");

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
