package comfortInTheCloud;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SeatInfo extends JFrame implements ChangeListener {
	private final JTextArea textArea;
	private final MainModel mainModel;
	private final JButton reserveButton;
	private final JTextField nameTextField;
	private final JTextField pinTextField;
	private final JButton cancelButton;
	
	public SeatInfo(MainModel mainModel) {
		super();
		
		this.mainModel = mainModel;
		mainModel.add(this);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		this.setDefaultCloseOperation(HIDE_ON_CLOSE); //not exit on close bc we dont wanna kill whole program
		
		this.setSize(400, 400);
		
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		add(textArea);
		
	
		nameTextField = new JTextField("Name:");
		pinTextField = new JTextField ("Pin:");
		reserveButton = new JButton("Reserve");
		cancelButton = new JButton("Cancel:");
		
		cancelButton.addActionListener((event) -> {
			if(mainModel.getSelectedSeat().getPerson().getPassword().equals(pinTextField.getText())) {
				mainModel.getSelectedSeat().setPerson(null);
				mainModel.setSelectedSeat(null);
			}
			
		});
		
		reserveButton.addActionListener((event) -> {
			mainModel.getSelectedSeat().setPerson(new Person(nameTextField.getText(), pinTextField.getText()));
			mainModel.setSelectedSeat(null);
		});
		
		add(nameTextField);
		add(pinTextField);
		add(reserveButton);
		add(cancelButton);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		if (mainModel.getSelectedSeat() == null) {
			nameTextField.setText("");
			pinTextField.setText("");
			setVisible(false);
		} 
		else {
			setVisible(true);
			Seat seat = mainModel.getSelectedSeat();
			textArea.setText(seat.seatInfo());
			
			if (seat.getPerson() == null) {
				nameTextField.setVisible(true);
				reserveButton.setVisible(true);
				cancelButton.setVisible(false);
			} else {
				nameTextField.setVisible(false);
				reserveButton.setVisible(false);
				cancelButton.setVisible(true);
			}
			
		}
		
	}
 }
