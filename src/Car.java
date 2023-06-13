public class Car extends Vehicle implements Driveable{

    public Car(Integer speed, float weight, String name){
        super(speed,weight, name);
    }
    @Override
    public void accelerate(Integer acceleration) {
        System.out.println(name+" is driving at " + speed + " km per hour. And is accelerating.");
        speed = speed + acceleration;
        System.out.println("Speed is now: " + speed + " km per hour.");
    }

    @Override
    public void brake() {
        System.out.println(name+" is braking");
    }

    @Override
    public void changeGear() {
        System.out.println(name+" is Taking Off");


    }
}
