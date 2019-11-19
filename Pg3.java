import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
class Pg3 extends JFrame implements ActionListener
{
    JButton b1,b2;
    JFrame f;
    Pg3()
    {
        f=new JFrame("Welcome!");
        b1=new JButton("Vegetables");
        b2=new JButton("Fruits");
        b1.setBounds(180,150,100,50);
        b2.setBounds(180,300,100,50);
        f.add(b1);
        f.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            try{
            new StockV();
            f.dispose();
        }
        catch(Exception x)
        {
            System.out.println(x);
        }
        }
        if(e.getSource()==b2)
        {
            try{
            new StockF();
            f.dispose();
        }
        catch(Exception x)
        {
            System.out.println(x);
        }
        }
    }
    public static void main(String args[])
    {
        Pg3 obj=new Pg3();
    }
}