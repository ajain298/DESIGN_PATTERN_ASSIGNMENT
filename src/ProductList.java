public class ProductList extends Reminder
{
    public String[][] ProdList = {
            {"Meat","Beef"},
            {"Meat","Pork"},
            {"Meat","Mutton"},
            {"Produce","Tomato"},
            {"Produce","Onion"}
    };
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
