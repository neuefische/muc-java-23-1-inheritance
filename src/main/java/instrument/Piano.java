package instrument;

public class Piano extends Instrument {

    // Instrument kann Töne machen
    // ABER, wie die Töne klingen, ist HÖCHST spezifisch
    // Deshalb mach ich die Methode abstrakt
    // d.h. JEDE Kindklasse (die nicht abstrakt ist)
    // MUSS die abstrakte Methode SELBER implementieren
    @Override
    public void play() {
        System.out.println("In the enddddd!");
    }
}
