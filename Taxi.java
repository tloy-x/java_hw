public class Taxi extends Automobile {
    private Person driver;
    private String ID;  

    /**
     * Constructor for the Taxi class
     * @param owner the owner of the Taxi as a Person
     * @param make the make of the Taxi in String
     * @param model the model of the Taxi in String
     * @param year the year of the Taxi in int
     * @param mileage the mileage of the Taxi in int
     * @param numPassengers the number of passengers of the Taxi in int
     * @param isSUV whether or not the Taxi is an SUV in boolean
     * @param driver the driver of the Taxi as a Person
     * @param ID the ID of the driver in String
     */
    public Taxi(Person owner, String make, String model, int year, int mileage, int numPassengers, boolean isSUV, Person driver, String ID) {
        super(owner, make, model, year, mileage, numPassengers, isSUV);
        this.driver = driver;
        this.ID = ID;
    }

    /**
     * Getter for driver
     * @return a Person driver 
     */
    public Person getDriver() {
        return this.driver;
    }
    
    /**
     * Getter for ID 
     * @return a String ID 
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Setter for driver 
     * @param driver driver of the Taxi in Person 
     */
    public void setDriver(Person driver) {
        this.driver = driver;
    }

    /**
     * Setter for ID 
     * @param ID ID of the Taxi in String 
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    /**
     * Overridden toString() method for Taxi
     * @return a String containing formatted output 
     */
    public String toString() {
        return String.format("%s\nDriver: %s ID#%s", super.toString(), this.getDriver(), this.getID());
    }

    @Override
    /**
     * Overridden equals() method for Taxi
     * @return true if all fields are the same, false otherwise
     */
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
