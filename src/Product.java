public class Product
{
    String p;
    String type;
    Product(String prod, String t)
    {
        this.p = prod;
        this.type = t;
    }
    String getCategory()
    {
        return type;
    }
    String showMenu()
    {
        return this.p;
    }

}
