import java.util.ArrayList;
import java.util.List;

public class Airport {
    List<Flyable> flyableVehicles = new ArrayList<>();

    public Airport() {
        flyableVehicles.add(new FlyingCar(100,200,"Super Vliegtuig"));
        flyableVehicles.add(new FlyingCar(10,20,"Super Vliegtuig 2"));
        flyableVehicles.add(new FlyingCar(80,90,"Super Vliegtuig 3"));
    }
}

//        Bonus: Voeg een Airport class toe met een lijst van voertuigen die kunnen vliegen. Genereer random de vulling voor de lijst.
