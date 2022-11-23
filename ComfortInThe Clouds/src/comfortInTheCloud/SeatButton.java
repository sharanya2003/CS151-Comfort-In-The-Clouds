package comfortInTheCloud;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SeatButton extends JButton implements ChangeListener {
	private final Seat model; 
	
	public SeatButton(Seat model, String text) {
		super(text);
		
		this.model = model;
		model.add(this, true);
	}
	

	@Override
	public void stateChanged(ChangeEvent e) {
		if (model.isEmpty()) {
			setBackground(Color.GREEN);
			
		} else {
			setBackground(Color.RED);
		}
		
	}
}
