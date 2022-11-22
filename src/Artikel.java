public class Artikel {

    private final double MWST = 0.19;
    private int menge;
    private String bezeichnung;
    private double nettoPreis;


    public Artikel(int menge, String bezeichnung, double nettoPreis) {
        this.menge = menge;
        this.bezeichnung = bezeichnung;
        this.nettoPreis = nettoPreis;
    }


    public double getMWST() {
        return MWST;
    }

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public double getBruttoPreis() {
        double bruttoPreis = this.nettoPreis + (this.nettoPreis * this.MWST);
        return bruttoPreis;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public double getNettoPreis() {
        return nettoPreis;
    }

    public void setNettoPreis(double nettoPreis) {
        this.nettoPreis = nettoPreis;
    }

    @Override
    public String toString() {
        return "Artikel {" +
                " Bezeichnung='" + bezeichnung + '\'' +
                ", Menge=" + menge +
                ", NettoPreis=" + nettoPreis +
                ", BruttoPreis=" + String.format("%,.2f", getBruttoPreis()) +
                ", MWST=" + MWST +
                '}';
    }

}
