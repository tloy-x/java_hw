// Tanner Loy
// CS 110
// A class which represents a person given their name, 
// address, and phone number.

/**
 * @author Tanner Loy
 * @version 1.0
 * @since 10-23-2021
 */
public class Person {
    private String name, address, phone;

    /**
     * Constructor for the Person class
     * @param name the name of the Person in String
     * @param address the address of the Person in String
     * @param phone the phone number of the person in String
     */
    public Person(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    // GETTERS AND SETTERS
    
    /**
     * Getter for name
     * @return a String name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for address
     * @return a String address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Getter for phone
     * @return a String phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Setter for name
     * @param name name in String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter for address
     * @param address address in String
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Setter for phone
     * @param phone phone in String
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    // OVERRIDES

    @Override
    /**
     * Overridden toString method for Person
     * @return a String containing formatted Person 
     */
    public String toString() {
        return String.format("%s, %s, %s", this.name, this.address, this.phone);
    }

    @Override
    /**
     * Overridden equals() method for Person
     * @param o an Object o to be cast to Person and compared
     * @return true if all fields are the same, false otherwise
     */
    public boolean equals(Object o) {
        if (o.getClass() != this.getClass())
            return false;
            
        Person p = (Person) o;
        if (this.name.equals(p.name) && this.address.equals(p.address) && this.phone.equals(p.phone))
            return true;
        else
            return false;
    }
}
