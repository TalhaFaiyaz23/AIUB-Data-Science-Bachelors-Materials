import java.lang.*;
import javax.swing.*;
import java.awt.*;

public class FrameIntro extends JFrame
{
	JLabel namelbl,passlbl,imglbl;
	JPanel panel;
	JPasswordField passfield;
	JButton logbtn,signbtn,backbtn;
	Color mycolor,mycolor1;
	Font myFont;
	ImageIcon Img;
	
	public FrameIntro()
	
	{

		super("My first Frame");
		this.setSize(1920,1080);
		this.setLocationRelative(null);
		
		
		mycolor = new Color(121,192,194);
		mycolor1 = new Color(123,14,235);
		
		myFont = new Font("Canbria", Font.PLAIN, );
		
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(mycolor);
		
		
		namelbl = JLabel("Name");
		namelbl.setBounds(200,150,200,150);
		namelbl.setBackground(myFont);
		panel.add(namelbl);
		
		
		namefld = new JTextField();
		namefld.setBounds(400,150,250,150);
		panel.add(namefld);
		
		
		passlbl = new JLabel("Password");
		passlbl.setBounds(600,300,205,50);
		panel.add
		
		
		passfield = new JPasswordField();
		passfield.setBounds(650,200,200,50);
		passfield.setEchoChar('*');
		panel.add(passfield);
		
		
		logbtn = new JButton("Log In");
		logbtn.setBounds(180,250,100,50);
		panel.add(logbtn);
		
		
		signbtn = new JButton("Sign Up");
		signbtn.setBounds(320,250,100,50);
		signbtn.setBackground(Color.RED);
		panel.add(signbtn);
		
		
		backbtn = new JButton("Log In");
		backbtn.setBounds(460,250,100,50);
		panel.add(backbtn);
		
		
		img = ImageIcon("./oop11.jpg");
		
		
		this.add(panel);
		
	}
	
	