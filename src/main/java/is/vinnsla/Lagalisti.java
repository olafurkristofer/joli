package is.vinnsla;
/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *  Viðmótsforritun 2024
 *
 * Vinnsluklasi fyrir lagalista. Lagalisti getur haft lista af Lag
 * Heldur utan um núverandi lag
 *
 *****************************************************************************/

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Lagalisti {

    // lagalistinn
    protected ObservableList<Lag> listi = FXCollections.observableArrayList();

    // núverandi lag
    private int index = 0;

    /**
     * Lesa skrá með eiginleikum laga og búa til lög
     * @param nafnASkra nafn á skrá
     * @throws IOException
     */
    public void lesaLog(String nafnASkra) throws IOException {
        System.out.println (System.getProperty("user.dir"));
        File file = new File (System.getProperty("user.dir")+"/src/main/resources/is/vinnsla/"+nafnASkra);
        Scanner scanner = new Scanner(file, StandardCharsets.UTF_8);
        String [] lina;
        try {
            // lesa gögn ur skrá og búa til Lag hlut
            while (scanner.hasNextLine()) {

                lina = scanner.nextLine().split(" ");
                listi.add(new Lag (lina[0], lina [3], lina[1], Integer.parseInt(lina[2])));
            }
            scanner.close();
        }catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    /**
     * index á næsta lag á lagalista
     */
    public void naesti() {
        index = ++index % listi.size();

    }

    // get og set aðferðir

    public ObservableList<Lag> getListi() {
        return listi;
    }

    public void setIndex(int selectedIndex) {
        index = selectedIndex;
    }

    public int getIndex() {
        return index;
    }
}
