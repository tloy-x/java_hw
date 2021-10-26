public class Taxi extends Automobile {
    private Person driver;
    private String ID;  

    public Taxi(Person owner, String make, String model, int year, int mileage, int numPassengers, boolean isSUV, Person driver, String ID) {
        super(owner, make, model, year, mileage, numPassengers, isSUV);
        this.driver = driver;
        this.ID = ID;
    }

    public Taxi(Person owner, String make, String model, int year, int mileage, int numPassengers, boolean isSUV, String name, String address, String phone, String ID) {
        super(owner, make, model, year, mileage, numPassengers, isSUV);
        this.driver = new Person(name, address, phone);
        this.ID = ID;
    }

    public Person getDriver() {
        return this.driver;
    }
    
    public String getID() {
        return this.ID;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return String.format("%s\nDriver: %s ID#%s", super.toString(), this.getDriver(), this.getID());
    }

    @Override
    public boolean equals(Object o) {
        if (o.getClass() != this.getClass())
            return false;
            
        Taxi t = (Taxi) o;
        if (super.equals(o) && this.getDriver().equals(t.getDriver()) && this.getID().equals(t.getID()))
            return true;
        else 
            return false;
    }
}
