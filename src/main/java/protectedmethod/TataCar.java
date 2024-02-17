package protectedmethod;

public abstract class TataCar {

    public Car getCar() {
        Engine engine = getEngine();
        Color color = getColor();
        Wheels wheels = getWheels();

        Car car = new Car(engine, wheels, color);

        return car;
    }


    protected abstract Color getColor();

    protected abstract Wheels getWheels();

    public Engine getEngine() {
        return new Engine();
    }
}
