public class Buyer extends Person
{
    private ProductMenu theProduct;
    Person person;
    Buyer()
    {
        super(theProductMenu);
    }

    Buyer(ProductMenu theProductMenu)
    {
        super(theProductMenu);
        this.theProduct = theProductMenu;
    }
    public void showMenu()
    {
        System.out.println("The product items for the Buyer : ");

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
