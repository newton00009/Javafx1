package sample;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField t1;
    @FXML
    private TextField t2;
    @FXML
    private TextField t3;
    @FXML
    private TextField t4;
    @FXML
    private TextField t5;
    @FXML
    private TextField t6;


    public void resiscalc()
    {
        double r1= Double.parseDouble(t1.getText());
        double r2= Double.parseDouble(t2.getText());
        double r3= Double.parseDouble(t3.getText());
        double r4= Double.parseDouble(t4.getText());
        double rg= Double.parseDouble(t5.getText());
        double ra,rb,rc,req;
        ra=(rg*r3)/(rg+r3+r4);
        rb=(rg*r4)/(rg+r3+r4);
        rc=(r4*r3)/(r4+r3+rg);
        req=rc+((r1+ra)*(r2+rb))/(r1+ra+r2+rb);
        //System.out.println(req);
        t6.setText(String.valueOf(req));

    }
}
