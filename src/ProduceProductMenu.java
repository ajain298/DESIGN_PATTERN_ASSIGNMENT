public class ProduceProductMenu implements ProductMenu{


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
