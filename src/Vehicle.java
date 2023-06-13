public abstract class Vehicle {
    public Integer speed ;
    public float weight;
    public String name;

    public Vehicle(Integer speed, float weight, String name) {
        this.speed = speed;
        this.weight = weight;
        this.name = name;
    }

    public void startEngine() {
        System.out.println(name + " Vroom Vroom");
    }

    public void turnOffEngine(){
        System.out.println("Doei doei");
    }
}

