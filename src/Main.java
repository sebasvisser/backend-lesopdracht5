public class Main {
    public static void main(String[] args) {
        Plane boeing747 = new Plane(100,200, "Boeing 747");
        boeing747.takeOff();

        Car lambourgini = new Car(100, 250, "Lambo");
        lambourgini.accelerate(10);

        FlyingCar flyHigh = new FlyingCar(50, 300, "Fly High");
        flyHigh.startEngine();
        flyHigh.accelerate(50);
        flyHigh.changeGear();
        flyHigh.takeOff();
    }
}

//
//        Instantieer objecten voor deze subclasses vanuit main() en laat ze rijden en vliegen.
//
//        Bonus: Voeg een Airport class toe met een lijst van voertuigen die kunnen vliegen. Genereer random de vulling voor de lijst.
