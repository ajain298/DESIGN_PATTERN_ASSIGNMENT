public class ProduceProductMenu implements ProductMenu
{
    public void assignPerson(int usertype)
    {
        Person p;
        System.out.println("Bridge design pattern");
        System.out.println("Factory method design pattern");
        if(usertype == 0)
        {
            p = FactoryMethod.getProdObject("Buyer");
        }
        else
        {
            p = FactoryMethod.getProdObject("Seller");
        }
    }
    public void addProduct(Product p)
    {
        System.out.println();
    }
    public ProductIterator iterator(String type)
    {
        return null;
    }
}
