package comfortInTheCloud;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUIdevelopment implements ActionListener{
	
	JFrame mainFrame = new JFrame(); //will have one frame that swiches from panel to panel

	
	//our panels
	JPanel welcomePanel = new JPanel();
	JPanel signUpPanel = new JPanel();
	JPanel loginPanel = new JPanel();
	JPanel seatManagerPanel = new JPanel();
	JPanel checkoutPanel = new JPanel();
	JPanel successPanel = new JPanel();
	
	
	
	//constructor
	public GUIdevelopment() {
		//have welcomePage code here set up as default so when the code runs, it has a base to go off of
		//from the welcome page, we start redirecting depending on the button clicked
		//make sure to make the button name super clear bc each button will have diff instructions even if they do the same thing
		//ex: welcomePageSignUpButton vs SignUpPageSubmitButton vs loginPageSubmitButton
		//finish the variable name off with the type so its easier to detect ex if its a panel, name should have "panel" in it, if its a label, name should have "label" in it
		
		
		//call your methods that load the page here
		signUpPageSetUp();
		
		
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.add(welcomePanel);
		mainFrame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		//where you switch from page to page depending on button clicked. ex. ae.getSource()==welcomePageSignUpButton
	}
	
	
	public void signUpPageSetUp() {
		//logic and UI stuff go here
	}
}
