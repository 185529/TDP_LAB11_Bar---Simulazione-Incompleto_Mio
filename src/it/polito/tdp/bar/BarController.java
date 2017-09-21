/**
 * Sample Skeleton for 'Bar.fxml' Controller Class
 */

package it.polito.tdp.bar;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.bar.model.Simulator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class BarController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="simulate"
    private Button simulate; // Value injected by FXMLLoader

    @FXML // fx:id="output"
    private TextArea output; // Value injected by FXMLLoader
    
    private Simulator simulator;

    @FXML
    void doSimulate(ActionEvent event) {
    	
    	simulator.simulate();

    }
    
    public void setSimulator(Simulator simulator){
    	
    	this.simulator = simulator;
    	
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert simulate != null : "fx:id=\"simulate\" was not injected: check your FXML file 'Bar.fxml'.";
        assert output != null : "fx:id=\"output\" was not injected: check your FXML file 'Bar.fxml'.";

    }
}
