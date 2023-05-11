package instrument;

public class ElectricGuitar extends Guitar{

    // Standardkonstruktor - kann man nicht sehen, ist aber da/ wird erzeugt
    public ElectricGuitar() {
        // super -> denkt an super Elternteil und ruft den Konstruktor der Elternklasse auf
        super();
    }

    @Override
    public void play() {
        System.out.println("\n HIER IST DIE EGITARRE");
        // Elternklasse aufrufen mit super.
        super.play();
        System.out.println("WAKE UPPPPPPP GRABB ASDASDAU");
    }
}
