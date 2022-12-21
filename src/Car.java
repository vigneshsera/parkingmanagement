public class Car {
    String numberPlate;
    int slot;

    public Car(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String toString() {

        return numberPlate;
    }

    public boolean park(ParkingLot parkingLot, int slot) {
        if(parkingLot.slotCount<slot){
            return false;
        }else if(parkingLot.slots.containsKey(slot)){
            return false;
        }else{
            parkingLot.slots.put(slot,numberPlate);
            this.slot=slot;
            return true;
        }
    }

    public int getSlot() {
        return slot;
    }
}
