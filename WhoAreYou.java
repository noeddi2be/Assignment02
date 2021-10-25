import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class WhoAreYou extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) {

        You person01 = new You();
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        person01.setFirstname(scan.nextLine());

        System.out.println("Please enter your last name: ");
        person01.setLastname(scan.nextLine());

        System.out.println("Please enter your Age: ");
        person01.setAge(scan.nextInt()); 
        scan.nextLine();
        
        System.out.println("Please enter your ethnicity: ");
        String inputEthnicity = scan.nextLine();

        scan.close();

        switch (inputEthnicity) {
            case "African":
                person01.setEthnicity(You.Ethnicity.African);
                break;
            case "American":
                person01.setEthnicity(You.Ethnicity.African);
                break;
            case "Australian":
                person01.setEthnicity(You.Ethnicity.Australian);
                break;
            case "Asian":
                person01.setEthnicity(You.Ethnicity.Asian);
                break;
            case "European":
                person01.setEthnicity(You.Ethnicity.European);
                break;
            case "Latin American":
                person01.setEthnicity(You.Ethnicity.Latin_American);
                break;
            default:
                System.out.println("Please enter a valid Ethnicity!");
        }

        // Scene with Main Grid
        GridPane grid = new GridPane();
        Scene scene1 = new Scene(grid);

        // Grid for output 
        GridPane grid1 = new GridPane();
        GridPane.setConstraints(grid1, 0, 0);

        // Labels
        Label firstNameLabel = new Label("First Name: ");
        GridPane.setConstraints(firstNameLabel, 0, 0);

        Label lastNameLabel = new Label("Last Name: ");
        GridPane.setConstraints(lastNameLabel, 0, 1);

        Label ageLabel = new Label("Age: ");
        GridPane.setConstraints(ageLabel, 0, 2);

        Label ethnicityLabel = new Label("Ethnicity: ");
        GridPane.setConstraints(ethnicityLabel, 0, 3);

        // Feedback Text
        Text yourFirstName = null;  
        Text yourLastaName = null;
        Text yourAge = null;
        Text yourEthnicity = null;
        
        yourFirstName.setText(person01.getFirstname()); 
        GridPane.setConstraints(yourFirstName, 1, 0);

        yourLastaName.setText(person01.getLastname());
        GridPane.setConstraints(yourLastaName, 1, 1);
        
        yourAge.setText(person01.getLastname());
        GridPane.setConstraints(yourAge, 1, 2);

        yourEthnicity.setText(person01.getEthnicity().toString());
        GridPane.setConstraints(yourEthnicity, 1, 3);

        // Adding to main Grid
        grid.getChildren().add(grid1);

        // Adding to Grid1
        grid1.getChildren().add(firstNameLabel);
        grid1.getChildren().add(lastNameLabel);
        grid1.getChildren().add(ageLabel);
        grid1.getChildren().add(ethnicityLabel);
        grid1.getChildren().add(yourFirstName);
        grid1.getChildren().add(yourLastaName);
        grid1.getChildren().add(yourAge);
        grid1.getChildren().add(yourEthnicity);

        // Set and show scene
        primaryStage.setTitle("This is me!");
        primaryStage.setScene(scene1);
        primaryStage.show();



    }
}

