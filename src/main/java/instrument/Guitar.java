package instrument;

import recording.Audible;

// Das Stichwort = "extends" = Erbt von Instrument
public class Guitar extends Instrument {

    private int numberOfStrings;


    public Guitar() { }

    public Guitar(String brand) {
        super(brand);
    }

    public Guitar(String brand, int numberOfStrings) {
        super(brand);
        this.numberOfStrings = numberOfStrings;
    }


    // Mit @ = Annotation
    @Override
    public void play() {
        System.out.println("Smoke on the water!");
    }

    @Override
    public void makeSound() {
        play();
    }
}
