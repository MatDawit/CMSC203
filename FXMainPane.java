


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	Button btn1, btn2, btn3, btn4, btn5, btn6;
	Label label1;
	TextField textField1;
	//  declare two HBoxes
	HBox hBox1, hBox2;
	
	//student Task #4:
	//  declare an instance of DataManager
	DataManager dataManager;
	
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		btn1 = new Button("Hello");
		btn2 = new Button("Howdy");
		btn3 = new Button("Chinese");
		btn4 = new Button("Clear");
		btn5 = new Button("Exit");
		btn6 = new Button("Hola");
		label1 = new Label("Feedback:");
		textField1 = new TextField();
		
		//  instantiate the HBoxes
		hBox1 = new HBox();
		hBox2 = new HBox();
		
		//student Task #4:
		//  instantiate the DataManager instance
		dataManager = new DataManager();
		Insets insets = new Insets(5);
		
		// Button Actions
        btn1.setOnAction(new ButtonEventHandler());
        btn2.setOnAction(new ButtonEventHandler());
        btn3.setOnAction(new ButtonEventHandler());
        btn4.setOnAction(new ButtonEventHandler());
        btn5.setOnAction(new ButtonEventHandler());
        btn6.setOnAction(new ButtonEventHandler());

		
		
		//  set margins and set alignment of the components
		hBox1.setAlignment(Pos.CENTER);
        hBox2.setAlignment(Pos.CENTER);
        HBox.setMargin(textField1, insets);
        HBox.setMargin(btn1, insets);
        HBox.setMargin(btn2, insets);
        HBox.setMargin(btn3, insets);
        HBox.setMargin(btn4, insets);
        HBox.setMargin(btn5, insets);
        HBox.setMargin(btn6, insets);
		
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		hBox1.getChildren().addAll(label1, textField1);
		
		//  add the buttons to the other HBox
		hBox2.getChildren().addAll(btn1, btn2, btn3, btn4, btn5, btn6);
		
		//  add the HBoxes to this FXMainPanel (a VBox)
		this.getChildren().addAll(hBox1, hBox2);
		
		
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	class ButtonEventHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent event) {
            // Variables
            EventTarget target = event.getTarget();

            // Checks
            if (target == btn1) {
                textField1.setText(dataManager.getHello());
                
            } else if (target == btn2) {
                textField1.setText(dataManager.getHowdy());
                
            } else if (target == btn3) {
                textField1.setText(dataManager.getChinese());
                
            } else if (target == btn4) {
                textField1.setText("");
                
            } else if (target == btn5) {
                Platform.exit();
                System.exit(0);
             
            } else if (target == btn6) {
            	textField1.setText(dataManager.getSpanish());
            }
        }
	}
}
	
