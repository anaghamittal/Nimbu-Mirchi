import java.io.*;
class user extends details
{
    public static void main(String[]args)throws IOException
    {
        System.out.println("Press 1 if you are a new user, Press 2 if you are a old customer");
        int k=s.nextInt();
        user ob=new user();
        switch(k)
        {
            case 1:
            System.out.println(" Enter name:");
            String naam=s.nextLine();
            ob.Name(naam);
            System.out.println("Enter a valid email(eg: user@gmail.com) and a password");
            ob.login();
            System.out.println("Enter your address:");
            ob.address();
            System.out.println("Enter your contact number");
            ob.contact();
            break;
            case 2:
            System.out.println("Enter your mail id:");
            String id=s.nextLine();
            ob.login(id);
            break;
        }

    }
}