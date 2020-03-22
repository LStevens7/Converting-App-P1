package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class convertingController {
    public ComboBox<String> speedComboBoxF;
    public ComboBox<String> speedComboBoxT;
    public TextField speedInput;
    public Button convertSpeed;
    public TextField speedOutput;
    public ComboBox<String> weightComboBoxF;
    public ComboBox<String> weightComboBoxT;
    public TextField weightInput;
    public Button convertWeight;
    public TextField weightOutput;
    public ComboBox<String> currencyComboBoxF;
    public ComboBox<String> currencyComboBoxT;
    public TextField currencyInput;
    public Button convertCurrency;
    public TextField currencyOutput;
    public ComboBox<String> lengthComboBoxF;
    public ComboBox<String> lengthComboBoxT;
    public TextField lengthInput;
    public Button convertLength;
    public TextField lengthOutput;
    public ComboBox<String> tempComboBoxF;
    public ComboBox<String> tempComboBoxT;
    public TextField tempInput;
    public Button convertTemp;
    public TextField tempOutput;


    public void speedSetupF(MouseEvent mouseEvent) {
        speedComboBoxF.getItems().clear();
        speedComboBoxF.getItems().addAll("mph", "kph", "m/s");
    }

    public void speedSetupT(MouseEvent mouseEvent) {
        speedComboBoxT.getItems().clear();
        speedComboBoxT.getItems().addAll("mph", "kph", "m/s");
    }

    public void speedConvert(ActionEvent actionEvent) {
        if (speedComboBoxF.getValue() == "mph") {
            if (speedComboBoxT.getValue() == "kph") {
                speedOutput.setText("" + (Double.parseDouble(speedInput.getText()) * 1.61));
            }
            else if (speedComboBoxT.getValue() == "m/s") {
                speedOutput.setText("" + (Double.parseDouble(speedInput.getText()) * 0.447));
            }
            else {
                speedOutput.setText("Invalid");
            }
        }
        else if (speedComboBoxF.getValue() == "kph") {
            if (speedComboBoxT.getValue() == "mph") {
                speedOutput.setText("" + (Double.parseDouble(speedInput.getText()) * 0.621));
            }
            else if (speedComboBoxT.getValue() == "m/s") {
                speedOutput.setText("" + (Double.parseDouble(speedInput.getText()) * 0.278));
            }
            else {
                speedOutput.setText("Invalid");
            }
        }
        else if (speedComboBoxF.getValue() == "m/s") {
            if (speedComboBoxT.getValue() == "mph") {
                speedOutput.setText("" + (Double.parseDouble(speedInput.getText()) * 2.24));
            }
            else if (speedComboBoxT.getValue() == "kph") {
                speedOutput.setText("" + (Double.parseDouble(speedInput.getText()) * 3.6));
            }
            else {
                speedOutput.setText("Invalid");
            }
        }
    }

    public void weightSetupF(MouseEvent mouseEvent) {
        weightComboBoxF.getItems().clear();
        weightComboBoxF.getItems().addAll("kilograms", "stone", "pounds");
    }

    public void weightSetupT(MouseEvent mouseEvent) {
        weightComboBoxT.getItems().clear();
        weightComboBoxT.getItems().addAll("kilograms", "stone", "pounds");
    }

    public void weightConvert(ActionEvent actionEvent) {
        if (weightComboBoxF.getValue() == "kilograms") {
            if (weightComboBoxT.getValue() == "stone") {
                weightOutput.setText("" + (Double.parseDouble(weightInput.getText()) * 0.157));
            }
            else if (weightComboBoxT.getValue() == "pounds") {
                weightOutput.setText("" + (Double.parseDouble(weightInput.getText()) * 2.2));
            }
            else {
                weightOutput.setText("Invalid");
            }
        }
        else if (weightComboBoxF.getValue() == "stone") {
            if (weightComboBoxT.getValue() == "kilograms") {
                weightOutput.setText("" + (Double.parseDouble(weightInput.getText()) * 6.35));
            }
            else if (weightComboBoxT.getValue() == "pounds") {
                weightOutput.setText("" + (Double.parseDouble(weightInput.getText()) * 14));
            }
            else {
                weightOutput.setText("Invalid");
            }
        }
        else if (weightComboBoxF.getValue() == "pounds") {
            if (weightComboBoxT.getValue() == "kilograms") {
                weightOutput.setText("" + (Double.parseDouble(weightInput.getText()) * 0.454));
            }
            else if (weightComboBoxT.getValue() == "stone") {
                weightOutput.setText("" + (Double.parseDouble(weightInput.getText()) * 0.071));
            }
            else {
                weightOutput.setText("Invalid");
            }
        }
    }

    public void currencySetupF(MouseEvent mouseEvent) {
        currencyComboBoxF.getItems().clear();
        currencyComboBoxF.getItems().addAll("Pounds", "Dollars", "Euro");
    }

    public void currencySetupT(MouseEvent mouseEvent) {
        currencyComboBoxT.getItems().clear();
        currencyComboBoxT.getItems().addAll("Pounds", "Dollars", "Euro");
    }

    public void currencyConvert(ActionEvent actionEvent) {
        if (currencyComboBoxF.getValue() == "Pounds") {
            if (currencyComboBoxT.getValue() == "Dollars") {
                currencyOutput.setText("" + (Double.parseDouble(currencyInput.getText()) * 1.22));
            }
            else if (currencyComboBoxT.getValue() == "Euro") {
                currencyOutput.setText("" + (Double.parseDouble(currencyInput.getText()) * 1.09));
            }
            else {
                currencyOutput.setText("Invalid");
            }
        }
        else if (currencyComboBoxF.getValue() == "Dollars") {
            if (currencyComboBoxT.getValue() == "Pounds") {
                currencyOutput.setText("" + (Double.parseDouble(currencyInput.getText()) * 0.82));
            }
            else if (currencyComboBoxT.getValue() == "Euro") {
                currencyOutput.setText("" + (Double.parseDouble(currencyInput.getText()) * 0.9));
            }
            else {
                currencyOutput.setText("Invalid");
            }
        }
        else if (currencyComboBoxF.getValue() == "Euro") {
            if (currencyComboBoxT.getValue() == "Pounds") {
                currencyOutput.setText("" + (Double.parseDouble(currencyInput.getText()) * 0.91));
            }
            else if (currencyComboBoxT.getValue() == "Dollars") {
                currencyOutput.setText("" + (Double.parseDouble(currencyInput.getText()) * 1.12));
            }
            else {
                currencyOutput.setText("Invalid");
            }
        }
    }

    public void lengthSetupF(MouseEvent mouseEvent) {
        lengthComboBoxF.getItems().clear();
        lengthComboBoxF.getItems().addAll("meters", "miles", "feet");
    }

    public void lengthSetupT(MouseEvent mouseEvent) {
        lengthComboBoxT.getItems().clear();
        lengthComboBoxT.getItems().addAll("meters", "miles", "feet");
    }

    public void lengthConvert(ActionEvent actionEvent) {
        if (lengthComboBoxF.getValue() == "meters") {
            if (lengthComboBoxT.getValue() == "miles") {
                lengthOutput.setText("" + (Double.parseDouble(lengthInput.getText()) * 0.0006));
            }
            else if (lengthComboBoxT.getValue() == "feet") {
                lengthOutput.setText("" + (Double.parseDouble(lengthInput.getText()) * 3.28));
            }
            else {
                lengthOutput.setText("Invalid");
            }
        }
        else if (lengthComboBoxF.getValue() == "miles") {
            if (lengthComboBoxT.getValue() == "meters") {
                lengthOutput.setText("" + (Double.parseDouble(lengthInput.getText()) * 1609));
            }
            else if (lengthComboBoxT.getValue() == "feet") {
                lengthOutput.setText("" + (Double.parseDouble(lengthInput.getText()) * 5280));
            }
            else {
                lengthOutput.setText("Invalid");
            }
        }
        else if (lengthComboBoxF.getValue() == "feet") {
            if (lengthComboBoxT.getValue() == "meters") {
                lengthOutput.setText("" + (Double.parseDouble(lengthInput.getText()) * 0.305));
            }
            else if (lengthComboBoxT.getValue() == "miles") {
                lengthOutput.setText("" + (Double.parseDouble(lengthInput.getText()) * 0.0002));
            }
            else {
                lengthOutput.setText("Invalid");
            }
        }
    }

    public void tempSetupF(MouseEvent mouseEvent) {
        tempComboBoxF.getItems().clear();
        tempComboBoxF.getItems().addAll("celsius", "fahrenheit", "kelvin");
    }

    public void tempSetupT(MouseEvent mouseEvent) {
        tempComboBoxT.getItems().clear();
        tempComboBoxT.getItems().addAll("celsius", "fahrenheit", "kelvin");
    }

    public void tempConvert(ActionEvent actionEvent) {
        if (tempComboBoxF.getValue() == "celsius") {
            if (tempComboBoxT.getValue() == "fahrenheit") {
                tempOutput.setText("" + ((Double.parseDouble(tempInput.getText()) * 1.8) + 32));
            }
            else if (tempComboBoxT.getValue() == "kelvin") {
                tempOutput.setText("" + (Double.parseDouble(tempInput.getText()) + 273.15));
            }
            else {
                tempOutput.setText("Invalid");
            }
        }
        else if (tempComboBoxF.getValue() == "fahrenheit") {
            if (tempComboBoxT.getValue() == "celsius") {
                tempOutput.setText("" + ((Double.parseDouble(tempInput.getText()) - 32) * 0.556));
            }
            else if (tempComboBoxT.getValue() == "kelvin") {
                tempOutput.setText("" + (((Double.parseDouble(tempInput.getText()) - 32) * 0.556) + 273.15));
            }
            else {
                tempOutput.setText("Invalid");
            }
        }
        else if (tempComboBoxF.getValue() == "kelvin") {
            if (tempComboBoxT.getValue() == "celsius") {
                tempOutput.setText("" + (Double.parseDouble(tempInput.getText()) - 273.15));
            }
            else if (tempComboBoxT.getValue() == "fahrenheit") {
                tempOutput.setText("" + (((Double.parseDouble(tempInput.getText()) - 273.15) * 1.8) + 32));
            }
            else {
                tempOutput.setText("Invalid");
            }
        }
    }
}
