import instrument.Guitar;
import instrument.Instrument;

public class Main {

    public static void main(String[] args) {
        Instrument ukulele = new Instrument();
        ukulele.play();

//        Instrument guitar = new Instrument("Ibanez");
        Guitar guitar = new Guitar("Ibanez");
        Guitar guitarWith7Strings = new Guitar("Ibanez", 7);

        guitar.play();
        guitarWith7Strings.play();

    }
}
