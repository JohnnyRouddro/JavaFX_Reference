/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenechanger;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Johnny Rouddro
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private void buttonClicked() {
        SceneChanger.changeScene(SceneChanger.scene2); //accessing the methods and variable from SceneChanger class
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
