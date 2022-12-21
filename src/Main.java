import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter parking lot width : ");
        long width = scanner.nextLong();
        System.out.println("Enter parking lot length : ");
        long length = scanner.nextLong();
        ParkingLot pl = new ParkingLot(width, length);
        System.out.println("Number of cars can be parked in the specified parking lot : " + pl.getSlotsCount());
        System.out.println("Enter number of cars needed to be parked : ");
        long numberOfCars = scanner.nextLong();
        for (int i = 0; i < numberOfCars; i++) {
            System.out.print("\nEnter car number : ");
            String numberPlate = scanner.next();
            Car car = new Car(numberPlate);
            boolean status = false;
            while (!status) {
                int slot = (int) (Math.random()*Math.pow(10,15)% pl.getSlotsCount())+1;
                status = car.park(pl, slot);
            }
            if (status) {
                System.out.print("\nCar with license plate " + car + " is parked successfully at slot " + car.getSlot());
            } else {
                System.out.print("\nCar with license plate " + car + " is not parked successfully");
            }
            if (pl.getSlotsCount() == pl.slots.size()) {
                System.out.print("\nParking lot is full");
                break;
            }
        }
        System.out.println(pl.getAllCarDetails());
    }
}