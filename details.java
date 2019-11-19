import java.io.*;
import java.util.*;
//inheriting functions 
class details implements functions
{
    static Scanner s=new Scanner(System.in);
    public void Name(String naam)throws IOException
    {
        String n=s.nextLine();
        File file1=new File("UserName.txt");
        FileWriter fr1=new FileWriter(file1,true);
        BufferedWriter br1=new BufferedWriter(fr1);
        br1.write(n);
        br1.newLine();
        br1.close();
        fr1.close();
    }
    
    public void login()throws IOException
    {
        
        String mail=s.nextLine();
        String pass=s.nextLine();
        File file4=new File("mail.txt");
        FileWriter fr4=new FileWriter(file4,true);
        BufferedWriter br4=new BufferedWriter(fr4);
        br4.append(mail);
        br4.newLine();
        br4.close();
        fr4.close();
        File file5=new File("password.txt");
        FileWriter fr5=new FileWriter(file5,true);
        BufferedWriter br5=new BufferedWriter(fr5);
        br5.append(pass);
        br5.newLine();
        br5.close();
        fr5.close();
    }
    //overloading login function for old user
    public void login(String m)throws IOException 
    {
        String i=s.nextLine();
        int flag=1;
        int f=1;
        File file4=new File("mail.txt");
        final Scanner scanner = new Scanner(file4);
        while (scanner.hasNextLine()) 
        {
                final String lineFromFile = scanner.nextLine();
                if(lineFromFile.contains(i)) 
                { 
                    flag=1;
                    System.out.println("Enter password:");
                    String pas=s.nextLine();
                    File file5=new File("password.txt");
                    final Scanner scanner1 = new Scanner(file5);
                    while (scanner1.hasNextLine())
                    { 
                        final String lineFromFile1 = scanner1.nextLine();
                        if(lineFromFile1.contains(pas))
                        {
                            f=1;
                            System.out.println("Welcome to our online mini shop!");
                            break;
                        }
                        else
                        {
                            f=0;
                        }
                    }
                    if (f==0)
                    {
                        System.out.println("Wrong password!!");
                    }

                }
            
                else
                {
                    flag=0;
                }
            }
        
        if(flag==0)
        {
            System.out.println("Please Sign Up first.");
        }
    }
    public void address()throws IOException
    {
        String add=s.nextLine();
        File file3=new File("address.txt");
        FileWriter fr3=new FileWriter(file3,true);
        BufferedWriter br3=new BufferedWriter(fr3);
        br3.write(add);
        br3.newLine();
        br3.close();
        fr3.close();
    }
    public void contact()throws IOException
    {
        String no=s.nextLine();
        if (no.length()==10)
        {
            File file2=new File("contact.txt");
            FileWriter fr2=new FileWriter(file2,true);
            BufferedWriter br2=new BufferedWriter(fr2);
            br2.write(no);
            br2.newLine();
            br2.close();
            fr2.close();
        }
        else
        {
            System.out.println("Sorry! Please enter a valid 10 digit number!");
            contact();
        }    
    }
    
    
}