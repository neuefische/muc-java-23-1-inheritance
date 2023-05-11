package recording;

import instrument.ElectricGuitar;
import instrument.Instrument;
import instrument.Piano;

public class RecordingStudio {

    /*
    * public - Visibility -> Sichtbarkeit
    * (es gibt public, protected, package protected, private)
    *
    * void - Rückgabetyp -> Welcher Typ kommt zurück?
    *
    * "record" - Name der Methode
    *
    * () - Parameter kommen da rein
    *
    *    Instrument - Typ vom Parameter
    *    instrumentToRecord - Name vom Parameter
    * */
    public void record(Audible instrumentToRecord) {
        System.out.println("Recording started!\n");
        instrumentToRecord.makeSound();
        System.out.println("\nRecording finished!");
    }
}
