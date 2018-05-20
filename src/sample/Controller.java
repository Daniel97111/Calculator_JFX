package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    private double liczba;
    private Operations operacja;

    @FXML
    private TextField display;

    public Controller() {
    }


    @FXML
    private void handlerNumericButton(ActionEvent event) {
        String number = ((Button) event.getSource()).getText();
        display.setText(display.getText() + number);
        System.out.println("pressed " + number);
    }

    @FXML
    private void handlerOperation(ActionEvent event) {
        liczba = Double.parseDouble(display.getText());
        operacja = Operations.getValueBasedOnString(((Button) event.getSource()).getText());
        display.setText("");
    }

    @FXML
    private void handlerEqualOperation(ActionEvent event) {
        double obecnaLiczba = Double.parseDouble(display.getText());
        double wynik = liczba;
        switch (operacja) {
            case ADD:
                wynik = liczba + obecnaLiczba;
                break;
            case MIN:
                wynik = liczba - obecnaLiczba;
                break;
            case MUL:
                wynik = liczba * obecnaLiczba;
                break;
            case DIV:
                wynik = liczba / obecnaLiczba;
                break;
        }
        display.setText(String.valueOf(wynik));

    }

    @FXML
    public void pressedC(ActionEvent act) {
        System.out.println("pressed C");
        display.clear();
    }

    @FXML
    public void pressed_(ActionEvent act) {
        System.out.println("pressed . ");
        display.setText(display.getText() + ".");
    }

    @FXML
    void handleCancle() {
        System.exit(0);
    }
}
