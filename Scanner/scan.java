import java.util.Scanner;

class scan
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        System.out.print("Enter Here: ");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);

        System.out.println("What is your age?");
        System.out.print("Enter Here: ");
        int number = scanner.nextInt();

        // number = number/5;
        number /= 5;

        //number = number + 1
        number++;

        //number = number + 1
        number += 1;

        System.out.println("Your age divided by 5 and plus 2 is " + number);
    }
}