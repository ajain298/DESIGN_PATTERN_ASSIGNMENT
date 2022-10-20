public class Offering
{
    String o;
    String name;
    Offering(String offer, String n)
    {
        this.o = offer;
        this.name = n;
    }
    String getUser()
    {
        return name;
    }
    String showMenu()
    {
        return this.o;
    }

}
