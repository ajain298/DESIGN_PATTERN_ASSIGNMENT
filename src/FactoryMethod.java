public class FactoryMethod
{

    public static Person getProdObject(String choice)
    {

        if(choice.equalsIgnoreCase("Buyer"))
        {
            return new Buyer();
        }
        else
        {
            return new Seller();
        }
    }
}
