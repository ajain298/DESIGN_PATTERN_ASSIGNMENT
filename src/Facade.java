import java.util.Scanner;
public class Facade {
    String UserName;
    String Password;
    private int UserType;
    private String theSelectedProduct;
    Iterator I1;
    Iterator I2;
    ProductList PL;
    ProductIterator p;
    OfferingList OL;
    OfferingIterator o;

    public int login()
    {
        System.out.println("Enter your Username : ");
        Scanner scan = new Scanner(System.in);
        UserName = scan.next();
        System.out.println("Enter your Password : ");
        Password = scan.next();

        if((UserName.equalsIgnoreCase("tutu")) && (Password.equalsIgnoreCase("1111")))
        {
            UserType = 0;
        }
        else if((UserName.equalsIgnoreCase("mimi")) && (Password.equalsIgnoreCase("2222")))
        {
            UserType = 0;
        }
        else if((UserName.equalsIgnoreCase("nana")) && (Password.equalsIgnoreCase("3333")))
        {
            UserType = 0;
        }
        else if((UserName.equalsIgnoreCase("pepe")) && (Password.equalsIgnoreCase("3333")))
        {
            UserType = 1;
        }
        else if((UserName.equalsIgnoreCase("buyer")))
        {
            UserType = 0;
        }
        else if((UserName.equalsIgnoreCase("seller")))
        {
            UserType = 1;
        }
        else
        {
            System.out.println("No such user found !!!");
            System.exit(-1);
        }
        return UserType;

    }

    public String SelectProduct()
    {
        System.out.println("Please choose one product from the following product menu : ");
        System.out.println("A. Meat Product \n B. Produce Product");
        Scanner scan = new Scanner(System.in);
        theSelectedProduct = scan.nextLine();
        return theSelectedProduct;
    }
    public void createProdObj(ProductMenu pm, int UserType)
    {
        pm.assignPerson(UserType);
    }
    public void remind()
    {
        ProductList pl = new ProductList();
        Trading t = new Trading();
        ReminderVisitor r = new ReminderVisitor();
        pl.accept(r);
        t.accept(r);

    }

    public void begin()
    {
        System.out.println("WELCOME !!!");
        UserType = login();
        System.out.println("Successfully running Facade pattern");
        theSelectedProduct = SelectProduct();
        if((theSelectedProduct.equalsIgnoreCase("Meat Product")))
        {
            createProdObj(new MeatProductMenu(),UserType);
        }
        else if((theSelectedProduct.equalsIgnoreCase("Produce Product")))
        {
            createProdObj(new ProduceProductMenu(), UserType);
        }
        else
        {
            System.out.println("No such option is available in the Menu !!!");
            System.exit(-1);
        }
        remind();
        PL = new ProductList();
        OL = new OfferingList();
        I1 = PL.getIterator();
        I2 = OL.getIterator();
        while(p.hasNext(I1))
        {
            System.out.println(p.Nextp(I1));
            System.out.println(o.Nexto(I2));

        }



    }


}
