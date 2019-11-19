import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
  
class register extends JFrame implements ActionListener 
{
    private Container c; 
    private JLabel title, name, mno, email, password, add; 
    private JTextField tname, tmno, temail, tpassword;
    private JTextArea tadd; 
    private JButton sub, reset; 
    private JLabel res; 
    static boolean isNumber(String s) 
    { 
        for (int i = 0; i < s.length(); i++) 
        if (Character.isDigit(s.charAt(i)) == false) 
            return false; 
        return true; 
    } 
    register()
    {
        setTitle("Sign up"); 
        setBounds(300, 90, 900, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 

        c = getContentPane(); 
        c.setLayout(null); 

        title = new JLabel("Sign up");
        title.setSize(300, 30); 
        title.setLocation(300, 30); 
        c.add(title); 

        name = new JLabel("Name");  
        name.setBounds(100, 100, 100, 20); 
        c.add(name); 
  
        tname = new JTextField(); 
        tname.setBounds(200, 100, 190, 20); 
        c.add(tname); 

        email = new JLabel("E-mail id"); 
        email.setBounds(100, 150, 100, 20); 
        c.add(email);

        temail = new JTextField(); 
        temail.setBounds(200, 150, 190, 20); 
        c.add(temail);

        mno = new JLabel("Mobile"); 
        mno.setBounds(100, 200, 100, 20); 
        c.add(mno); 
  
        tmno = new JTextField();  
        tmno.setBounds(200, 200, 190, 20); 
        c.add(tmno);
        
        password = new JLabel("Password"); 
        password.setBounds(100, 300, 100, 20); 
        c.add(password);

        tpassword = new JTextField(); 
        tpassword.setBounds(200, 300, 190, 20); 
        c.add(tpassword);

        add = new JLabel("Address");  
        add.setBounds(100, 400, 100, 20); 
        c.add(add); 
  
        tadd = new JTextArea(); 
        tadd.setBounds(200, 400, 200, 75); 
        tadd.setLineWrap(true); 
        c.add(tadd); 

        sub = new JButton("Submit");
        sub.setSize(100, 20); 
        sub.setLocation(150, 550); 
        sub.addActionListener(this); 
        c.add(sub);

        reset = new JButton("Reset"); 
        reset.setSize(100, 20); 
        reset.setLocation(270, 550); 
        reset.addActionListener(this); 
        c.add(reset); 

        res = new JLabel("");  
        res.setBounds(100, 600, 300, 25); 
        c.add(res); 

        setVisible(true);

    }
    public void actionPerformed(ActionEvent e)
    {
        sub.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                new Pg3();
            }
        });
        if (e.getSource() == sub) 
        {   
            if(tname.getText().equals(""))
            {
                res.setText("Kindly enter name");
            }
            else if(temail.getText().equals(""))
            {
                res.setText("Kindly enter e-mail ");
            }
            else if(tmno.getText().equals(""))
            {
                res.setText("Kindly enter mobile number");
            }
            else if(isNumber(tmno.getText())==false)
            {
                res.setText("Mobile number invalid");
            }
            else if(tpassword.getText().equals(""))
            {
                res.setText("Kindly enter password");
            }
            else if(tadd.getText().equals(""))
            {
                res.setText("Kindly enter address");
            }
            else
            {
                res.setText("Registered Successfully..");
            }    
        }
        else if (e.getSource() == reset) { 
            String def = ""; 
            tname.setText(def); 
            tadd.setText(def); 
            tmno.setText(def);
            temail.setText(def);
            tpassword.setText(def);
            res.setText(def); 
        } 
    }
    public static void main(String[] args) throws Exception 
    { 
        register f = new register(); 
    } 
}