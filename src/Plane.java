public class Plane extends Vehicle implements Flyable, Driveable{

    public Plane(Integer speed, float weight, String name){
        super(speed,weight, name);
    }
    @Override
    public void takeOff() {
        System.out.println(name+" is Taking Off");
    }

    @Override
    public void land() {
        System.out.println(name+" is Landing");
    }

    @Override
    public void changeHeight() {
        System.out.println(name+" is changing height.");
    }

    @Override
    public void accelerate(Integer acceleration) {
        System.out.println(name+" is accelerating");
    }

    @Override
    public void brake() {
        System.out.println(name+" is brake");
    }

    @Override
    public void changeGear() {
        System.out.println(name+" is changing gears");
    }
}
