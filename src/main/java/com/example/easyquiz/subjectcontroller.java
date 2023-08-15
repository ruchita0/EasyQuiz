package com.example.easyquiz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class subjectcontroller{
	@FXML
	public Label question;
	@FXML
	public Button opt1, opt2, opt3, opt4;
	static int counter = 0;
	static int correct = 0;
	static int wrong = 0;
	@FXML
	private void initialize() {
		loadQuestions();
	}
	private void loadQuestions() {
		if (counter == 0) { //Question 1
			question.setText("1.full form of DBMS:-Data__ Management _____");
			opt1.setText("of Binary , System");
			opt2.setText("base , System");
			opt3.setText("base , Service");
			opt4.setText("Data Backup , System");
		}
		if (counter == 1) { //Question 2
			question.setText("2. Who created the first DBMS?");
			opt1.setText("Edgar Frank Codd");
			opt2.setText("Charles Bachman");
			opt3.setText("Charles Babbage");
			opt4.setText("Sharon B. Codd");
		}
		if (counter == 2) { //Question 3
			question.setText(" 3. Which type of data can be stored in the database?");
			opt1.setText("Image oriented data");
			opt2.setText("Text,files containing data");
			opt3.setText("Data in the form of audio or video");
			opt4.setText("All of the above");
		}
		if (counter == 3) { //Question 4
			question.setText("4. Which of the following is not an example of DBMS?");
			opt1.setText("MySQL");
			opt2.setText("Microsoft Acess");
			opt3.setText("IBM DB2");
			opt4.setText("Google");
		}
		if (counter == 4) {//Question 5
			question.setText("5. Which of the following is not a function of the database?");
			opt1.setText("Managing stored data");
			opt2.setText("Manipulating datae");
			opt3.setText("Security for stored data");
			opt4.setText("Analysing code");
		}
		if (counter == 5) { //Question 6
			question.setText("6.What does an RDBMS consist of?");
			opt1.setText("Collection of Records");
			opt2.setText("Collection of Keys");
			opt3.setText("Collection of Tables");
			opt4.setText("Collection of Fields");
		}
		if (counter == 6) { //Question 7
			question.setText("7. ______________ is a set of one or more attributes taken collectively to uniquely identify a record");
			opt1.setText("Primary Key");
			opt2.setText("Foreign key");
			opt3.setText("Super key");
			opt4.setText("Candidate key");
		}
		if (counter == 7) { //Question 8
			question.setText("8.Which command is used to remove a relation from an SQL?");
			opt1.setText("Drop table");
			opt2.setText("Delete");
			opt3.setText("Purgeh");
			opt4.setText("Remove");
		}
		if (counter == 8) { //Question 9
			question.setText("9.Which one of the following refers to the \"data about data\"?");
			opt1.setText("Directory");
			opt2.setText("Sub Data");
			opt3.setText("Warehouse");
			opt4.setText("Meta Data");
		}
		if (counter == 9) { //Question 10
			question.setText("10. Which of the following is a feature of the database?");
			opt1.setText("No-backup for the data stored");
			opt2.setText("User interface provided");
			opt3.setText("Lack of Authentication");
			opt4.setText("Store data in multiple locations");
		}

	}


	@FXML
	public void opt1clicked(ActionEvent event) {
		checkAnswer(opt1.getText().toString());
		if (checkAnswer(opt1.getText().toString())) {
			correct = correct + 1;
		} else {
			wrong = wrong + 1;
		}
		if (counter == 9) {
			try {
				System.out.println(correct);
				Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
				thisstage.close();
				FXMLLoader quiz = new FXMLLoader(getClass().getResource("result2.fxml"));
				Scene quizscene = new Scene(quiz.load());
				quizscene.setFill(Color.TRANSPARENT);
				Stage quizstage = new Stage();
				quizstage.setScene(quizscene);
				quizstage.initStyle(StageStyle.TRANSPARENT);
				quizstage.show();
			} catch(IOException e) {
				e.printStackTrace();
			}
		} else {
			counter++;
			loadQuestions();
		}

	}

	boolean checkAnswer(String answer) {

		if (counter == 0) {
			if (answer.equals("base , System")) {
				return true;
			} else {
				return false;
			}
		}
		if (counter == 1) {
			if (answer.equals("Charles Bachman")) {
				return true;
			} else {
				return false;
			}
		}
		if (counter == 2) {
			if (answer.equals("All of the above")) {
				return true;
			} else {
				return false;
			}
		}
		if (counter == 3) {
			if (answer.equals("Google")) {
				return true;
			} else {
				return false;
			}
		}
		if (counter == 4) {
			if (answer.equals("Analysing code")) {
				return true;
			} else {
				return false;
			}
		}
		if (counter == 5) {
			if (answer.equals("Collection of Tables")) {
				return true;
			} else {
				return false;
			}
		}
		if (counter == 6) {
			if (answer.equals("Primary Key")) {
				return true;
			} else {
				return false;
			}
		}
		if (counter == 7) {
			if (answer.equals("Drop table")) {
				return true;
			} else {
				return false;
			}
		}
		if (counter == 8) {
			if (answer.equals("Meta Data")) {
				return true;
			} else {
				return false;
			}
		}
		if (counter == 9) {
			if (answer.equals("User interface provided")) {
				return true;
			} else {
				return false;
			}
		}
		return false;


	}

	@FXML
	public void opt2clicked(ActionEvent event) {
		checkAnswer(opt2.getText().toString());
		if (checkAnswer(opt2.getText().toString())) {
			correct = correct + 1;
		} else {
			wrong = wrong + 1;
		}
		if (counter == 9) {
			try {
				System.out.println(correct);
				Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
				thisstage.close();
				FXMLLoader quiz = new FXMLLoader(getClass().getResource("result2.fxml"));
				Scene quizscene = new Scene(quiz.load());
				quizscene.setFill(Color.TRANSPARENT);
				Stage quizstage = new Stage();
				quizstage.setScene(quizscene);
				quizstage.initStyle(StageStyle.TRANSPARENT);
				quizstage.show();
			} catch(IOException e) {
				e.printStackTrace();
			}
		} else {
			counter++;
			loadQuestions();
		}
	}

	@FXML
	public void opt3clicked(ActionEvent event) {
		checkAnswer(opt3.getText().toString());
		if (checkAnswer(opt3.getText().toString())) {
			correct = correct + 1;
		} else {
			wrong = wrong + 1;
		}
		if (counter == 9) {
			try {
				System.out.println(correct);
				Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
				thisstage.close();
				FXMLLoader quiz = new FXMLLoader(getClass().getResource("result2.fxml"));
				Scene quizscene = new Scene(quiz.load());
				quizscene.setFill(Color.TRANSPARENT);
				Stage quizstage = new Stage();
				quizstage.setScene(quizscene);
				quizstage.initStyle(StageStyle.TRANSPARENT);
				quizstage.show();
			} catch(IOException e) {
				e.printStackTrace();
			}
		} else {
			counter++;
			loadQuestions();
		}
	}

	@FXML
	public void opt4clicked(ActionEvent event) {
		checkAnswer(opt4.getText().toString());
		if (checkAnswer(opt4.getText().toString())) {
			correct = correct + 1;
		} else {
			wrong = wrong + 1;
		}
		if (counter == 9) {
			try {
				System.out.println(correct);
				Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
				thisstage.close();
				FXMLLoader quiz = new FXMLLoader(getClass().getResource("result2.fxml"));
				Scene quizscene = new Scene(quiz.load());
				quizscene.setFill(Color.TRANSPARENT);
				Stage quizstage = new Stage();
				quizstage.setScene(quizscene);
				quizstage.initStyle(StageStyle.TRANSPARENT);
				quizstage.show();
			} catch(IOException e) {
				e.printStackTrace();
			}
		} else {
			counter++;
			loadQuestions();
		}
	}
}

