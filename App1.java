import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.control.*;
import javafx.scene.paint.Color;

public class App1 extends Application {

 public void start(Stage stage) {
 
 Rectangle rect = new Rectangle(200,100, Color.BLUE);
 Button button = new Button("Klick mich!");
  
 StackPane root = new StackPane();
 
 root.getChildren().add(rect);
 root.getChildren().add(button);

 Scene scene = new Scene(root, 400, 300);

 stage.setTitle("Hier steht der Titel!");
 stage.setScene(scene);
 stage.show();
 }

}