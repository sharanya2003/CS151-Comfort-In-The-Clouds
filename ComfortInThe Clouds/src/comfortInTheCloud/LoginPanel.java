import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPanel  implements ActionListener {
    LoginBackEnd.Person currentUser;
    JFrame loginFrame = new JFrame("✈ ✈ ✈ Comfort In the Clouds ✈ ✈ ✈");
    JPanel mainPanel = new JPanel();
// seat Manager
    JPanel seatMangerPanel ;
    JLabel seatManagerLabelTitle;
    JButton seatButton;

    // Panels
    JLabel titleLabel;
    JLabel userNameLabel;
    JLabel passwordLabel;
    JLabel loginMessage;


    JTextField userNameTextField;
    JPasswordField passwordField;

    //Buttons

    JButton loginButton;
    JButton returnHomeButton;



    public LoginPanel() {
        mainPanel.setBounds(0, 0, 2000, 2000);
        mainPanel.setBorder(BorderFactory.createEtchedBorder());
        mainPanel.setBackground(new Color(0xb992e8));
        mainPanel.setLayout(null);

// Title ---> Display's "Log In "

        titleLabel = new JLabel("Log In");
        titleLabel.setFont(new Font("Monaco", Font.ROMAN_BASELINE, 25));
        titleLabel.setBounds(660, 0, 200, 90);
        mainPanel.add(titleLabel);

// UserNameLabel --> Display's "User name "

        userNameLabel = new JLabel("Username");
        userNameLabel.setFont(new Font("Monaco", Font.ROMAN_BASELINE, 20));
        userNameLabel.setBounds(410, 175, 150, 90);
        mainPanel.add(userNameLabel);

// Text Field

        userNameTextField = new JTextField();
        userNameTextField.setBounds(550, 200, 350, 40);
        userNameTextField.setBackground(Color.pink);
        userNameTextField.setBorder(BorderFactory.createBevelBorder(1));
        mainPanel.add(userNameTextField);

// UserNameLabel --> Display's "Password"

        passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new Font("Monaco", Font.ROMAN_BASELINE, 20));
        passwordLabel.setBounds(410, 235, 150, 90);
        mainPanel.add(passwordLabel);

// PasswordField

        passwordField = new JPasswordField();
        passwordField.setBounds(550, 260, 350, 40);
        passwordField.setBackground(Color.PINK);
        passwordField.setBorder(BorderFactory.createBevelBorder(1));
        mainPanel.add(passwordField);

// Login Button

        loginButton = new JButton("Log In");
        loginButton.setBounds(620, 390, 150, 40);
        loginButton.setFont(new Font("Monaco", Font.ROMAN_BASELINE, 20));
        loginButton.setBackground(Color.pink);
        loginButton.setForeground(Color.BLACK);
        loginButton.addActionListener(this);
        mainPanel.add(loginButton);


// Return Home Button

        returnHomeButton = new JButton("✈ CITC HOME ✈");
        returnHomeButton.setBounds(-30, 0, 200, 30);
        returnHomeButton.setForeground(Color.white);
        returnHomeButton.addActionListener(this);
        returnHomeButton.setOpaque(false);
        returnHomeButton.setContentAreaFilled(false);
        returnHomeButton.setBorderPainted(false);
        mainPanel.add(returnHomeButton);


        // SEAT MANAGER PANEL
        seatMangerPanel = new JPanel();
        seatMangerPanel.setVisible(false);
        seatMangerPanel.setLayout(null);
        seatMangerPanel.setBounds(0,0,2000,2000);
        seatMangerPanel.setBackground(Color.red);
        seatMangerPanel.setBorder(BorderFactory.createEtchedBorder());

// SeatManager Title
        seatManagerLabelTitle = new JLabel("Seating Map");
        seatManagerLabelTitle.setFont(new Font("Monaco", Font.ROMAN_BASELINE, 25));
        seatManagerLabelTitle.setBounds(660, 0, 200, 90);
        mainPanel.add(seatManagerLabelTitle);

        // SeatManager Button

        seatButton = new JButton();



        loginFrame.getContentPane().setBackground(Color.ORANGE);
        loginFrame.setBounds(0, 0, 2000, 2000);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setLayout(null);


        loginFrame.add(mainPanel);
        loginFrame.setVisible(true);


    }
        LoginBackEnd getPassword =  LoginBackEnd.getInstance();
    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == loginButton) {
             this.seatMangerPanel.setVisible (true);
            mainPanel.setVisible(false);
             this.seatMangerPanel.setLayout (null) ;
             loginFrame.add(seatMangerPanel);
            loginFrame.remove(mainPanel);
            seatMangerPanel.setVisible(true);
            loginFrame.add(seatMangerPanel);

            userNameLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));

            String loginUserName = userNameTextField.getText().trim();
            String loginPassword = String.valueOf(passwordField.getPassword());



            currentUser = getPassword.loginUser(loginUserName, loginPassword);


            if (currentUser !=null){
                loginMessage.setForeground(Color.green);
                loginMessage.setText("Name: " + currentUser.first_name + " "+ currentUser.last_name + "Email: " + currentUser.email +  "Password: " + currentUser.pwd);

            }
            else{
                loginMessage.setForeground(Color.red);
                loginMessage.setText("       Incorrect username or password");
            }
        }


        if (ae.getSource() == returnHomeButton) {
//            signUpPanel.setVisible(true);
//            LoginPanel.setVisible(false);
//            signUpPanel.setLayout(null);
//            mainFrame.add(signUpPanel);
//            mainFrame.remove(LoginPanel);
        }

    }




}
