package is.vidmot;
/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *  Viðmótsforritun 2024
 *
 *  Dialog modal til að fá nafn áskrifanda
 *
 *****************************************************************************/
import is.vinnsla.Askrifandi;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.TextField;

import java.io.IOException;

// AskrifandiDialog erfir frá Dialog<Askrifandi>
public class AskrifandiDialog extends Dialog<Askrifandi> {

    // viðmótshlutur
    @FXML
    protected TextField fxNafn; // nafnið á áskrifanda

    // vinnsluhlutur
    private final Askrifandi askrifandi; // áskrifanda vinnsluhlutur

    /**
     * Smíður. Tekur inn áskrifanda, les inn DialogPane og setur í Dialog. Setur upp result converter
     * sem umbreytir gögnunum í Askrifandi hlut
     * @param askrifandi áskrifandinn
     */
    public AskrifandiDialog(Askrifandi askrifandi) {
        this.askrifandi = askrifandi;
        // Lesa inn dialog pane og setja í dialoginn
        setDialogPane(lesaDialog());
        // setja upp result converter
        setResultConverter();
    }

    /**
     * Færa gögn úr viðmótshlutum í dialog í vinnsluhlut
     */
    private void setResultConverter() {
        setResultConverter(b -> {                    // b er af taginu ButtonType - hér er lambda fall sem tekur inn b
            if (b.getButtonData() == ButtonBar.ButtonData.OK_DONE) {
                askrifandi.setNafn(fxNafn.getText());   // ná í nafnið út dialog og setja í áskrifanda hlutinn
                return askrifandi;
            } else {
                return null;
            }
        });         // endir á d.setResultConverter
    }

    /**
     * Lesa inn dialog pane úr .fxml skrá
     * @return
     */
    private DialogPane lesaDialog() {

        FXMLLoader fxmlLoader = new FXMLLoader(AskrifandiDialog.class.getResource(View.ASKRIFANDI.getFileName()));
        try {
            fxmlLoader.setController(this); // setur þennan hlut sem controller
            return fxmlLoader.load();       // hlaða inn fxml skránni
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }

    }
}
