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

}
