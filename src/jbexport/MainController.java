package jbexport;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
