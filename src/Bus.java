public class Bus extends Vehicle {

    private int passengerCapacity;

    public Bus(String model, int year, double basePrice, int passengerCapacity) {
        super(model, year, basePrice);
        setPassengerCapacity(passengerCapacity);
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        if (passengerCapacity <= 0) {
            throw new IllegalArgumentException("passengerCapacity must be > 0");
        }
        this.passengerCapacity = passengerCapacity;
    }

    public double calculateInsuranceFee() {
        int currentYear = java.time.Year.now().getValue();
        int age = getAge(currentYear);
        return basePrice * 0.05 + age * 20.0;
    }
}
