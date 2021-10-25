import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.geometry.*;

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
        
        System.out.println("Please enter your Ethnicity: [African, American, Australian, Asian, European, Latin American]");
        String inputEthnicity = scan.nextLine();

        scan.close();

        switch (inputEthnicity) {
            case "African":
                person01.setEthnicity(You.Ethnicity.African);
                break;
            case "American":
                person01.setEthnicity(You.Ethnicity.American);
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
        GridPane mainGrid = new GridPane();
        Scene scene1 = new Scene(mainGrid, 300, 300);
        mainGrid.setPadding(new Insets(10, 10, 10, 10));
        mainGrid.setVgap(30);
        mainGrid.setHgap(100);
        BackgroundFill backgroundFill = new BackgroundFill(Color.rgb(188,213,255), CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(backgroundFill);
        mainGrid.setBackground(background);

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
        Text yourFirstName = new Text();  
        Text yourLastaName = new Text();
        Text yourAge = new Text();
        Text yourEthnicity = new Text();
        
        yourFirstName.setText(person01.getFirstname()); 
        GridPane.setConstraints(yourFirstName, 1, 0);

        yourLastaName.setText(person01.getLastname());
        GridPane.setConstraints(yourLastaName, 1, 1);
        
        yourAge.setText(person01.getLastname());
        GridPane.setConstraints(yourAge, 1, 2);

        yourEthnicity.setText(person01.getEthnicity().toString());
        GridPane.setConstraints(yourEthnicity, 1, 3);


        // Adding to Grid1
        mainGrid.getChildren().add(firstNameLabel);
        mainGrid.getChildren().add(lastNameLabel);
        mainGrid.getChildren().add(ageLabel);
        mainGrid.getChildren().add(ethnicityLabel);
        mainGrid.getChildren().add(yourFirstName);
        mainGrid.getChildren().add(yourLastaName);
        mainGrid.getChildren().add(yourAge);
        mainGrid.getChildren().add(yourEthnicity);

        // Set and show scene
        primaryStage.setTitle("This is me!");
        primaryStage.setScene(scene1);
        primaryStage.show();



    }
}

