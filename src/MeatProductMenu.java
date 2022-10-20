public class MeatProductMenu implements ProductMenu
{
    public void assignPerson(int usertype)
    {
        Person p;
        System.out.println("Successfully implemented Bridge design pattern");
        System.out.println("Successfully implemented Factory method design pattern");
        if(usertype == 0)
        {
            p = FactoryMethod.getProdObject("Buyer");
        }
        else
        {
            p = FactoryMethod.getProdObject("Seller");
        }
    }
    public void showMenu()
    {
        System.out.println();
    }
    public void showAddButton()
    {
        System.out.println();
    }
    public void showViewButton()
    {
        System.out.println();
    }
    public void showRadioButton()
    {
        System.out.println();
    }
    public void showLabels()
    {
        System.out.println();
    }
    public void showComboxes()
    {
        System.out.println();
    }
}
