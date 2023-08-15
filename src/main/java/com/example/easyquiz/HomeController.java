package com.example.easyquiz;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
public class HomeController {
    @FXML

    public ChoiceBox choiceBox;
    public Label userInputField;

 @FXML
    private Button playquizbtn2;
    private static final String C_LANGUAGE_QUIZ="C PROGRAMMING LANGUAGE";
    private static final String DB_LANGUAGE_QUIZ="DATABASE MANAGEMENT SYSTEM";
    private static final String JAVA_LANGUAGE_QUIZ="JAVA PROGRAMMING LANGUAGE";

    private boolean C_L ;
    private boolean DB_L ;
    private boolean J_L;
    //String name22=logincontroller.name1
    String user1 ;


    @FXML
    private void initialize() {
        user1= logincontroller.get_use;
    userInputField.setText(String.valueOf("WELCOME : "+user1));
        choiceBox.getItems().add(C_LANGUAGE_QUIZ);
        choiceBox.getItems().add(DB_LANGUAGE_QUIZ);
        choiceBox.getItems().add(JAVA_LANGUAGE_QUIZ);
        choiceBox.getSelectionModel().selectedItemProperty().addListener((observableValue, o, t1) ->
        {
            if(t1.equals(C_LANGUAGE_QUIZ)){
                C_L=true;
            }else {
                if (t1.equals(DB_LANGUAGE_QUIZ)) {
                    DB_L=true;
                }
                else {
                    J_L=true;
                }

            }
        });


               playquizbtn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {
                if(C_L){
                    try {
                        Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                        thisstage.close();
                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("quiz.fxml"));
                        Scene scene = new Scene(fxmlLoader.load());
                        Stage stage = new Stage();
                        stage.setScene(scene);
                        stage.initStyle(StageStyle.TRANSPARENT);
                        scene.setFill(Color.TRANSPARENT);
                        stage.show();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else
                    if (DB_L) {
                        try {
                            Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                            thisstage.close();
                            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("subject.fxml"));
                            Scene scene = new Scene(fxmlLoader.load());
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.initStyle(StageStyle.TRANSPARENT);
                            scene.setFill(Color.TRANSPARENT);
                            stage.show();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                }else {
                        try {
                            Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                            thisstage.close();
                            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("java.fxml"));
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