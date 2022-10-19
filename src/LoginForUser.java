import java.util.Scanner;
public class LoginForUser
{
    private int usertype;
    String UserName;
    String Password;
    LoginForUser()
    {
    }
    public int login()
    {
        System.out.println("Enter your Username : ");
        Scanner scan = new Scanner(System.in);
        UserName = scan.next();
        System.out.println("Enter your Password : ");
        Password = scan.next();

    }
    public int usertype_validation()
    {

    }
}
