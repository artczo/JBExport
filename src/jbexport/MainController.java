package jbexport;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
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
    @FXML
    private TextField brand;

    @FXML
    private TextField title;

    private int titleSize = 0;

    final int MAX_SIZE = 60;

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
        event.consume();
        titleSizeLabel.setText(String.format("%d znaków", (MAX_SIZE - title.getText().length())));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

}
