import java.util.Scanner;

class review
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("What would you like your user name to be?\n");
        String userName = scan.nextLine(); //scan.next()

        System.out.print("What would you like your password to be?\n");
        String password = scan.nextLine();

        System.out.print("*******************************\n");
        System.out.print("*   Welcome to my login page   *\n");
        System.out.print("********************************\n");

        boolean flag = true;
        
        String userUserName = "";
        String userPassword = "";

        while(flag)
        {
            System.out.print("Please enter your user name: \n");
            userUserName = scan.nextLine();

            System.out.print("\nPlease enter your password: \n");
            userPassword = scan.nextLine();

            if(userUserName.equals(userName) && userPassword.equals(password))
            {
                flag = false;
                System.out.print("\nExcellent Job! You Logged in to this very official program, obviously.\n");
            }
            else
            {
                System.out.print("Your user name or password is incorrect, please try again, nerd\n");
            }
        }


    }
}