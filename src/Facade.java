import java.util.Scanner;
public class Facade {
    String UserName;
    String Password;
    private int UserType;
    private Product theSelectedProduct;
    private int nProductCategory;
    private ProductList theProductList;
    private Person thePerson;

    public Facade() {
    }

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
        else
        {
            System.out.println("No such user found !!!");
            System.exit(-1);
        }
        return UserType;

    }

    public void createUser(UserInfoItem userinfoitem)
    {
    }

    public void createProductList(){

    }

    public void AttachProductToUser(){

    }

    public Product SelectProduct(){

    }

    public void productOperation(){

    }

    public void addTrading(){

    }

    public void viewTrading(){

    }

    public void decideBidding(){

    }

    public void discussBidding(){

    }

    public void submitBidding(){

    }

    public void remind(){

    }

    public void begin()
    {

    }


}
