import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ClickDateHour {

    @FXML
    private Button button1;

    @FXML
    private Label labeldata;

    @FXML
    private Label labeldown;

    @FXML
    private Label labelhour;

    @FXML
    private Label labelup;

    @FXML
    void clickbutton1(ActionEvent event) {
        Date dataHoraAtual = new Date();
        String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
        String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);

        labeldata.setText(data);
        labelhour.setText(hora);

        

    }

}
