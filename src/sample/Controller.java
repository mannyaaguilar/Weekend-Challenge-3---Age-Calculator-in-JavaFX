package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;

public class Controller {


    @FXML
    public Text responseText;

    @FXML
    public Text responseText2;

    @FXML
    public Text responseText3;

    @FXML
    public Text responseText4;


    @FXML
    public Text greetingText;


    @FXML
    public TextField userInput;

    @FXML
    public Button clickyButton;

    @FXML
    public Text questionText;

    public int whatClick = 0;

    public String userName = "";
    public String userAge = "";
    public String userYear = "";

    String[] questions = {
            "What is your name:",
            "What is your age:",
            "What is the current year:"
    };

    public void clickyButton(ActionEvent actionEvent) {
        whatClick++;

        if (whatClick == 1) {
            userName = userInput.getText();
            questionText.setText(questions[1]);
            userInput.clear();
        } else if (whatClick == 2) {
            userAge = userInput.getText();
            questionText.setText(questions[2]);
            userInput.clear();
        } else if (whatClick == 3) {
            userYear = userInput.getText();
            userInput.clear();

            int currentAge = Integer.parseInt(userAge);
            int currentYear = Integer.parseInt(userYear);

            int followingYear = currentAge + 1;
            int ageInFiveYears = currentAge + 5;
            int ageInTenYears = currentAge + 10;

            int nextYear = currentYear + 1;
            int inFiveYears = currentYear + 5;
            int inTenYears = currentYear + 10;

            responseText.setText(userName + ", you are currently " + userAge + " years old.");
            responseText2.setText("In 2019, you will be " + followingYear + " years old.");
            responseText3.setText("In 2023, you will be " + ageInFiveYears + " years old.");
            responseText4.setText("In 2028, you will be " + ageInTenYears + " years old.");

            clickyButton.setText("Reset");
            userInput.setDisable(true);
        } else if (whatClick == 4) {
            clickyButton.setText("Submit");
            whatClick = 0;
            questionText.setText(questions[0]);
            userInput.setDisable(false);
            responseText.setText(" ");
            responseText2.setText(" ");
            responseText3.setText(" ");
            responseText4.setText(" ");
        }

    }
}






