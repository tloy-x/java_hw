import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class VehicleDriver {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a file to read from: ");

        Scanner f1 = new Scanner(new File(sc.nextLine()));
                
        sc.close();

        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        String next;

        // Steps through the file until EOF looking for type keywords
        // Then parse sequential data into appropriate constructor
        while (f1.hasNextLine()) {
            next = f1.nextLine();
            if (next.equals("Automobile")) {
                vehicles.add(new Automobile(new Person(f1.nextLine(), f1.nextLine(), f1.nextLine()), f1.nextLine(), f1.nextLine(), Integer.parseInt(f1.nextLine()), Integer.parseInt(f1.nextLine()), Integer.parseInt(f1.nextLine()), Boolean.parseBoolean(f1.nextLine())));
            }

            else if (next.equals("Taxi")) {
                vehicles.add(new Taxi(new Person(f1.nextLine(), f1.nextLine(), f1.nextLine()), f1.nextLine(), f1.nextLine(), Integer.parseInt(f1.nextLine()), Integer.parseInt(f1.nextLine()), Integer.parseInt(f1.nextLine()), Boolean.parseBoolean(f1.nextLine()), new Person(f1.nextLine(), f1.nextLine(), f1.nextLine()), f1.nextLine()));
            }

            else if (next.equals("Truck")) {
                vehicles.add(new Truck(new Person(f1.nextLine(), f1.nextLine(), f1.nextLine()), f1.nextLine(), f1.nextLine(), Integer.parseInt(f1.nextLine()), Integer.parseInt(f1.nextLine()), Integer.parseInt(f1.nextLine()), Integer.parseInt(f1.nextLine())));
            }
        }

        // Find object with lowest year
        ArrayList<Vehicle> oldest = new ArrayList<Vehicle>();
        Vehicle temp = vehicles.get(0);
        for (int i = 1; i < vehicles.size(); i++) {
            Vehicle nextVehicle = vehicles.get(i);

            if (temp.getYear() >= nextVehicle.getYear()) {
                temp = nextVehicle;
            }
        }

        // Add to ArrayList
        oldest.add(temp);

        // Grab all objects with same year except the same object
        for (int i = 1; i < vehicles.size(); i++) {
            Vehicle nextVehicle = vehicles.get(i);

            if (temp.getYear() == nextVehicle.getYear() && !temp.equals(nextVehicle)) {
                oldest.add(nextVehicle);
            }
        }

        //OUTPUT 
        System.out.println("\nVehicles to be sold:");
        for (int i = 0; i < oldest.size(); i++) {
            System.out.printf("%s: %d: %s\n\n", oldest.get(i).getClass().toString().substring(6).toUpperCase(), i + 1, oldest.get(i));
        }
    }
}
