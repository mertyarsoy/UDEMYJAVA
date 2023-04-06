package MyApp;

public class Application2 {
    public static void main(String[] args) {

        Factory factory = new Factory();

        factory.design();
        factory.build();

        Car car = new Car();

        car.design();
        car.build();

    }

}
