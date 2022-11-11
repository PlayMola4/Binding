package com.example.binding;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {

    @FXML
    private ProgressBar btnBar;
    @FXML
    private Slider btnSlider;
    @FXML
    private TextField txtField2;
    @FXML
    private TextField txtField1;
    @FXML
    private Label labelBinding;
    @FXML
    private ListView <Integer> lView;

    public void initialize() {
        btnSlider.setMax(1);
        btnSlider.setMin(0);
        btnBar.setMaxWidth((Double.MAX_VALUE));
        btnBar.progressProperty().bind(btnSlider.valueProperty());

        txtField1.textProperty().bindBidirectional(txtField2.textProperty());

        lView.getItems().addAll(1, 2, 3, 4, 5);
        String txt = "Elemento seleccionado %d";

        labelBinding.textProperty().bind(lView.getSelectionModel().selectedItemProperty().asString(txt));
    }
}