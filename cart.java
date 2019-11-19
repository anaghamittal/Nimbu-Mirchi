import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
class cart extends JFrame //implements ActionListener
{
    JFrame fr;
    static int n=0;
    Label item[]=new Label[40];
    Label price[]=new Label[40];
    Label total[]=new Label[40];
    Label grandTot;
    JButton b1,b2;
    cart()throws IOException
    {
        StockV obj1=new StockV();
        StockF obj2=new StockF();
        StockFile obj=new StockFile();
        fr=new JFrame("MY CART");
        grandTot=new Label();
        double grt=0;
        BufferedReader brv=new BufferedReader(new FileReader("StockVeggies.txt"));
        BufferedReader brvp=new BufferedReader(new FileReader("VeggiesPrice.txt"));
        BufferedReader brf=new BufferedReader(new FileReader("StockFruits.txt"));
        BufferedReader brfp=new BufferedReader(new FileReader("VeggiesPrice.txt"));
        String v=brv.readLine();
        String vp=brvp.readLine();
        String f=brf.readLine();
        String fp=brfp.readLine();
        int k=0,j=0,m=0;
        for(int i=0;i<40;i++)
        {
            item[i]=new Label();
            price[i]=new Label();
            total[i]=new Label();
            item[i].setText("");
            price[i].setText("");
            total[i].setText("");
        }
        for(int i=0;i<20;i++)
        {
            if(obj1.veg[i]!=0)
            {
                item[k++].setText(obj.v[i]);
                price[j++].setText(Double.toString(obj1.veg[i])+" * "+obj.pricev[i]);
                total[m++].setText(Double.toString(obj1.veg[i]*(obj.pricev[i])));
                grt=grt+obj1.veg[i]*obj.pricev[i];
                v=brv.readLine();
                vp=brvp.readLine();
            }
        }
        for(int i=0;i<20;i++)
        {
            if(obj2.fru[i]!=0)
            {
                item[k++].setText(obj.f[i]);
                price[j++].setText(Double.toString(obj2.fru[i])+" * "+obj.pricef[i]);
                total[m++].setText(Double.toString(obj2.fru[i]*(obj.pricef[i])));
                grt=grt+obj2.fru[i]*obj.pricef[i];
                f=brf.readLine();
                fp=brfp.readLine();
            }
        }
        int n=5;
        for(int i=0;i<40;i++)
        {
            item[i].setBounds(50,n,100,50);
            price[i].setBounds(200,n,100,50);
            total[i].setBounds(350,n,100,50);
            n+=50;
            fr.add(item[i]);
            fr.add(price[i]);
            fr.add(total[i]);
        }
        b1=new JButton("Proceed to Pay");
        b1.setBounds(650,50,150,50);
        fr.add(b1);
        b2=new JButton("No, Make changes");
        b2.setBounds(650,150,150,50);
        fr.add(b2);
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fr.dispose();
                try{
                    new Pg3();
                }
                catch(Exception x)
                {}
            }
        });
        grandTot.setText("Grand Total : Rs. "+Double.toString(grt));
        grandTot.setBounds(450,50,150,100);
        fr.add(grandTot);
        fr.setSize(1000,1000);
        fr.setLayout(null);
        fr.setVisible(true);
    }
    public static void main(String args[])throws IOException
    {
        cart ob=new cart();
    }
}
