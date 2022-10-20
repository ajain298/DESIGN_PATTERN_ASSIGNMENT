public class MeatProductMenu implements ProductMenu
{
    public void assignPerson(int usertype)
    {
        Person p;
        if(usertype == 0)
        {
            p = FactoryMethod.getProdObject("Buyer");
        }
        else
        {
            p = FactoryMethod.getProdObject("Seller");
        }
    }

    @Override
    public void addProduct(Product p)
    {
        System.out.println();
    }

    @Override
    public ProductIterator iterator(String type)
    {
        return null;
    }

}
