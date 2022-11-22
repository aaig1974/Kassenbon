import javax.swing.*;
import java.util.ArrayList;

public class Warenkorb {
    private ArrayList<Artikel> warenkorb;
    public Warenkorb() {
        warenkorb = new ArrayList<Artikel>();
        einkaufen();
    }

    private void einkaufen() {
        while (true) {
            try {
                int menge = Integer.parseInt(JOptionPane.showInputDialog("Menge:"));
                String bezeichnung = JOptionPane.showInputDialog("Bezeichnung");
                double nettoPreis = Double.parseDouble(JOptionPane.showInputDialog("NettoPreis:"));
                warenkorb.add(new Artikel(menge, bezeichnung, nettoPreis));
                int antwort = JOptionPane.showConfirmDialog(null, "Weiterkaufen?");
                if (antwort == JOptionPane.NO_OPTION) {
                    break;
                }
            } catch (Exception e) {

                if (JOptionPane.showConfirmDialog(null, "Beenden?") == JOptionPane.OK_OPTION) {
                    break;
                }

            }

        }
    }

    public ArrayList<Artikel> getWarenkorb() {
        return warenkorb;
    }
}
