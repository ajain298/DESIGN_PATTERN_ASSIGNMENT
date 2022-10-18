public class FactoryMethod
{

    public Person getProdObject(String choice)
    {
        Person person;
        if(choice.equalsIgnoreCase("Buyer"))
        {
            person = new Buyer();
        }
        else
        {
            person =  new Seller();
        }
        return person;
    }
}
