// Tanner Loy
// CS 110
// A class which represents a Vehicle given its Owner, 
// make, model, year, and mileage.

public class Vehicle {
    private Person owner;
    private String make, model;
    private int year, mileage;

    /**
     * Constructor for the Vehicle class
     * @param owner the owner of the vehicle as a Person
     * @param make the make of the Vehicle in String 
     * @param model the model of the Vehicle in String 
     * @param year the year of the Vehicle in int 
     * @param mileage the mileage of the Vehicle in int
     */
    public Vehicle(Person owner, String make, String model, int year, int mileage) {
        this.owner = owner;
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    /**
     * Secondary constructor for the Vehicle class which sets the mileage to 0
     * @param owner the owner of the vehicle as a Person
     * @param make the make of the Vehicle in String 
     * @param model the model of the Vehicle in String 
     * @param year the year of the Vehicle in int 
     */
    public Vehicle(Person owner, String make, String model, int year) {
        this.owner = owner;
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = 0;
    }

    // GETTERS AND SETTERS

    /**
     * Getter for owner
     * @return a String owner
     */
    public Person getOwner() {
        return this.owner;
    }

    /**
     * Getter for make
     * @return a String make
     */
    public String getMake() {
        return this.make;
    }

    /**
     * Getter for model
     * @return a String model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * Getter for year
     * @return an int year
     */
    public int getYear() {
        return this.year;
    }

    /**
     * Getter for mileage
     * @return an int mileage
     */
    public int getMileage() {
        return this.mileage;
    }

    /**
     * Setter for owner
     * @param owner owner in Person
     */
    public void setOwner(Person owner) {
        this.owner = owner;
    }

    /**
     * Setter for make
     * @param make make in String
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Setter for model
     * @param model model in String 
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Setter for year
     * @param year year in int
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Setter for mileage
     * @param mileage mileage in int
     */
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    // OVERRIDES 

    @Override
    /**
     * Overridden toString() method for Vehicle. Person's toString() is invoked.
     * @return a String containing formatted output
     */
    public String toString() {
        return String.format("%s\n%s %s %s %s miles", owner, make, model, year, mileage);
    }

    @Override
    /**
     * Overridden equals() method for vehicle. Person's equals() is invoked.
     * @param o an Object o to be cast to Vehicle and compared
     * @return true if all fields are the same, false otherwise
     */
    public boolean equals(Object o) {
        if (o.getClass() != this.getClass())
            return false;
            
        Vehicle v = (Vehicle) o;

        if (this.owner.equals(v.owner) && this.make.equals(v.make) && this.model.equals(v.model) && this.year == v.year && this.mileage == v.mileage)
            return true;
        else
            return false;
    }
}
