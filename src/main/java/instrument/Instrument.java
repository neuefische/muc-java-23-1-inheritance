package instrument;

import java.util.Objects;

public class Instrument {

    // brand = Marke (dt.)
    private String brand;

    public Instrument() {

    }

    public Instrument(String brand) {
        this.brand = brand;
    }

    // Kann Töne machen
    public void play() {
        // Wolf of Wallstreet mäßig
        System.out.println("Mhm mhmmmm!");
    }

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
