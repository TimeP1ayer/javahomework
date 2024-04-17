interface canFly {
    int speed();
}

abstract class Machine {
    abstract void work();
}

class AirPlane extends Machine implements canFly {

    private String model;
    private int speed;

    public AirPlane(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "AirPlane Model: " + this.model;
    }

    @Override
    public int speed() {
        return this.speed;
    }

    @Override
    public void work() {
        System.out.println("正在飞行,速度为" + this.speed + "km/h");
    }
}

public class Main {
    public static void main(String[] args) {

        AirPlane airplane = new AirPlane("Su-7", 240);
        canFly fly = airplane;

        airplane.work();
        System.out.println(fly + ", speed: " + fly.speed() + "km/h");
    }
}
