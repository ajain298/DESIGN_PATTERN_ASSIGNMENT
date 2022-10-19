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
    public int usertype_validation(String UserName, String Password)
    {
        if((UserName.equalsIgnoreCase("tutu")) && (Password.equalsIgnoreCase("1111")))
        {
            usertype = 0;
        }
        else if((UserName.equalsIgnoreCase("mimi")) && (Password.equalsIgnoreCase("2222")))
        {
            usertype = 0;
        }
        else if((UserName.equalsIgnoreCase("nana")) && (Password.equalsIgnoreCase("3333")))
        {
            usertype = 0;
        }
        else if((UserName.equalsIgnoreCase("pepe")) && (Password.equalsIgnoreCase("3333")))
        {
            usertype = 1;
        }
        else
        {
            System.out.println("No such user found !!!");
            System.exit(-1);
        }
        return usertype;
    }
}
