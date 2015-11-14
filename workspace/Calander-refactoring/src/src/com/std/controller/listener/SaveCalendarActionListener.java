package src.com.std.controller.listener;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import src.com.std.controller.CalendarController;
import src.com.std.model.CalendarModel;



/**
 * This class serves as the ActionListener for the save button.  It is instantiated
 * in the CalendarController and sent to the View so that it can be added to the
 * "save" button.
 * 
 * 
 * @author xxx
 * @author xxx
 *
 */
public class SaveCalendarActionListener implements ActionListener {

	/**
	 * a reference to the controller so that this listener
	 * can access both the model and the view.
	 */
	private CalendarController controller;

	/**
	 * creates a new AppointmentSelectionMouseListener
	 * 
	 * @param CalendarControler cc is the reference to the controller 
	 */
	public SaveCalendarActionListener(CalendarController cc){
		controller = cc;
	}
	
	/**
	 * This method is called when the save button is clicked and saves the
	 * current calendar to a file with a name generated by the model's getURI()
	 * method.
	 * @param ActionEvent e is the event sent when the save button is clicked.
	 */
	public void actionPerformed(ActionEvent e) {
		controller.save();
	}

}
