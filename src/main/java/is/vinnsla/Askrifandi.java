package is.vinnsla;
/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *  Viðmótsforritun 2024
 *
 * Vinnsluklasi fyrir áskrfianda. Hefur nafn
 *****************************************************************************/
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Askrifandi {

    private final StringProperty nafnProperty = new SimpleStringProperty();

    /**
     * Smiður fyrir Áskrifanda. Tekur inn nafn
     * @param nafn
     */
    public Askrifandi(String nafn) {
       setNafn(nafn);
    }

    // get og set aðferðir fyrir nafn

    public String getNafn() {
        return nafnProperty.get();
    }

    public void setNafn(String nafn) {
        nafnProperty.set(nafn);
    }


}
