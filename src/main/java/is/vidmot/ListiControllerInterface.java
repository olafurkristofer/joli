package is.vidmot;
/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *  Viðmótsforritun 2024
 *
 *  ónotað - eingöngu notað til að sýna nemendum API
 *****************************************************************************/
import javafx.event.ActionEvent;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public interface ListiControllerInterface {


    /**
     * Frumstillir lagalistann og tengir hann við ListView viðmótshlut
     */
    void initialize();

    /**
     * Bregðast við músaratburði og spila valið lag
     *
     * @param mouseEvent
     */
    void onValidLag(MouseEvent mouseEvent);

    /**
     * Lætur laga lista vita hvert valda lagið er. Uppfærir myndina fyrir lagið.
     */
    void veljaLag();

    /**
     * Lagið er pásað ef það er í spilun, lagið er spilað ef það er í pásu
     *
     * @param actionEvent ónotað
     */
    void onPlayPause(ActionEvent actionEvent);

    /**
     * Fara aftur í heima view. Ef spilari er til stöðva spilarann
     *
     * @param actionEvent ónotað
     */
    void onHeim(ActionEvent actionEvent);

    /**
     * Spila lagið
     */
    void spilaLag();

    /**
     * Setja mynd með nafni á ImageView
     *
     * @param fxImageView viðmótshluturinn sem á að uppfærast
     * @param nafnMynd    nafn á myndinni
     */
    void setjaMynd(ImageView fxImageView, String nafnMynd);

    /**
     * Setja upp player fyrir lagið, þ.m.t. at setja handler á hvenær lagið stoppar og tengja
     * lagið við progress bar
     */
    void setjaPlayer();

    /**
     * Næsta lag er spilað. Kallað á þessa aðferð þegar fyrra lag á listanum endar
     */
    void naestaLag();
}
