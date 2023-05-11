package instrument;

import recording.Audible;

import java.util.Objects;

// Gibt vor wie jedes Instrument sein soll
// Welche Eigenschaft soll _jedes_ Instrument haben z.B.?
// Wir können KEINE Instanzen einer abstrakten Klasse erstellen
// Einfacher gesagt =
// Wir können KEIN Objekt einer abstrakten Klasse erstellen
public abstract class Instrument implements Audible {

    // brand = Marke (dt.)
    private String brand;

    public Instrument() { }

    public Instrument(String brand) {
        this.brand = brand;
    }

    // Instrument kann Töne machen
    // ABER, wie die Töne klingen, ist HÖCHST spezifisch
    // Deshalb mach ich die Methode abstrakt
    // d.h. JEDE Kindklasse (die nicht abstrakt ist)
    // MUSS die abstrakte Methode SELBER implementieren
    public abstract void play();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // toString -> Hat jede Klasse
    // Zeigt das Objekt als lesbaren Satz an
    @Override
    public String toString() {
        return "Instrument{" +
                "brand='" + brand + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instrument that = (Instrument) o;
        return Objects.equals(brand, that.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand);
    }
}
