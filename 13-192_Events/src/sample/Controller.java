package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

	/**
	 * @FXML
	 * Annotation of the instance variable declaration to
	 * assign the fxml-nameField-id created in the fxml text field parameter
	 * to this Controller.nameField instance variable.
	 */
	@FXML
	private TextField nameField;
	@FXML
	private Button helloButton;
	@FXML
	private Button byeButton;
	@FXML
	private CheckBox ourCheckBox;
	@FXML
	private Label ourLabel;

	@FXML
	public void	initialize() {
		helloButton.setDisable(true);
		byeButton.setDisable(true);
	}

	/**
	 * onButtonClicked
	 * @param e		differentiate which control the user was interacted with, if the button is used multiple times
	 */
	@FXML
	public void onButtonClicked(ActionEvent e) {
		// e.getSource() returns the object using the stander toString() method,
		// which can be printed out to tell, which button was pressed
		if(e.getSource().equals(helloButton)) {
			System.out.println("Hello, " + nameField.getText());
			System.out.println("The following button was pressed: " + e.getSource());
		} else if(e.getSource().equals(byeButton)){
			System.out.println("Bye, " + nameField.getText());
			System.out.println("The following button was pressed: " + e.getSource());
		}

		// create a background thread, running the frozen app simulation
		Runnable sleepTask = new Runnable() {
			@Override
			public void run() {
				// simulate a frozen app for 10 seconds
				try {
					String s = Platform.isFxApplicationThread() ? "UI thread" : "background";
					System.out.println("I'm going to sleep on the: " + s);	// background
					Thread.sleep(10000);
					// code must be run later, as JavaFX does not allow to run multiple threads at the same time
					// therefore, Platform.runLater();
					// see JavaFX video 13-195...
					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							String s = Platform.isFxApplicationThread() ? "UI thread" : "background";
							System.out.println("I'm updating the label on the: " + s);	// UI thread
							ourLabel.setText("The frozen task waited for 10 seconds");
						}
					});
				} catch (InterruptedException event) {
					// we don't care about this
				}
			}
		};

		new	Thread(sleepTask).start();

		if(ourCheckBox.isSelected()) {
			nameField.clear();
			helloButton.setDisable(true);
			byeButton.setDisable(true);
		}
	}

	@FXML
	public void handleKeyReleased()	{
		String text = nameField.getText();
		boolean disableButtons = text.isEmpty() || text.trim().isEmpty();
		helloButton.setDisable(disableButtons);
		byeButton.setDisable(disableButtons);
	}

	@FXML
	public void handleChange() {
		System.out.println("The checkbox is " + (ourCheckBox.isSelected() ? "checked" : "not checked"));
	}
}
