public class ProductList extends Reminder
{
    public String ProdList1[]= {"Beef","Pork", "Mutton"};
    public String ProdList2[] = {"Tomato","Onion"};
    public Iterator getIterator()
    {
        return new ProductIterator();
    }

    public Reminder accept(NodeVisitor visitor)
    {
        System.out.println("Successfully implemented Visitor design pattern");
        return visitor.visitProduct(this);

    }


}
