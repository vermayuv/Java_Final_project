
package javafinal;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


/**
 *
 * @author yuvra
 */
public class JavaFinal extends Application {
    private Button btnFirst = new Button("First");
    private Button btnPrev  = new Button("Previous");
    private Button btnNext  = new Button("Next");
    private Button btnLast  = new Button("Last");
    private Button btnFind  = new Button("Search");
    private Button btnExit  = new Button("Exit");
    private Button btnAdd   = new Button("Add");
    private Button btnDel   = new Button("Delete");
    private Button btnEdit  = new Button("Update");
    
        
    private Label lblId     = new Label("Worker Id: ");
    private Label lblName   = new Label("Worker Name: ");
    private Label lblStreet = new Label("Street: ");
    private Label lblCity   = new Label("Address: ");
    private Label lblHours  = new Label("Hours Worked: ");
    private Label lblRate   = new Label("Hourly Rate: ");
    private Label lblWage   = new Label("Wage");
    private Label lblCalc   = new Label("calculated wage goes here");
    
    private TextField txtId     = new TextField();
    private TextField txtName   = new TextField();
    private TextField txtStreet = new TextField();
    private TextField txtCity   = new TextField();
    private TextField txtHours  = new TextField();
    private TextField txtRate   = new TextField();
    
    
   
    
    @Override
    public void start(Stage primaryStage) {
       Scene scene = new Scene(getGrid(),450,450);
       primaryStage.setTitle("Worker Details");
       primaryStage.setScene(scene);
       primaryStage.show();
       
       btnExit.setOnAction(new EventHandler<ActionEvent>(){
           public void handle(ActionEvent e){
               System.exit(0);
           }
       });
       
    }
    private GridPane getGrid(){
         GridPane pane = new GridPane();
         
         pane.setHgap(10);
         pane.setVgap(10);
        
         pane.add(lblId,0,0);
         pane.add(lblName,0,1);
         pane.add(lblStreet,0,2);
         pane.add(lblCity, 0, 3);
         pane.add(lblHours, 0 , 4);
         pane.add(lblRate, 0, 5);
         pane.add(lblWage, 0, 6);
         pane.add(lblCalc,1,6,4,1);
         pane.add(btnFirst, 0, 7);
         pane.add(btnPrev, 1, 7);
         pane.add(btnLast, 3, 7);
         pane.add(btnNext, 2, 7);
         pane.add(btnFind, 4, 7);
         pane.add(txtId, 1, 0, 4,1);
         pane.add(txtName, 1, 1, 4,1);
         pane.add(txtStreet, 1, 2, 4,1);
         pane.add(txtCity, 1, 3, 4,1);
         pane.add(txtHours, 1, 4, 4,1);
         pane.add(txtRate, 1, 5, 4,1);
         pane.add(btnExit, 0, 8, 3, 1);
         pane.add(btnAdd, 1, 8, 3, 1);
         pane.add(btnDel, 2, 8, 3, 1);
         pane.add(btnEdit, 3, 8, 3, 1);
        return pane;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
