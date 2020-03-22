package OppgaveFire;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.web.HTMLEditor;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller {

    @FXML
    private HTMLEditor htmlEditor;

    @FXML
    private Button SaveBtn;

    public void SaveBtn(ActionEvent event) {

        String path = "/Users/felix/skrivebord/Programutvikling-Oblig-22/src/src/OppgaveFire/TestTråd.txt";
        File file = new File(path);
        if (file != null) {
            String textRead = readFile(file);
            htmlEditor.setHtmlText(textRead);
            htmlEditor.setHtmlText(textRead);
        }
    }

    private String readFile(File file){
        StringBuilder stringBuffer = new StringBuilder();
        BufferedReader bufferedReader = null;

        try {

            bufferedReader = new BufferedReader(new FileReader(file));

            String text;
            while ((text = bufferedReader.readLine()) != null) {
                stringBuffer.append(text);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Trådprogrammering.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Trådprogrammering.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException ex) {
                Logger.getLogger(Trådprogrammering.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return stringBuffer.toString();
    }
}
