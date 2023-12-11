package com.example.dineshb;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField fcode;

    @FXML
    private Label last_Name;

    @FXML
    private TextField Lcode;

    @FXML
    private TextField ccode;

    @FXML
    private TextField Tcode;

    @FXML
    private Button Scode;

    @FXML
    private Button Dcode;

    @FXML
    void Delete( ) {

    }

    @FXML
    protected void Submit() {
        String FirstName = fcode.getText();
        String LastName = Lcode.getText();
        String Calculatedmarks=ccode.getText();
        String TotalMarks =Tcode.getText();
        String FullName=FirstName+""+LastName;
        Double Cmark = Double.parseDouble(Calculatedmarks);
        Double Tmark = Double.parseDouble(TotalMarks);
        HelloApplication  H = new HelloApplication();
        H.check(FullName,Cmark,Tmark);


    }

}
