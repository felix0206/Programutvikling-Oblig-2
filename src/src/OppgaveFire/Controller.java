package OppgaveFire;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.HTMLEditor;



public class Controller {

    @FXML
    private HTMLEditor htmlEditor;

    @FXML
    private Button LoadBtn;

    @FXML
    private AnchorPane anchor;

    public void LoadBtn(ActionEvent event) throws Exception {

        //Kopier og lim inn path fra TestTråd.txt inne i OppgaveeFire package.
        String path = "/Users/felix/skrivebord/Programutvikling-Oblig-22/src/src/OppgaveFire/TestTråd.txt";

        Tråd load = new Tråd(path);

        htmlEditor.setHtmlText(load.call());

    }
}
