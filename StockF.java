import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
class StockF extends JFrame implements ActionListener
{
    public static int fru[]=new int[20];
    JFrame fr;
    Label l[]=new Label[20];
    Label f[]=new Label[20];
    TextField area[]=new TextField[20];
    JButton b_sub[]=new JButton[20];
    JButton b_add[]=new JButton[20];
    JButton b;
    JPanel p;
    JScrollPane sp;
    StockF()throws IOException
    {
        fr=new JFrame("FRUITS");
        p=new JPanel();
        BufferedReader brf=new BufferedReader(new FileReader("StockFruits.txt"));
        BufferedReader brfp=new BufferedReader(new FileReader("VeggiesPrice.txt"));
        String lf=brfp.readLine();
        String line=brf.readLine();
        for(int i=0;i<20;i++)
        {
             l[i]=new Label();
             f[i]=new Label();
             l[i].setText(line);
             f[i].setText("Rs. "+lf+" /kg");
             line=brf.readLine();
             lf=brfp.readLine();
             area[i]=new TextField();
        }
        brf.close();
        brfp.close();
        int m=5;
        for(int i=0;i<20;i++)
        {
            b_sub[i]=new JButton("-");
            b_sub[i].setBounds(250,m,50,50);
            p.add(b_sub[i]);
            b_add[i]=new JButton("+");
            b_add[i].setBounds(350,m,50,50);
            m+=50;
            p.add(b_add[i]);
            b_sub[i].addActionListener(this);
            b_add[i].addActionListener(this);
        }
        b=new JButton("Continue");
        b.setBounds(600,250,100,50);
        b.addActionListener(this);
        p.add(b);
        int j=5;
        for(int i=0;i<20;i++)
        {
            l[i].setBounds(50,j,100,50);
            f[i].setBounds(400,j,100,50);
            area[i].setBounds(300,j,50,50);
            j+=50;
            area[i].setText("0");
            p.add(f[i]);
            p.add(l[i]);
            p.add(area[i]);
        }
        p.setPreferredSize(new Dimension(1000,1000));
        p.setLayout(null);
        sp=new JScrollPane(p);
        fr.getContentPane().add(sp, BorderLayout.CENTER);
        fr.pack();
        fr.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        for(int i=0;i<20;i++)
        {
            String t=area[i].getText();
            int t1=Integer.parseInt(t);
            if(e.getSource()==b_add[i])
            {
                t1++;
                area[i].setText(Integer.toString(t1));
            }
            if(e.getSource()==b_sub[i])
            {
                if(t1>0)
                t1--;
                area[i].setText(Integer.toString(t1));
                }
        }
        if(e.getSource()==b)
        {
            final JFrame f1=new JFrame("Confirm your order");
            f1.setSize(400,300);
            f1.setLayout(null);
            f1.setVisible(true);
            Label l1=new Label();
            l1.setBounds(50,50,300,50);
            l1.setText("Are you sure want to move ahead?");
            JButton b1=new JButton("Yes! Confirm my order");
            b1.setBounds(50,100,250,50);
            b1.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    for(int i=0;i<20;i++)
                    {
                        String t=area[i].getText();
                        int t1=Integer.parseInt(t);
                        fru[i]=t1;
                    }
                    fr.dispose();
                    try{
                        new cart();
                    }
                    catch(Exception x)
                    {}
                }
            });
            JButton b2=new JButton("No, want to make changes");
            b2.setBounds(50,200,250,50);
            f1.add(l1);
            f1.add(b1);
            f1.add(b2);
            b2.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    f1.dispose();
                }
            });
        }
    }
    public static void main(String args[])throws IOException
    {
        StockF obj=new StockF();
    }
}