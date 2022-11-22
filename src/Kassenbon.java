import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Kassenbon {

    private static final Kassenbon KASSENBON = new Kassenbon();
    private static ArrayList<Artikel> artikels;
    private static double summe;
    private static double summenetto;
    private final String date;

    private Kassenbon() {
        this.date = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new Date());
        summe = 0.0;
        summenetto = 0.0;
    }

    public static Kassenbon getKassenbon() {
        return KASSENBON;
    }

    public static void setWarenkorb(ArrayList<Artikel> artikels) {
        Kassenbon.artikels = artikels;
        Kassenbon.setSumme(artikels);
    }

    public static void setSumme(ArrayList<Artikel> artikels) {
        for (Artikel artikel : artikels) {
            Kassenbon.summe = summe + (artikel.getBruttoPreis() * artikel.getMenge());
            Kassenbon.summenetto = summenetto + (artikel.getNettoPreis() * artikel.getMenge());
        }
    }

    public static String createString(ArrayList<Artikel> artikels) {
        String ausgabe = "";
        int counter = 1;
        for (Artikel artikel : artikels) {
            ausgabe = ausgabe + counter + ") " + artikel.toString() + "\n";
            counter++;
        }
        return ausgabe;
    }


    @Override
    public String toString() {
        return "Datum: " + date + "\n" + "Anzahl: " + artikels.size() + "\n" + createString(artikels) + "\n" + "Summe: " + String.format("%,.2f", summe) + "\n" + "Netto: " + String.format("%,.2f", summenetto);
    }
}
