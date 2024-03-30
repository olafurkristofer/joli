package is.vinnsla;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *  Viðmótsforritun 2024
 *
 *  Vinnsluklasi fyrir Lag. Hefur nafn, lengd, mynd og media (skráaslóð) fyrir lagið
 *****************************************************************************/

public class Lag {
    private final String media;
    private final String nafn;

    private final int lengd;

    private final String mynd;


    /**
     * Smiður sem tekur inn eiginleika lags og smíðar lagið
     *
     * @param slod  skráaslóð fyrir lagið
     * @param mynd  mynd sem er sýnd þegar lagið er spilað
     * @param nafn  nafn lags
     * @param lengd lengd lags
     */
    public Lag(String slod, String mynd, String nafn, int lengd) {
        media = slod;
        this.nafn = nafn;
        this.lengd = lengd;
        this.mynd = mynd;
    }

    @Override
    public String toString() {
        return nafn;
    }

    // get aðferðir fyrir tilviksbreytur

    public String getMedia() {
        return media;
    }

    public String getNafn() {
        return nafn;
    }

    public String getMynd() {
        return mynd;
    }

    public int getLengd() {
        return lengd;
    }

}
