public class Automobile extends Vehicle {
    private int numPassengers;
    private boolean isSUV;

    public Automobile(Person owner, String make, String model, int year, int mileage, int numPassengers, boolean isSUV) {
        super(owner, make, model, year, mileage);
        this.numPassengers = numPassengers;
        this.isSUV = isSUV;
    }

    public int getNumPassengers() {
        return this.numPassengers;
    }

    public boolean getIsSUV() {
        return this.isSUV;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }
    
    public void setIsSUV(boolean isSUV) {
        this.isSUV = isSUV;
    }

    @Override
    public String toString() {
        if (isSUV)
            return String.format("%s\n%s %s %s %s miles %s passengers SUV", this.getOwner().toString(), this.getMake(), this.getModel(), this.getYear(), this.getMileage(), this.getNumPassengers());
        else
            return String.format("%s\n%s %s %s %s miles %s passengers", this.getOwner().toString(), this.getMake(), this.getModel(), this.getYear(), this.getMileage(), this.getNumPassengers());
    }

    @Override
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
