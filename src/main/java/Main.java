import instrument.Guitar;
import instrument.Instrument;
import instrument.Ukulele;

public class Main {

    public static void main(String[] args) {
//        FUNKTIONIERT NICHT! -> WIE SOLL ICH EIN "INSTRUMENT" BAUEN?
        Instrument ukulele = new Ukulele();
        ukulele.play();

//        Instrument guitar = new Instrument("Ibanez");
        Guitar guitar = new Guitar("Ibanez");
        Guitar guitarWith7Strings = new Guitar("Ibanez", 7);

        guitar.play();
        guitarWith7Strings.play();

    }
}
