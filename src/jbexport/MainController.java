package jbexport;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    final int MAX_SIZE = 58;

    @FXML
    private TextField brand;

    @FXML
    private TextField title;

    @FXML
    private TextField size;

    @FXML
    private TextField id;

    @FXML
    private TextArea components;

    @FXML
    private TextArea liningComponents;

    @FXML
    private TextArea description;

    @FXML
    private ChoiceBox condition;

    @FXML
    private Label titleSizeLabel;

    @FXML
    private void keyReleasedTitleAction(KeyEvent event) {
        sizeSummary();
    }

    @FXML
    private void keyReleasedBrandAction(KeyEvent event) {
        sizeSummary();
    }

    @FXML
    private void keyReleasedSizeAction(KeyEvent event) {
        sizeSummary();
    }

    private void sizeSummary() {
        int sumSize = brand.getText().length() + title.getText().length() + size.getText().length();
        titleSizeLabel.setText(String.format("%d znaków", (MAX_SIZE - sumSize)));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

}
