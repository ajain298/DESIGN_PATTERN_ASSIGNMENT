public class Buyer extends Person
{
    private ProductMenu theProduct;

    Buyer(ProductMenu thePM)
    {
        super(thePM);
        this.theProduct = thePM;
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
