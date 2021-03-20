package database;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.TextField;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class DataBase extends JFrame
{
	 public static void main(String[] args)
    {
      DataBase frame=new DataBase();  
      frame.LogIn();
    }
    private ImageIcon icon,lImg;
    private Container c;
    private JLabel userLable,passLable,leftImg;
    private Font f;
    private TextField t1,t2;
    private JPasswordField pf;
    DataBase()
    {
     ini();
    }
    public void ini()
    {
         this.setVisible(true);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setBounds(700, 250, 500, 500);
         this.setTitle("Frame Demo");
         this.setResizable(false);
    }
    public void LogIn()
    {
        this.setTitle("Log In");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.gray);
        
        f = new Font("Arial",Font.BOLD,14);
        
        leftImg = new JLabel();
        leftImg.setOpaque(true);
        leftImg.setBackground(Color.yellow);
        leftImg.setBounds( 0, 20, 200, 300);
        lImg = new ImageIcon(getClass().getResource(""));
        leftImg.getIcon();
        c.add(leftImg);
        
        userLable=new JLabel();
        userLable.setBounds(250, 110, 165, 20);
        userLable.setFont(f);
        userLable.setText("Username :");
        userLable.setToolTipText("User Name");
        t1 = new  TextField();
        t1.setBounds(250, 140, 165, 20);
        c.add(t1);
        c.add(userLable);
        
        passLable=new JLabel();
        passLable.setBounds(250, 190, 160, 20);
        passLable.setFont(f);
        passLable.setText("Password :");
        passLable.setToolTipText("Password");
        pf = new JPasswordField();
        pf.setBounds(250, 220, 165, 20);
        c.add(pf);
        c.add(passLable);
        
        icon=new ImageIcon(getClass().getResource("computer.png"));
        this.setIconImage(icon.getImage());
        
        Handler handler = new Handler();
        t1.addActionListener(handler);
        pf.addActionListener(handler);
    }
    
    class Handler implements ActionListener
    {

        
        public void actionPerformed(ActionEvent ae)
        {
          if(ae.getSource() == t1)
          {
              String t1m = t1.getText();
              JOptionPane.showMessageDialog(null,"Username is :"+t1m );
          }
          else
          {
              char[] t2m = pf.getPassword();
              JOptionPane.showMessageDialog(null,"Password is :"+t2m );
          }
        }
        
    }
    
   

}
