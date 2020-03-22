package OppgaveFire;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.HTMLEditor;

import java.io.FileWriter;
import java.io.IOException;


public class Controller {

    @FXML
    private HTMLEditor htmlEditor;

    @FXML
    private Button LoadBtn;

    @FXML
    private AnchorPane anchor;

    @FXML
    private TextField TxtFil, TxtVersion, TxtLoad;

    @FXML
    private Button SaveBtn;

    @FXML
    private Label LblFeilmeld;


    String numberRegex = "[0-9]+";

    public void LoadBtn(ActionEvent event) throws Exception {

        String path = TxtLoad.getText();

        Tråd load = new Tråd(path);

        htmlEditor.setHtmlText(load.call());

    }

    public void SaveBtn(ActionEvent event) throws IOException {

        if (TxtFil.getText().isEmpty() || TxtVersion.getText().isEmpty() || !TxtVersion.getText().matches(numberRegex)){
            LblFeilmeld.setText("Skriv inn filnavn og version! Bare tall i version");
        }else{
            try{
                FileWriter fileWriter = new FileWriter(TxtFil.getText() + "-v" + TxtVersion.getText() + ".txt");
                fileWriter.append(htmlEditor.getHtmlText());
                fileWriter.close();
                LblFeilmeld.setText("Filen: " + TxtFil.getText() + "-v" + TxtVersion.getText() + ".txt" + " ble lagret");
            }catch (Exception e){
                LblFeilmeld.setText("Feil ved lagring");
                e.printStackTrace();
            }
        }
    }
}

