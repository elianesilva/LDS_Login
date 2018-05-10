package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController implements Initializable{

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	@FXML
	private Label lblStatus;
	
	@FXML
	private TextField txtUsername;
	
	@FXML
	private PasswordField txtPassword;
	
	public void Login(ActionEvent event) throws IOException{
		if(txtUsername.getText().equals("user")&& txtPassword.getText().equals("pass")) {
			lblStatus.setText("Login ok");
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();	
		} else {
			lblStatus.setText("Erro no login");
		}
	}
	

}
