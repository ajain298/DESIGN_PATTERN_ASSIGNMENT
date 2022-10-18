public class Seller extends Person
{
    private ProductMenu theProduct;

    Seller()
    {
        super(theProductMenu);
    }
    Seller(ProductMenu theProductMenu)
    {
        super(theProductMenu);
        this.theProduct = theProductMenu;
    }

    public void showMenu()
    {
        System.out.println("The product items for the Seller : ");

    }
    public ProductMenu CreateProductMenu()
    {
        String p = "Meat Product";
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
