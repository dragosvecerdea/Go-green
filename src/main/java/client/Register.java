package client;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Register {

    public static void display(){

        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Register");
        window.setMinWidth(250);

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);


        //Label for email
        Label mailLabel = new Label("E-mail:");
        GridPane.setConstraints(mailLabel, 0, 0);

        //TextField for email
        TextField mailField = new TextField();
        mailField.setPromptText("e.g. azaidman@tudelft.nl");
        GridPane.setConstraints(mailField, 1, 0);

        //Label for name
        Label name = new Label("Name:");
        GridPane.setConstraints(name, 0, 1);

        //TextField for name
        TextField nField = new TextField();
        nField.setPromptText("e.g. Andy");
        GridPane.setConstraints(nField, 1, 1);

        //Label for surname
        Label surname = new Label("Surname:");
        GridPane.setConstraints(surname, 0, 2);

        //TextField for surname
        TextField surField = new TextField();
        surField.setPromptText("e.g. Zaidman");
        GridPane.setConstraints(surField, 1, 2);

        //Label for username
        Label nameLabel = new Label("Username:");
        GridPane.setConstraints(nameLabel, 0, 3);

        //TextField for username
        TextField nameField = new TextField();
        nameField.setPromptText("e.g. andy_zaidman");
        GridPane.setConstraints(nameField, 1, 3);

        //Label for password
        Label passLabel = new Label("Password:");
        GridPane.setConstraints(passLabel, 0, 4);

        //TextField for password
        TextField passField = new PasswordField();
        GridPane.setConstraints(passField, 1, 4);

        //Label to confirm password
        Label confPass = new Label("Confirm password:");
        GridPane.setConstraints(confPass, 0, 5);

        //TextField to confirm password
        TextField confPassField = new PasswordField();
        GridPane.setConstraints(confPassField, 1, 5);


        //Register button
        Button reg = new Button("Register");
        GridPane.setConstraints(reg, 0, 6);
        reg.setOnAction(e ->window.close() );


        grid.getChildren().addAll(mailLabel, mailField, name, nField, surname, surField, nameLabel, nameField, passLabel,
                passField, confPass, confPassField, reg);


        Scene scene = new Scene(grid, 350, 250);
        window.setScene(scene);
        window.showAndWait();

    }
}
