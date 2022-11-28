package comfortInTheCloud;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class GUIdevelopment implements ActionListener{
	
	JFrame mainFrame = new JFrame("✈ ✈ ✈ Comfort In the Clouds ✈ ✈ ✈ "); //will have one frame that swiches from panel to panel
	
	//our panels
	JPanel welcomePanel = new JPanel();
	JPanel signUpPanel = new JPanel();
	JPanel loginPanel = new JPanel();
	JPanel seatManagerPanel = new JPanel();
	JPanel checkoutPanel = new JPanel();
	JPanel successPanel = new JPanel();
	
	//components in welcome page
    JLabel welcomePageTitle;
    JLabel welcomePageBio1;
    JLabel welcomePageBio2;
    JLabel welcomePageBio3;
    JLabel welcomePageBio4;
    JButton welcomePageSignUpButton;
    JButton welcomePageLoginButton;
    JLabel welcomePageFooter;
    ImageIcon welcomePageImage;
	JLabel welcomePageImageLabel;
	
	//components in sign up page
	JLabel signUpPageHeaderLabel;
	JLabel signUpPageFirstNameLabel;
	JLabel signUpPageLastNameLabel;
	JLabel signUpPageEmailLabel;
	JLabel signUpPagePasswordLabel;
	JLabel signUpPageRetypePasswordLabel;
	JTextField signUpPageFirstNameEntry;
	JTextField signUpPageLastNameEntry;
	JTextField signUpPageEmailEntry;
	JPasswordField signUpPagePasswordEntry;
	JPasswordField signUpPageRetypePasswordEntry;
	JButton signUpPageSubmitButton;
	JButton signUpPageButtonRedirectToLogin;
	JButton signUpPageButtonRedirectToHome;
	JLabel signUpPageErrorMessage;
	
	
	//components in login page
	JLabel loginPageHeaderLabel;
	JLabel loginPageNameLabel;
	JLabel loginPagePwdLabel;
	JTextField loginPageNameTextField;
	JPasswordField loginPagePwdTextField;
	JButton loginPageButtonRedirectToPlane;
	JButton loginPageButtonRedirectToHome;
	JButton newUserSignUpButton;
	
	private final MainModel mainModel;
	
	
	//constructor
	public GUIdevelopment() throws IOException {
		//have welcomePage code here set up as default so when the code runs, it has a base to go off of
		//from the welcome page, we start redirecting depending on the button clicked
		//make sure to make the button name super clear bc each button will have diff instructions even if they do the same thing
		//ex: welcomePageSignUpButton vs SignUpPageSubmitButton vs loginPageSubmitButton
		//finish the variable name off with the type so its easier to detect ex if its a panel, name should have "panel" in it, if its a label, name should have "label" in it
		
		//trying out bckd image stuff--laggy!!
//		welcomePageImage = new ImageIcon ("C:\\Users\\shara\\eclipse-workspace\\ComfortInTheClouds\\ComfortInThe Clouds\\bin\\comfortInTheCloud\\welcomePageBkd.jpg");
//		welcomePageImageLabel = new JLabel();
//		welcomePageImageLabel.setIcon(welcomePageImage);
//		mainFrame.add(welcomePageImageLabel);
//		mainFrame.pack();
		
		File userDatabaseFile = new File("users.bin");
		ArrayList<Person> users = new ArrayList<>();
		
		try {
			if (userDatabaseFile.exists()) {
				FileInputStream fileInputStream = new FileInputStream(userDatabaseFile);
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
				users = (ArrayList<Person>) objectInputStream.readObject(); //bc we only expect to read one onject (should have only one obj)
				//we cast to Person bc ony obj we have
				fileInputStream.close();
				objectInputStream.close();
			}
		} catch (Exception e) {
			e.printStackTrace(); //see error happen
		}
		
		mainFrame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent event) {
				//when we close window, we need an output stream to write to a file (so it has a copy of the previous username info)
				try {
					FileOutputStream fileOutputStream = new FileOutputStream(userDatabaseFile);
					ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
					objectOutputStream.writeObject(mainModel.getUsers());
			
					fileOutputStream.close();
					objectOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		});
		
		mainModel = new MainModel(users);
		new SeatInfo(mainModel);
		//creating the welcome page
		welcomePanel.setBackground(Color.pink);
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
		welcomePageSignUpButton.setBounds(125, 320, 200, 80);
		welcomePageSignUpButton.setBackground(Color.pink);
		welcomePageSignUpButton.setForeground(Color.black);
		welcomePageSignUpButton.addActionListener(this);
		welcomePanel.add(welcomePageSignUpButton);
		
		welcomePageLoginButton = new JButton("LOGIN HERE:");
		welcomePageLoginButton.setBounds(425, 320, 200, 80);
		welcomePageLoginButton.setBackground(Color.pink);
		welcomePageLoginButton.setForeground(Color.black);
		welcomePageLoginButton.addActionListener(this);
		welcomePanel.add(welcomePageLoginButton);
		
		//reference from: https://stackoverflow.com/questions/22638926/how-to-put-hover-effect-on-jbutton
		
		//color changing when button clicked (signup)
		welcomePageSignUpButton.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	welcomePageSignUpButton.setBackground(Color.black);
		    	welcomePageSignUpButton.setForeground(Color.white);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	welcomePageSignUpButton.setBackground(UIManager.getColor("control"));
		    	welcomePageSignUpButton.setBackground(Color.pink);
		    	welcomePageSignUpButton.setForeground(Color.black);
		    }
		});
		
		//color changing when button clicked (login)
		welcomePageLoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
				    public void mouseEntered(java.awt.event.MouseEvent evt) {
				    	welcomePageLoginButton.setBackground(Color.black);
				    	welcomePageLoginButton.setForeground(Color.white);
				    }

				    public void mouseExited(java.awt.event.MouseEvent evt) {
				    	welcomePageLoginButton.setBackground(UIManager.getColor("control"));
				    	welcomePageLoginButton.setBackground(Color.pink);
				    	welcomePageLoginButton.setForeground(Color.black);
				    }
				});
		
		//footer
		welcomePageFooter = new JLabel("Follow us on Twitter, Instagram, and Facebook for more updates: @ComfortInTheClouds");
		welcomePageFooter.setFont(new Font("Monaco", Font.ROMAN_BASELINE, 12));
		welcomePageFooter.setForeground(Color.white);
		welcomePageFooter.setBounds(150,410,700,90);
		welcomePanel.add(welcomePageFooter);
		
		//setting background
		
		mainFrame.add(welcomePanel);
		
		
		
		//main frame setup	
		mainFrame.setSize(780,710);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
		mainFrame.add(welcomePanel);
		
		//call your methods that load the page here
		signUpPageSetUp();
		loginPageSetUp();
		seatManagerPageSetUp();
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		//Organizing from welcome page to other pages!

		// welcome page -> sign up page
		if(ae.getSource() == this.welcomePageSignUpButton) {
			signUpPanel.setVisible(true);
			welcomePanel.setVisible(false);
	        signUpPanel.setLayout(null);
	        mainFrame.add(signUpPanel);
	        mainFrame.remove(welcomePanel);
		}
		
		// welcome page -> login page
		if(ae.getSource() == this.welcomePageLoginButton) {
			this.loginPanel.setVisible(true);
			this.welcomePanel.setVisible(false);
			this.loginPanel.setLayout(null);
			mainFrame.add(loginPanel);
			mainFrame.remove(welcomePanel);
		}
		
		// sign up page -> login page
		if(ae.getSource() == this.signUpPageButtonRedirectToLogin) {
			this.loginPanel.setVisible(true);
			signUpPanel.setVisible(false);
			loginPanel.setLayout(null);
			mainFrame.add(loginPanel);
			mainFrame.remove(signUpPanel);
		}
		
		//sign up page -> welcome page
		if(ae.getSource() == signUpPageButtonRedirectToHome) {
			welcomePanel.setVisible(true);
			signUpPanel.setVisible(false);
			welcomePanel.setLayout(null);
			mainFrame.add(welcomePanel);
			mainFrame.remove(signUpPanel);
		}
		//login page -> welcome page
		if(ae.getSource() == loginPageButtonRedirectToHome) {
			welcomePanel.setVisible(true);
			loginPanel.setVisible(false);
			welcomePanel.setLayout(null);
			mainFrame.add(welcomePanel);
			mainFrame.remove(loginPanel);
		}	

		//login -> signup
		if(ae.getSource() ==newUserSignUpButton) {
			signUpPanel.setVisible(true);
			loginPanel.setVisible(false);
			signUpPanel.setLayout(null);
			mainFrame.add(signUpPanel);
			mainFrame.remove(loginPanel);
		}
		
		// sign up page -> login
		if(ae.getSource() == this.signUpPageSubmitButton) {
			//user info
			  String signUppwd = String.valueOf(this.signUpPagePasswordEntry.getPassword());
			  String signUpretype = String.valueOf(this.signUpPageRetypePasswordEntry.getPassword());
	   		  String fname = this.signUpPageFirstNameEntry.getText().trim();
	  		  String lname = this.signUpPageLastNameEntry.getText().trim();
	  		  String email = this.signUpPageEmailEntry.getText().trim();
	  		  
	  		  if(signUppwd.length()==0 || signUpretype.length()==0 || fname.length()==0 || email.length()==0) {
	  			  this.signUpPageErrorMessage = new JLabel("Fill in all of the fields");
	  		  }
	  		  else if(!signUppwd.equals(signUpretype)) {
	  			  this.signUpPageErrorMessage.setText("Passwords don't match");
	  		  }
	  		  
	  		  else {
	  			  mainModel.addUser(new Person(fname + " " + lname, signUppwd));
		  		  // TODO: redirect to login
		  		  System.out.println(signUppwd + signUpretype + fname + lname + email);
		  		  
		  		  
		  		  this.loginPanel.setVisible(true);
		  		  this.signUpPanel.setVisible(false);
		  		  this.loginPanel.setLayout(null);
		  		  mainFrame.add(loginPanel);
		  		  mainFrame.remove(signUpPanel);
	  		  }
	  		  
	  		  
		}
		
		
		//login -> plane (if info correct)
		if(ae.getSource() == loginPageButtonRedirectToPlane) {
			Person newCurentUser = new Person(loginPageNameTextField.getText(), loginPagePwdTextField.getText());
			if (!mainModel.checkUser(newCurentUser)) return;
			
			mainModel.setCurrentUser(newCurentUser);
			
			seatManagerPanel.setVisible(true);
			loginPanel.setVisible(false);
//			seatManagerPanel.setLayout(null);
			mainFrame.add(seatManagerPanel);
			mainFrame.remove(loginPanel);
			
			
		}
	}
	
	
	
	//methods for every page
	public void signUpPageSetUp() {
		signUpPanel.setBackground(Color.decode("#b992e8"));		
		//header
		signUpPageHeaderLabel = new JLabel("SIGN UP HERE");
		signUpPageHeaderLabel.setFont(new Font("Monaco", Font.ROMAN_BASELINE, 25));
		signUpPageHeaderLabel.setBounds(310,0,300,90);
		signUpPanel.add(signUpPageHeaderLabel);
		
		//first name: label + entry
		signUpPageFirstNameLabel = new JLabel("First Name");
		signUpPageFirstNameLabel.setFont(new Font("Monaco", Font.ROMAN_BASELINE, 20));
		signUpPageFirstNameLabel.setBounds(100,55,150,90);
		signUpPanel.add(signUpPageFirstNameLabel);
		
		signUpPageFirstNameEntry = new JTextField();
		signUpPageFirstNameEntry.setFont(new Font("Monaco", Font.ROMAN_BASELINE, 20));
		signUpPageFirstNameEntry.setBorder(BorderFactory.createLineBorder(Color.white));
		signUpPageFirstNameEntry.setBackground(Color.pink);
		signUpPageFirstNameEntry.setBounds(250,80,350, 40);
		signUpPanel.add(signUpPageFirstNameEntry);
		
		
		//last name: label + entry
		signUpPageLastNameLabel = new JLabel("Last Name");
		signUpPageLastNameLabel.setFont(new Font("Monaco", Font.ROMAN_BASELINE, 20));
		signUpPageLastNameLabel.setBounds(100,115,150,90);
		signUpPanel.add(signUpPageLastNameLabel);
		
		signUpPageLastNameEntry = new JTextField();
		signUpPageLastNameEntry.setFont(new Font("Monaco", Font.ROMAN_BASELINE, 20));
		signUpPageLastNameEntry.setBorder(BorderFactory.createLineBorder(Color.white));
		signUpPageLastNameEntry.setBackground(Color.pink);
		signUpPageLastNameEntry.setBounds(250,140,350, 40);
		signUpPanel.add(signUpPageLastNameEntry);
		
		
		//email: label + entry
		this.signUpPageEmailLabel = new JLabel("Email");
		signUpPageEmailLabel.setFont(new Font("Monaco", Font.ROMAN_BASELINE, 20));
		signUpPageEmailLabel.setBounds(125,175,150,90);
		signUpPanel.add(signUpPageEmailLabel);
		
		signUpPageEmailEntry = new JTextField();
		signUpPageEmailEntry.setFont(new Font("Monaco", Font.ROMAN_BASELINE, 20));
		signUpPageEmailEntry.setBorder(BorderFactory.createLineBorder(Color.white));
		signUpPageEmailEntry.setBackground(Color.pink);
		signUpPageEmailEntry.setBounds(250,200,350, 40);
		signUpPanel.add(signUpPageEmailEntry);
		
		
		//pwd: label + entry
		this.signUpPagePasswordLabel = new JLabel("Password");
		signUpPagePasswordLabel.setFont(new Font("Monaco", Font.ROMAN_BASELINE, 20));
		signUpPagePasswordLabel.setBounds(110,235,150,90);
		signUpPanel.add(signUpPagePasswordLabel);
		
		this.signUpPagePasswordEntry = new JPasswordField();
		signUpPagePasswordEntry.setFont(new Font("Monaco", Font.ROMAN_BASELINE, 20));
		signUpPagePasswordEntry.setBorder(BorderFactory.createLineBorder(Color.white));
		signUpPagePasswordEntry.setBackground(Color.pink);
		signUpPagePasswordEntry.setBounds(250,260,350, 40);
		signUpPanel.add(signUpPagePasswordEntry);
		
		
		//retype pwd: label + entry
		this.signUpPageRetypePasswordLabel = new JLabel("Retype Password");
		signUpPageRetypePasswordLabel.setFont(new Font("Monaco", Font.ROMAN_BASELINE, 20));
		signUpPageRetypePasswordLabel.setBounds(50,295,250,90);
		signUpPanel.add(signUpPageRetypePasswordLabel);
		
		this.signUpPageRetypePasswordEntry = new JPasswordField();
		signUpPageRetypePasswordEntry.setFont(new Font("Monaco", Font.ROMAN_BASELINE, 20));
		signUpPageRetypePasswordEntry.setBorder(BorderFactory.createLineBorder(Color.white));
		signUpPageRetypePasswordEntry.setBackground(Color.pink);
		signUpPageRetypePasswordEntry.setBounds(250,320,350, 40);
		signUpPanel.add(signUpPageRetypePasswordEntry);
		
		
		//submit button (with color changing effects)
		
		this.signUpPageSubmitButton = new JButton("SIGNUP");
		signUpPageSubmitButton.setBounds(300, 390, 150, 40);
		signUpPageSubmitButton.setBackground(Color.pink);
		signUpPageSubmitButton.setForeground(Color.black);
		signUpPageSubmitButton.addActionListener(this);
		signUpPanel.add(signUpPageSubmitButton);
		
		signUpPageSubmitButton.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	signUpPageSubmitButton.setBackground(Color.black);
		    	signUpPageSubmitButton.setForeground(Color.white);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	signUpPageSubmitButton.setBackground(UIManager.getColor("control"));
		    	signUpPageSubmitButton.setBackground(Color.pink);
		    	signUpPageSubmitButton.setForeground(Color.black);
		    }
		});
		
		//redirect to login page
		this.signUpPageButtonRedirectToLogin = new JButton("Already a user? Login");
		signUpPageButtonRedirectToLogin.setBounds(430, 395, 200, 30);
		signUpPageButtonRedirectToLogin.setForeground(Color.white);
		signUpPageButtonRedirectToLogin.addActionListener(this);
		signUpPageButtonRedirectToLogin.setOpaque(false);
		signUpPageButtonRedirectToLogin.setContentAreaFilled(false);
		signUpPageButtonRedirectToLogin.setBorderPainted(false);
		signUpPanel.add(signUpPageButtonRedirectToLogin);
		
		//redirect to home page
		this.signUpPageButtonRedirectToHome = new JButton("✈ CITC HOME ✈");
		signUpPageButtonRedirectToHome.setBounds(-30, 0, 200, 30);
		signUpPageButtonRedirectToHome.setForeground(Color.white);
		signUpPageButtonRedirectToHome.addActionListener(this);
		signUpPageButtonRedirectToHome.setOpaque(false);
		signUpPageButtonRedirectToHome.setContentAreaFilled(false);
		signUpPageButtonRedirectToHome.setBorderPainted(false);
		signUpPanel.add(signUpPageButtonRedirectToHome);
		
		//error message
		//potential messages: 
		//fields not filled
		//pwd != retypePwd
		//pwd not strong enough
		signUpPageErrorMessage = new JLabel();
		signUpPageErrorMessage.setFont(new Font("Monaco", Font.ROMAN_BASELINE, 20));
		this.signUpPageErrorMessage.setForeground(Color.white);
		signUpPageErrorMessage.setBounds(300, 410, 500, 30);
		signUpPanel.add(signUpPageErrorMessage);
	}
	
	
	public void loginPageSetUp() {
		loginPanel.setBackground(Color.decode("#b992e8"));	
		
		//header
		loginPageHeaderLabel = new JLabel("LOGIN");
		loginPageHeaderLabel.setFont(new Font("Monaco", Font.ROMAN_BASELINE, 25));
		loginPageHeaderLabel.setBounds(330,0,300,90);
		loginPanel.add(loginPageHeaderLabel);
		
		//name label + entry		
		loginPageNameLabel = new JLabel("Full Name");
		loginPageNameLabel.setFont(new Font("Monaco", Font.ROMAN_BASELINE, 20));
		loginPageNameLabel.setBounds(180,95,350,90);
		loginPanel.add(loginPageNameLabel);
		
		loginPageNameTextField = new JTextField();
		loginPageNameTextField.setFont(new Font("Monaco", Font.ROMAN_BASELINE, 20));
		loginPageNameTextField.setBorder(BorderFactory.createLineBorder(Color.white));
		loginPageNameTextField.setBackground(Color.pink);
		loginPageNameTextField.setBounds(310,120,300, 40);
		loginPanel.add(loginPageNameTextField);

		//pwd label + entry
		
		this.loginPagePwdLabel = new JLabel("Password");
		loginPagePwdLabel.setFont(new Font("Monaco", Font.ROMAN_BASELINE, 20));
		loginPagePwdLabel.setBounds(190,175,150,90);
		loginPanel.add(loginPagePwdLabel);
		
		this.loginPagePwdTextField = new JPasswordField();
		loginPagePwdTextField.setFont(new Font("Monaco", Font.ROMAN_BASELINE, 20));
		loginPagePwdTextField.setBorder(BorderFactory.createLineBorder(Color.white));
		loginPagePwdTextField.setBackground(Color.pink);
		loginPagePwdTextField.setBounds(310,200,300, 40);
		loginPanel.add(loginPagePwdTextField);
		
		//login -> seat manager
		loginPageButtonRedirectToPlane = new JButton ("Login");
		loginPageButtonRedirectToPlane.setBounds(300, 310, 150, 40);
		loginPageButtonRedirectToPlane.setBackground(Color.pink);
		loginPageButtonRedirectToPlane.setForeground(Color.black);
		loginPageButtonRedirectToPlane.addActionListener(this);
		loginPanel.add(loginPageButtonRedirectToPlane);
		
		//login -> signup
		this.newUserSignUpButton = new JButton("New User? Signup");
		newUserSignUpButton.setBounds(430, 315, 200, 30);
		newUserSignUpButton.setForeground(Color.white);
		newUserSignUpButton.addActionListener(this);
		newUserSignUpButton.setOpaque(false);
		newUserSignUpButton.setContentAreaFilled(false);
		newUserSignUpButton.setBorderPainted(false);
		loginPanel.add(newUserSignUpButton);
		
		//login -> home
			this.loginPageButtonRedirectToHome = new JButton("✈ CITC HOME ✈");
			loginPageButtonRedirectToHome.setBounds(-30, 0, 200, 30);
			loginPageButtonRedirectToHome.setForeground(Color.white);
			loginPageButtonRedirectToHome.addActionListener(this);
			loginPageButtonRedirectToHome.setOpaque(false);				
			loginPageButtonRedirectToHome.setContentAreaFilled(false);
			loginPageButtonRedirectToHome.setBorderPainted(false);
			loginPanel.add(loginPageButtonRedirectToHome);
	}
	
	public void seatManagerPageSetUp() {
		
//String letters = "ABCD";
//		
//		ArrayList<JButton> seats = new ArrayList <>();
//		
//		seatManagerPanel = new JPanel(new GridLayout(20,4));
//		this.seatManagerPanel.setBackground(Color.pink);
//
//	    for (int i = 0; i < 4 * 20; i++) {
//	    	int index = i;
//	    	ArrayList<Seat> modelSeats = mainModel.getSeats();
//	    	//"%2s%s" lines each button up with a padding of 2
//	    	SeatButton seat = new SeatButton(modelSeats.get(i), String.format("%2s%s",Integer.toString((i/4) + 1),letters.charAt(i%4)));
//	    	seat.addActionListener(event -> {
//	    		mainModel.setSelectedSeat(mainModel.getSeats().get(index)); //when the button is clicked, get the specific seat and select that selected seat
//	    		//.setPerson(new Person("Sharanya", "Udupa", "sharanyaudupa@gmail.com", "lolyouthought"));
//	    	});
//	      
//	      seat.setSize(30, 30);	      
//	      seatManagerPanel.add(seat);
//	    }
		JButton continuetoSurvey;
		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridheight = 1;
		
		
		//Referenced from: https://stackoverflow.com/questions/11165323/how-do-i-use-gridbaylayout-in-java-swing-to-generate-this-particular-image-in
		seatManagerPanel = new JPanel(gbl);
		
		
		this.seatManagerPanel.setBackground(Color.pink);
		int i = 0;
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		//first
		gbc.gridwidth = 4;
		JLabel firstClassLable = new JLabel("First Class", SwingConstants.CENTER);
		gbl.addLayoutComponent(firstClassLable, gbc);
		seatManagerPanel.add(firstClassLable);
		
		gbc.gridwidth = 1;
		//for the first class
		//four rows with four cols
		//4*4
		while (i < 16) {
		    SeatButton seat = createSeat(i);
		    gbc.gridx = i % 4;
		    gbc.gridy = 1 + (i / 4);
		    gbl.addLayoutComponent(seat, gbc);
	    	seatManagerPanel.add(seat);
			i++;
		}
		
		//business
		gbc.gridwidth = 4;
		gbc.gridx = 0;
		gbc.gridy = gbc.gridy + 1;
		JLabel businessClassLable = new JLabel("Business Class", SwingConstants.CENTER);
		gbl.addLayoutComponent(businessClassLable, gbc);
		seatManagerPanel.add(businessClassLable);
		
		gbc.gridwidth = 1;
		//business class
		//12*4
		while (i < 48) {
		    SeatButton seat = createSeat(i);
		    gbc.gridx = i % 4;
		    gbc.gridy = 2 + (i / 4);
		    gbl.addLayoutComponent(seat, gbc);
	    	seatManagerPanel.add(seat);
			i++;
		}
		
		//economy
		gbc.gridwidth = 4;
		gbc.gridx = 0;
		gbc.gridy = gbc.gridy + 1;
		JLabel economyClassLabel = new JLabel("Economy Class", SwingConstants.CENTER);
		gbl.addLayoutComponent(economyClassLabel, gbc);
		seatManagerPanel.add(economyClassLabel);
		
		gbc.gridwidth = 1;
		//business class
		//20*4
		while (i < 80) {
		    SeatButton seat = createSeat(i);
		    gbc.gridx = i % 4;
		    gbc.gridy = 3 + (i / 4);
		    gbl.addLayoutComponent(seat, gbc);
	    	seatManagerPanel.add(seat);
			i++;
		}
		
		gbc.gridwidth = 4;
		gbc.gridx = 0;
		gbc.gridy = gbc.gridy + 1;
		continuetoSurvey = new JButton("Checkout");
		gbl.addLayoutComponent(continuetoSurvey, gbc);
		seatManagerPanel.add(continuetoSurvey);
		
		
		continuetoSurvey.setBounds(380, 700, 100, 100);
		this.seatManagerPanel.add(continuetoSurvey);
	}
	
	private SeatButton createSeat(int index) {
		String letters = "ABCD";
		
		SeatButton seat = new SeatButton(mainModel.getSeats().get(index), String.format("%2s%s",Integer.toString((index/4) + 1),letters.charAt(index%4)));
    	seat.addActionListener(event -> {
    		mainModel.setSelectedSeat(mainModel.getSeats().get(index)); //when the button is clicked, get the specific seat and select that selected seat
    	});
      
    	seat.setSize(30, 30);
    	
    	return seat;
	}
}
