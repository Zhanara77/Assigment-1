public class Main {
    public static void main(String[] args) {

        Car car = new Car("Toyota", 2018, 12000, 4);
        Bus bus = new Bus("Yutong", 2015, 40000, 45);

        System.out.println(car);
        System.out.println("Car insurance: " + car.calculateInsuranceFee());

        System.out.println(bus);
        System.out.println("Bus insurance: " + bus.calculateInsuranceFee());
    }
}
