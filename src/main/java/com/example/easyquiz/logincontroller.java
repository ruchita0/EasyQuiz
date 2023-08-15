package com.example.easyquiz;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
public class logincontroller {
	public Label welcomeText;
	@FXML
	public TextField roll_no;
	public  TextField user_name2;
	public TextField email;
	public Button submitbtn;
  public static String get_use="";
	@FXML

	private void initialize() {
		submitbtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				get_use=user_name2.getText();
				String name1 = user_name2.getText();
				String email1 = email.getText();
				String roll = roll_no.getText();
				if (name1.isEmpty() || email1.isEmpty() || roll.isEmpty()) {
					welcomeText.setText("plz enter all the fields!..");
				}
				else {
					try {
						Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
						thisstage.close();
						FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("home.fxml"));
						Scene scene = new Scene(fxmlLoader.load());
						Stage stage = new Stage();
						stage.setScene(scene);
						stage.initStyle(StageStyle.TRANSPARENT);
						scene.setFill(Color.TRANSPARENT);
						stage.show();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		});

	}
}