import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Pg1 extends JFrame implements ActionListener
 {
      JPanel contentPane;
      JLabel imageLabel = new JLabel();
      JLabel headerLabel = new JLabel();
      JButton a,b;
      Pg1() 
      {
          try {
              setDefaultCloseOperation(EXIT_ON_CLOSE);
              contentPane = (JPanel) getContentPane();
              contentPane.setLayout(new BorderLayout());
              setSize(new Dimension(1366, 768));
              setTitle("Nimbu Mirchi");
              // add the header label
              headerLabel.setFont(new java.awt.Font("Arial Black", Font.BOLD, 48));
              headerLabel.setText("   NIMBU MIRCHI-KAHI NAZAR NA LAGE");
              contentPane.add(headerLabel, java.awt.BorderLayout.NORTH);
              // add the image label
              ImageIcon img_1 = new ImageIcon(this.getClass().getResource(
                      "nimb.gif"));
              imageLabel.setIcon(img_1);
              contentPane.add(imageLabel, java.awt.BorderLayout.CENTER);
              // Login Button
              a=new JButton("Login");
              a.setFont(new java.awt.Font("Arial Black", Font.BOLD, 20));
              a.setBounds(700,400,150,100);
              imageLabel.add(a);
              //Signup Button
              b=new JButton("Signup");
              b.setBounds(1000,400,150,100);
              b.setFont(new java.awt.Font("Arial Black", Font.BOLD, 20));
              imageLabel.add(b);
              a.addActionListener(this);
              b.addActionListener(this);
              // show it
              this.setLocationRelativeTo(null);
              this.setVisible(true);
            } 
            catch (Exception exception)
            {
              exception.printStackTrace();
            }
      }
      public void actionPerformed(ActionEvent e)
      {
          a.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent e)
                  {
                      //contentPane.dispose();
                      new login();
                  }
               });
          b.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent e)
                  {
                      //contentPane.dispose();
                      new register();
                    }
               });
      }
      
      public static void main(String[] args) {
          new Pg1();
      }
  
  }