import java.io.*;
import java.util.*;
class UserDetails 
{
    static String name,add;
    static long no;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        name=sc.nextLine();
        System.out.println("Enter your mobile number");
        no=sc.nextLong();
        System.out.println("Enter your address:");
        add=sc.next();
    }
    public static void main(String args[])throws IOException
    {
        UserDetails obj=new UserDetails();
        obj.input();
        File file1=new File("User Name.txt");
        FileWriter fr1=new FileWriter(file1,true);
        BufferedWriter br1=new BufferedWriter(fr1);
        br1.append(name);
        br1.newLine();
        br1.close();
        fr1.close();
        File file2=new File("User Contact number.txt");
        FileWriter fr2=new FileWriter(file2,true);
        BufferedWriter br2=new BufferedWriter(fr2);
        br2.write(Long.toString(no));
        br2.newLine();
        br2.close();
        fr2.close();
        File file3=new File("User Address.txt");
        FileWriter fr3=new FileWriter(file3,true);
        BufferedWriter br3=new BufferedWriter(fr3);
        br3.write(add);
        br3.newLine();
        br3.close();
        fr3.close();
    }
}