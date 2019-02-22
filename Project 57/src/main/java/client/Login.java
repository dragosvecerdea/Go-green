package client;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Login extends Application {

    Stage window;
    Scene scene;
    Button register;
    Button logIn;

    public static void main(String[] args){
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        window = new Stage();
        window.setTitle("#GoGreen");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setHgap(10);
        grid.setVgap(8);


        //For username
        Label nameLabel = new Label("Username:");
        TextField nameField = new TextField();
        nameField.setPromptText("e.g. azaidman");
        GridPane.setConstraints(nameLabel, 0, 0);
        GridPane.setConstraints(nameField, 1, 0);

        //For password
        Label passLabel = new Label("Password:");
        TextField passField = new PasswordField();
        GridPane.setConstraints(passLabel, 0, 1);
        GridPane.setConstraints(passField, 1, 1);

        //Log in button
        logIn = new Button("Log in");
        GridPane.setConstraints(logIn, 0, 2);
        logIn.setOnAction(e -> {
            Connect.serverConnection();
            window.close();
        });

        //Register button
        register = new Button("Register");
        GridPane.setConstraints(register, 1, 2);
        register.setOnAction(e -> Register.display());


        grid.getChildren().addAll(nameLabel, nameField, passLabel, passField, logIn, register);


        scene = new Scene(grid, 500, 350);
        window.setScene(scene);
        window.show();
    }
}
