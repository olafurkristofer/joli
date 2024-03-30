package is.vidmot;
/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *  Viðmótsforritun 2024
 *
 *
 *  ónotað - aðeins notað til að sýna nemendum API fyrir klasann
 *
 *****************************************************************************/

import javafx.event.ActionEvent;

public interface PlayerControllerInterface {
    void initialize();

    void onVeljaLista(ActionEvent mouseEvent);

    /**
     * Loggar áskrifanda inn
     *
     * @param actionEvent
     */

    void onLogin(ActionEvent actionEvent);
}
