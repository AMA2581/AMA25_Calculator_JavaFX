package com.calculator.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculatorController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textField;

    public String op = "";
    private double number1;
    private double number2;
    @FXML
    public void numberBtn( ActionEvent event ) {
        String num = ((Button)event.getSource()).getText();
            textField.setText(textField.getText() + num);
    }

    public void functionBtn( ActionEvent event ) {
        String opration = ((Button)event.getSource()).getText();
        if(!opration.equals("=")){
            if(!op.equals("")){
                return;
            }
            op = opration;
            number1 = Double.parseDouble(textField.getText());
            textField.setText("");
        }
        else {
            if(op.equals("")){
                return;
            }
            number2 = Double.parseDouble(textField.getText());
            calculate(number1, number2, op);
            op = "";
        }
    }

    public void calculate (double x, double y, String op) {
        switch (op) {
            case "+": textField.setText(number1 + number2 + "");
            break;
            case "-": textField.setText(number1 - number2 + "");
            break;
            case "*": textField.setText(number1 * number2 + "");
            break;
            case "/":
                if(number2 == 0){
                    textField.setText("0");
                    break;
                }
                else {
                    textField.setText(number1 / number2 + "");
                    break;
                }
            case "^": textField.setText(Math.pow(number1, number2) + "");
            break;
            case "&": textField.setText(Math.sqrt(number1) + "");
            break;
        }
    }

    public void resetBtn( ActionEvent event ) {
        textField.setText("");
        number1 = 0;
        number2 = 0;
        op= "";
    }

    @FXML
    void initialize(URL url, ResourceBundle resourceBundle) {

    }
}