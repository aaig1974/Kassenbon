public class KassenbonTest {
    public static void main(String[] args) {

        Warenkorb warenkorb = new Warenkorb();
        Kassenbon kassenbon = Kassenbon.getKassenbon();
        Kassenbon.setWarenkorb(warenkorb.getWarenkorb());
        System.out.println(kassenbon.toString());

    }
}
