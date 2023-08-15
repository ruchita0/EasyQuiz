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

public class javacontroller{
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
			question.setText("1. Who invented Java Programming?Who invented Java Programming?");
			opt1.setText("Guido van Rossum");
			opt2.setText("James Gosling");
			opt3.setText("Dennis Ritchie");
			opt4.setText("Bjarne Stroustrup");
		}
		if (counter == 1) { //Question 2
			question.setText("2.Which statement is true about Java?");
			opt1.setText("sequence-dependent programming language");
			opt2.setText("code dependent programming language");
			opt3.setText("platform-dependent programming language");
			opt4.setText("platform-independent programming language");
		}
		if (counter == 2) { //Question 3
			question.setText("3.Which component is used to compile, debug and execute the java programs?s");
			opt1.setText("JRE");
			opt2.setText("JIT");
			opt3.setText("JDK");
			opt4.setText("JVM");
		}
		if (counter == 3) { //Question 4
			question.setText("4. .Which one of the following is not a Java feature?");
			opt1.setText("Object-oriented");
			opt2.setText("Use of pointers");
			opt3.setText("Portable");
			opt4.setText("Dynamic and Extensible");
		}
		if (counter == 4) {//Question 5
			question.setText("5.What is the extension of java code files?");
			opt1.setText(".js");
			opt2.setText(".txt");
			opt3.setText(".class");
			opt4.setText(".java");
		}
		if (counter == 5) { //Question 6
			question.setText("6. Which of these are selection statements in Java?");
			opt1.setText("break");
			opt2.setText("continue");
			opt3.setText("for()");
			opt4.setText("if()");
		}
		if (counter == 6) { //Question 7
			question.setText("7. Which of these keywords are used for the block to be examined for exceptions?");
			opt1.setText("check");
			opt2.setText("throw");
			opt3.setText("catch");
			opt4.setText("try");
		}
		if (counter == 7) { //Question 8
			question.setText("8. Which one of the following is not an access modifier?");
			opt1.setText("Protected");
			opt2.setText("Void");
			opt3.setText("Public");
			opt4.setText("Private");
		}
		if (counter == 8) { //Question 9
			question.setText("9.What data structure should be used when number of elements is fixed?");
			opt1.setText("Array");
			opt2.setText("Arrray list");
			opt3.setText("Vector");
			opt4.setText("Set");
		}
		if (counter == 9) { //Question 10
			question.setText("10.Which of the following loops will execute the body of loop even when condition controlling the loop is initially false?");
			opt1.setText("do-while");
			opt2.setText("while");
			opt3.setText("for");
			opt4.setText("none of the mentioned");
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
				FXMLLoader quiz = new FXMLLoader(getClass().getResource("result3.fxml"));
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
			if (answer.equals("James Gosling")) {
				return true;
			} else {
				return false;
			}
		}
		if (counter == 1) {
			if (answer.equals("platform-independent programming language")) {
				return true;
			} else {
				return false;
			}
		}
		if (counter == 2) {
			if (answer.equals("JDK")) {
				return true;
			} else {
				return false;
			}
		}
		if (counter == 3) {
			if (answer.equals("Use of pointers")) {
				return true;
			} else {
				return false;
			}
		}
		if (counter == 4) {
			if (answer.equals(".java")) {
				return true;
			} else {
				return false;
			}
		}
		if (counter == 5) {
			if (answer.equals("if()")) {
				return true;
			} else {
				return false;
			}
		}
		if (counter == 6) {
			if (answer.equals("try")) {
				return true;
			} else {
				return false;
			}
		}
		if (counter == 7) {
			if (answer.equals("Void")) {
				return true;
			} else {
				return false;
			}
		}
		if (counter == 8) {
			if (answer.equals("Array")) {
				return true;
			} else {
				return false;
			}
		}
		if (counter == 9) {
			if (answer.equals("do-while")) {
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
				FXMLLoader quiz = new FXMLLoader(getClass().getResource("result3.fxml"));
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
				FXMLLoader quiz = new FXMLLoader(getClass().getResource("result3.fxml"));
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
				FXMLLoader quiz = new FXMLLoader(getClass().getResource("result3.fxml"));
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

