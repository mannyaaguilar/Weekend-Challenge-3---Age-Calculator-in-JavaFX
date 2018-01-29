package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private TextField entryField;

    @FXML
    private Text questionText;

    @FXML
    private Text responseText;

    @FXML
    private Text responseText2;

    @FXML
    private Text responseText3;

    @FXML
    private Button btnSubmit;

    String name = "none";
    String age = null;
    String year = "xxxx";


        public void onSubmitClick(ActionEvent actionEvent){

            String userInput = entryField.getText();

            if(name.equals("none")){
            name = userInput;
            btnSubmit.getText();
            entryField.clear();}

            else if(year.equals("xxxx")){
            year = userInput;
            questionText.setText("Please enter current year:");
            btnSubmit.getText();
            entryField.clear();}

            else if(age.equals(null)){
            age = userInput;
            questionText.setText("Please enter your age:");
            btnSubmit.getText();
            entryField.clear();

            int age = Integer.parseInt(userInput);

            int followingYear = age + 1;
            int ageInFiveYears = age + 5;
            int ageInTenYears = age + 10;


            responseText.setText("You will be " + followingYear + " next year.");
            responseText2.setText("You will be " + ageInFiveYears + " in five years.");
            responseText3.setText("You will be " + ageInTenYears + " in ten years.");}
        }

    }


