package comfortInTheCloud;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SeatInfo extends JFrame implements ChangeListener {
	private final JTextArea textArea;
	private final MainModel mainModel;
	private final JButton reserveButton;
	private final JLabel nameLabel;
	private final JTextField nameTextField;
	private final JLabel pwdLabel;
	private final JPasswordField pwdTextField;
	private final JButton cancelButton;
	public SeatInfo(MainModel mainModel) {
		super();
		
		this.mainModel = mainModel;
		mainModel.add(this);
		textArea = new JTextArea();
		textArea.setBackground(Color.decode("#b992e8"));
		textArea.setEditable(false);
		textArea.setFont(new Font("Monaco", Font.CENTER_BASELINE, 12));
		this.setDefaultCloseOperation(HIDE_ON_CLOSE); //not exit on close bc we dont wanna kill whole program
		
		this.setSize(500, 300);
		this.setBackground(Color.decode("#b992e8"));
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		add(textArea);
		
		nameLabel = new JLabel("NAME", SwingConstants.LEFT);
		getContentPane().setBackground(Color.decode("#b992e8"));
		nameTextField = new JTextField("");
		nameTextField.setForeground(Color.white);
		nameTextField.setBackground(Color.decode("#b992e8"));
		nameTextField.setFont(new Font("Monaco", Font.PLAIN, 20));
		pwdLabel = new JLabel("PASSWORD");
//		pinLabel.setPreferredSize(new Dimension(500, 20));
		//pinLabel.setBackground(Color.pink);
		pwdTextField = new JPasswordField ("");
		pwdTextField.setBackground(Color.decode("#b992e8"));
		pwdTextField.setForeground(Color.white);
		pwdTextField.setFont(new Font("Monaco", Font.PLAIN, 20));
		
		reserveButton = new JButton("Reserve");
		reserveButton.setSize(420, 40);
		
		//reserve button styling
		reserveButton.setBackground(Color.black);
		reserveButton.setForeground(Color.white);
		reserveButton.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	reserveButton.setBackground(Color.decode("#b992e8"));
		    	reserveButton.setForeground(Color.black);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	//reserveButton.setBackground(UIManager.getColor("control"));
		    	reserveButton.setBackground(Color.black);
		    	reserveButton.setForeground(Color.white);
		    }
		});
		
		cancelButton = new JButton("Cancel");
		//cancel button styling
				cancelButton.setBackground(Color.black);
				cancelButton.setForeground(Color.white);
				cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
				    public void mouseEntered(java.awt.event.MouseEvent evt) {
				    	cancelButton.setBackground(Color.pink);
				    	cancelButton.setForeground(Color.black);
				    }

				    public void mouseExited(java.awt.event.MouseEvent evt) {
				    	cancelButton.setBackground(UIManager.getColor("control"));
				    	cancelButton.setBackground(Color.black);
				    	cancelButton.setForeground(Color.white);
				    }
				});
		
		cancelButton.addActionListener((event) -> {
//			System.out.println(mainModel.getSelectedSeat().getPerson().getPassword() + " " + pwdTextField.getText());
			if(mainModel.getSelectedSeat().getPerson().getPassword().equals(pwdTextField.getText())) {
				
				mainModel.getSelectedSeat().setPerson(null);
				mainModel.setSelectedSeat(null);
			}
			else {
				nameLabel.setVisible(true);
				nameLabel.setText("WRONG PIN, TRY AGAIN");
				nameLabel.setForeground(Color.red);
			}
			
		});
		
		reserveButton.addActionListener((event) -> {
			mainModel.getSelectedSeat().setPerson(new Person(nameTextField.getText(), pwdTextField.getText()));
			mainModel.setSelectedSeat(null);
		});
		
		JPanel rowPanel;
		
		rowPanel = new JPanel(new BorderLayout());
		rowPanel.setOpaque(false);
		rowPanel.add(nameLabel, BorderLayout.LINE_START);
		add(rowPanel);
		
//		add(nameLabel);
		add(nameTextField);
		
		rowPanel = new JPanel(new BorderLayout());
		rowPanel.setOpaque(false);
		rowPanel.setBackground(Color.decode("#b992e8"));
		rowPanel.add(pwdLabel, BorderLayout.LINE_START);
		add(rowPanel);
		
		add(pwdTextField);
		add(reserveButton);
		add(cancelButton);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		if (mainModel.getSelectedSeat() == null) {
			nameLabel.setText("Name:");
			nameLabel.setForeground(Color.decode("#b992e8"));
			nameTextField.setText("");
			pwdTextField.setText("");
			setVisible(false);
		} 
		else {
			setVisible(true);
			Seat seat = mainModel.getSelectedSeat();
			textArea.setText(seat.seatInfo());
			
			if (seat.getPerson() == null) {
				nameTextField.setVisible(true);
				nameTextField.setText(mainModel.getCurrentUser().getName());
				reserveButton.setVisible(true);
				cancelButton.setVisible(false);
			} else {
				nameTextField.setVisible(false);
				nameLabel.setVisible(false);
				reserveButton.setVisible(false);
				cancelButton.setVisible(true);
				
			}
			
		}
		
	}
 }
