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

public class QuizController {
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
            question.setText("1.Who is the father of C language?");
            opt1.setText("Steve Jobs");
            opt2.setText("James Gosling");
            opt3.setText("Dennis Ritchie");
            opt4.setText("Rasmus Lerdorf");
        }
        if (counter == 1) { //Question 2
            question.setText("2.Which of the following is not a valid C variable name?");
            opt1.setText("int number;");
            opt2.setText("float rate;");
            opt3.setText("int variable_count;");
            opt4.setText("int $main;");
        }
        if (counter == 2) { //Question 3
            question.setText("3.All keywords in C are in ____________");
            opt1.setText("LowerCase letters");
            opt2.setText("UpperCase letters");
            opt3.setText("CamelCase letters");
            opt4.setText("None of the mentioned");
        }
        if (counter == 3) { //Question 4
            question.setText("4.Which is valid C expression?");
            opt1.setText("int my_num = 100,000;");
            opt2.setText("int my_num = 100000;");
            opt3.setText("int my num = 1000;");
            opt4.setText("int my num = 1000;");
        }
        if (counter == 4) {//Question 5
            question.setText("5.Which of the following declaration is not supported by C language?");
            opt1.setText("String str;");
            opt2.setText("char *str;");
            opt3.setText("float str = 3e2");
            opt4.setText("Both “String str;” and “float str = 3e2;”");
        }
        if (counter == 5) { //Question 6
            question.setText("6.What is an example of iteration in C?");
            opt1.setText("for");
            opt2.setText("while");
            opt3.setText("do-while");
            opt4.setText("all of the mentioned");
        }
        if (counter == 6) { //Question 7
            question.setText("7.. What is #include <stdio.h>?");
            opt1.setText("Preprocessor directive");
            opt2.setText("Inclusion directive");
            opt3.setText("File inclusion directive");
            opt4.setText("None of the mentioned");
        }
        if (counter == 7) { //Question 8
            question.setText("8.Which of the following are C preprocessors?");
            opt1.setText("#ifdef");
            opt2.setText("#define");
            opt3.setText("#endif");
            opt4.setText("all of the mentioned");
        }
        if (counter == 8) { //Question 9
            question.setText("9.The C-preprocessors are specified with _________ symbol.");
            opt1.setText("#");
            opt2.setText(" $");
            opt3.setText("” ”");
            opt4.setText("&");
        }
        if (counter == 9) { //Question 10
            question.setText("10 In C language, FILE is of which data type?");
            opt1.setText("int");
            opt2.setText("struct");
            opt3.setText("char *");
            opt4.setText("None of the mentioned");
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("result.fxml"));
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
            if (answer.equals("Dennis Ritchie")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 1) {
            if (answer.equals("int $main;")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 2) {
            if (answer.equals("LowerCase letters")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 3) {
            if (answer.equals("int my_num = 100000;")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 4) {
            if (answer.equals("String str;")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 5) {
            if (answer.equals("all of the mentioned")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 6) {
            if (answer.equals("Preprocessor directive")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 7) {
            if (answer.equals("all of the mentioned")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 8) {
            if (answer.equals("#")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 9) {
            if (answer.equals("struct")) {
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("result.fxml"));
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("result.fxml"));
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("result.fxml"));
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

