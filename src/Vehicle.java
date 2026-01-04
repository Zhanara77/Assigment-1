public abstract class Vehicle {

    protected int id;
    protected static int idGen = 1;
    protected String model;
    protected int year;
    protected double basePrice;

    public Vehicle(String model, int year, double basePrice) {
        this.id = idGen;
        idGen++;

        setModel(model);
        setYear(year);
        setBasePrice(basePrice);
    }

    // Getters / Setters (except idGen)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) throw new IllegalArgumentException("id must be > 0");
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("model must not be null or empty");
        }
        this.model = model.trim();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1886 || year > 2100) {
            throw new IllegalArgumentException("year must be in a reasonable range");
        }
        this.year = year;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        if (basePrice <= 0) {
            throw new IllegalArgumentException("basePrice must be > 0");
        }
        this.basePrice = basePrice;
    }

    public int getAge(int currentYear) {
        return currentYear - year;
    }

    public abstract double calculateInsuranceFee();

    public String toString() {
        return "Vehicle{id=" + id +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", basePrice=" + basePrice +
                '}';
    }
}

