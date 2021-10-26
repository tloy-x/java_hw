// Tanner Loy
// CS 110
// A class which represents a Truck given its Owner, 
// make, model, year, mileage, capacity, and number of axles.

public class Truck extends Vehicle{
    private int capacity, numAxles;
    private static final int DEF_CAPACITY = 1, DEF_AXLES = 2;

    /**
     * Constructor for the Truck class 
     * @param owner the owner of the Truck as Person
     * @param make the make of the Truck in String
     * @param model the model of the Truck in String
     * @param year the year of the Truck in int
     * @param mileage the mileage of the Truck in int
     * @param capacity the capicity of the Truck in int
     * @param numAxles the number of axles of the Truck in int
     */
    public Truck(Person owner, String make, String model, int year, int mileage, int capacity, int numAxles) {
        super(owner, make, model, year, mileage);
        this.capacity = capacity;
        this.numAxles = numAxles;
    }

    /**
     * Secondary constructor for the Truck class whhich sets the capacity and number of axles to defaults 
     * @param name the name of the Owner of the Truck in String
     * @param address the address of the Owner of the Truck in String
     * @param phone the phone number of the Owner of the Truck in String
     * @param make the make of the Truck in String
     * @param model the model of the Truck in String
     * @param year the year of the Truck in int
     * @param mileage the milage of the Truck in int
     */
    public Truck(String name, String address, String phone, String make, String model, int year, int mileage) {
        super(new Person(name, address, phone), make, model, year, mileage);
        this.capacity = DEF_CAPACITY;
        this.numAxles = DEF_AXLES;
    }

    // GETTERS AND SETTERS

    /**
     * Getter for capacity 
     * @return an int capacity 
     */
    public int getCapacity() {
        return this.capacity;
    }

    /**
     * Getter for numAxles
     * @return an int numAxles
     */
    public int getNumAxles() {
        return this.numAxles;
    }

    /**
     * Setter for capacity 
     * @param capacity capacity in int
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Setter for numAxles
     * @param numAxles an int numAxles
     */
    public void setNumAxles(int numAxles) { 
        this.numAxles = numAxles;
    }

    @Override
    /**
     * Overridden toString() method for Truck
     * @return a String containing formatted output 
     */
    public String toString() {
        return String.format("%s\n%s %s %s %s miles %d ton %d axles", getOwner(), getMake(), getModel(), getYear(), getMileage(), capacity, numAxles);
    }

    @Override
    /**
     * Overridden equals() method for Truck
     * @param o an Object o to be cast to Truck and compared
     * @return true if all fields are the same, false otherwise 
     */
    public boolean equals(Object o) {
        if (o.getClass() != this.getClass())
            return false;
            
        Truck t = (Truck) o;
        if (super.equals(o) && this.capacity == t.capacity && this.numAxles == t.numAxles)
            return true;
        else 
            return false;
    }
}

