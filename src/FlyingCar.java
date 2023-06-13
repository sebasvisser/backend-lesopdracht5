public class FlyingCar extends Vehicle implements Flyable, Driveable{
    public FlyingCar(Integer speed, float weight, String name){
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

    }

    @Override
    public void changeGear() {
// todo: if-else statement toevoegen om specifiek naar een bepaalde gear te schakelen
        System.out.println(name + "Changing Gears");
    }

    @Override
    public void takeOff() {
        System.out.println(name+" is taking off from the ground and is now flying instead of driving.");

    }

    @Override
    public void land() {

    }

    @Override
    public void changeHeight() {

    }
}
