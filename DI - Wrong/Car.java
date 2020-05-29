public class Car {
    private final PetrolEngine engine;

    public Car() {

        engine = new PetrolEngine(107.2f, 20.4f, 7372.50f);
    }

    public void start() {
        System.out.println("Car is starting");
        engine.run();
    }
}
