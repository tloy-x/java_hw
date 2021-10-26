public class Automobile extends Vehicle {
    private int numPassengers;
    private boolean isSUV;

    /**
     * Constructor for the Automobile class
     * @param owner owner of the Automobile in Person
     * @param make make of the Automobile in String
     * @param model model of the Automobile in String 
     * @param year year of the Automobile in int
     * @param mileage mileage of the Automobile in int 
     * @param numPassengers number of passengers of the Automobile in int
     * @param isSUV whether or not the Automobile is an SUV in boolean 
     */
    public Automobile(Person owner, String make, String model, int year, int mileage, int numPassengers, boolean isSUV) {
        super(owner, make, model, year, mileage);
        this.numPassengers = numPassengers;
        this.isSUV = isSUV;
    }

    /**
     * Getter for numPassengers
     * @return an int numPassengers 
     */
    public int getNumPassengers() {
        return this.numPassengers;
    }

    /**
     * Getter for isSUV
     * @return a boolean isSUV
     */
    public boolean getIsSUV() {
        return this.isSUV;
    }

    /**
     * Setter for numPassengers 
     * @param numPassengers number of passengers in int 
     */
    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }
    
    /**
     * Setter for isSUV
     * @param isSUV isSUV in boolean
     */
    public void setIsSUV(boolean isSUV) {
        this.isSUV = isSUV;
    }

    @Override
    /**
     * Overridden toString method for Automobile 
     * @return a String containing formatted output 
     */
    public String toString() {
        if (isSUV)
            return String.format("%s\n%s %s %s %s miles %s passengers SUV", this.getOwner().toString(), this.getMake(), this.getModel(), this.getYear(), this.getMileage(), this.getNumPassengers());
        else
            return String.format("%s\n%s %s %s %s miles %s passengers", this.getOwner().toString(), this.getMake(), this.getModel(), this.getYear(), this.getMileage(), this.getNumPassengers());
    }

    @Override
    /**
     * Overridden equals() method for Automobile
     * @return true if all fields are the same, false otherwise 
     */
    public boolean equals(Object o) {
        if (o.getClass() != this.getClass())
            return false;

        Automobile a = (Automobile) o;
        if (super.equals(o) && this.getNumPassengers() == a.getNumPassengers() && this.getIsSUV() == a.getIsSUV())
            return true;
        else
            return false;
    }
}
