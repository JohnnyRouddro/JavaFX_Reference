/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenechanger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Johnny Rouddro
 */
public class SceneChanger extends Application {
    
    public static Scene scene1, scene2, scene3; // public static so that we can access these scenes from other classes
    public static Stage primaryStage; // this is our base window. you can create more stages in case of opening with new window
    
    @Override
    public void start(Stage stage) throws Exception {
        
        scene1 = new Scene(FXMLLoader.load(getClass().getResource("FXMLDocument.fxml")));
        scene2 = new Scene(FXMLLoader.load(getClass().getResource("scene2.fxml")));
        scene3 = new Scene(FXMLLoader.load(getClass().getResource("scene3.fxml")));
        
        primaryStage = stage; // setting the current window our base window
        primaryStage.setScene(scene1);
        primaryStage.show();
    }
    
    public static void changeScene(Scene scene){
        primaryStage.setScene(scene);
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
