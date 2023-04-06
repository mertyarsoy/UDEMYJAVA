package MyApp;

public class Car2 extends Vehicle{
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        Car2 car = new Car2();

        Vehicle vehicle1 = car;
        vehicle1.design();
        

    }

    @Override
    public void design() {
        System.out.println("Car design");
    }
}
