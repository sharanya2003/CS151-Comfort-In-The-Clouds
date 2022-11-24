package comfortInTheCloud;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class BaseModel{
	
	ArrayList <ChangeListener> listeners;

	public BaseModel(){
		listeners = new ArrayList<>();
	}
	
	public void add(ChangeListener cl) {
		listeners.add(cl);
		
	}
	
	public void add(ChangeListener cl, boolean immediate) {
		add(cl);
		if (immediate) {
			cl.stateChanged(new ChangeEvent(this));
		}
	}
	
	public void dispatch() {
		for(ChangeListener listener: listeners) {
			listener.stateChanged(new ChangeEvent(this));
		}
	}
}
