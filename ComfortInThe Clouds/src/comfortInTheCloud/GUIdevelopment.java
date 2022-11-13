package comfortInTheCloud;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUIdevelopment implements ActionListener{
	
	JFrame mainFrame = new JFrame("✈ ✈ ✈ Comfort In the Clouds ✈ ✈ ✈ "); //will have one frame that swiches from panel to panel

	
	//our panels
	JPanel welcomePanel = new JPanel();
	JPanel signUpPanel = new JPanel();
	JPanel loginPanel = new JPanel();
	JPanel seatManagerPanel = new JPanel();
	JPanel checkoutPanel = new JPanel();
	JPanel successPanel = new JPanel();
	
	//contents in welcomePage
	JLabel welcomePageBkd;
    JLabel welcomePageTitle;
    JLabel welcomePageBio1;
    JLabel welcomePageBio2;
    JLabel welcomePageBio3;
    JLabel welcomePageBio4;
    JButton welcomePageSignUpButton;
    JButton welcomePageLoginButton;
    JLabel welcomePageFooter;

	
	
	//constructor
	public GUIdevelopment() {
		//have welcomePage code here set up as default so when the code runs, it has a base to go off of
		//from the welcome page, we start redirecting depending on the button clicked
		//make sure to make the button name super clear bc each button will have diff instructions even if they do the same thing
		//ex: welcomePageSignUpButton vs SignUpPageSubmitButton vs loginPageSubmitButton
		//finish the variable name off with the type so its easier to detect ex if its a panel, name should have "panel" in it, if its a label, name should have "label" in it
		
		
		//main frame setup
		mainFrame.setSize(800,650);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
		mainFrame.add(welcomePanel);


		
		//creating the welcome page
		welcomePanel.setBackground(Color.red);
		welcomePanel.setLayout(null);
		    
		//welcome page content setup
	    welcomePageTitle = new JLabel("✈ ✈ ✈ Comfort In the Clouds ✈ ✈ ✈");
	    welcomePageTitle.setFont(new Font("Monaco", Font.PLAIN, 40));
	    welcomePageTitle.setBounds(30, 50, 800, 90);
	    this.welcomePanel.add(welcomePageTitle);
	    
	    
	    
	    //split up the bio into four parts for easier formatting
	    welcomePageBio1= new JLabel("Airplane seat management application that organizes and");
		welcomePageBio2 = new JLabel("tracks flight information to maintain a better user experience");
		welcomePageBio3 = new JLabel("for both the customers and employees. Our mission is");
		welcomePageBio4 = new JLabel("to help passengers to fly comfortably in the clouds");
		
	    welcomePageBio1.setFont(new Font("Monaco", Font.ROMAN_BASELINE, 20));
	    welcomePageBio1.setBounds(120,120,900,90);
		welcomePanel.add(welcomePageBio1);
		    
		welcomePageBio2.setFont(new Font("Monaco", Font.PLAIN, 20));
	    welcomePageBio2.setBounds(115,150,900,90);
		welcomePanel.add(welcomePageBio2);    
		
		welcomePageBio3.setFont(new Font("Monaco", Font.PLAIN, 20));
	    welcomePageBio3.setBounds(130,180,900,90);
		welcomePanel.add(welcomePageBio3);
		
		welcomePageBio4.setFont(new Font("Monaco", Font.PLAIN, 20));
	    welcomePageBio4.setBounds(135,210, 900,90);
		welcomePanel.add(welcomePageBio4);
		
		
		//sign up and login button
		welcomePageSignUpButton = new JButton("SIGN UP HERE:");
		welcomePageSignUpButton.setBounds(125, 350, 200, 80);
		welcomePageSignUpButton.setBackground(Color.pink);
		welcomePageSignUpButton.setForeground(Color.white);
		welcomePanel.add(welcomePageSignUpButton);
		
		welcomePageLoginButton = new JButton("LOGIN HERE:");
		welcomePageLoginButton.setBounds(425, 350, 200, 80);
		welcomePageLoginButton.setBackground(Color.pink);
		welcomePageLoginButton.setForeground(Color.white);
		welcomePanel.add(welcomePageLoginButton);
		
		
		
		//footer
		welcomePageFooter = new JLabel("Follow us on Twitter, Instagram, and Facebook for more updates: @ComfortInTheClouds");
		welcomePageFooter.setFont(new Font("Monaco", Font.ROMAN_BASELINE, 18));
		welcomePageFooter.setForeground(Color.white);
		welcomePageFooter.setBounds(40,550,900,90);
		welcomePanel.add(welcomePageFooter);
		
		
		
		
		mainFrame.add(welcomePanel);
		//call your methods that load the page here
		signUpPageSetUp();
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		//Organizing from welcome page to other pages!

	}
	
	
	public void signUpPageSetUp() {
		//logic and UI stuff go here
	}
}
