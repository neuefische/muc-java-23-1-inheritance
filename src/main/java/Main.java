import instrument.*;
import recording.RecordingStudio;

public class Main {

    public static void main(String[] args) {
//        FUNKTIONIERT NICHT! -> WIE SOLL ICH EIN "INSTRUMENT" BAUEN?
        Instrument ukulele = new Ukulele();

//        Instrument guitar = new Instrument("Ibanez");
        Guitar guitar = new Guitar("Ibanez");
        Guitar guitarWith7Strings = new Guitar("Ibanez", 7);

        Piano piano = new Piano();
        Guitar eGuitar = new ElectricGuitar();

//        ukulele.play();
//        guitar.play();
//        guitarWith7Strings.play();
//        piano.play();
//        eGuitar.play();

        RecordingStudio recordingStudio = new RecordingStudio();
        recordingStudio.record(piano);
    }
}
