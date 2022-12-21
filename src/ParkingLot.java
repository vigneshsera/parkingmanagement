import org.json.JSONObject;

import java.util.HashMap;

public class ParkingLot {
    long slotWidth = 8;
    long slotLength = 12;
    long width;
    long length;
    long slotCount;

    HashMap slots = new HashMap();
    public ParkingLot(long width, long length) {
        this.width = width;
        this.length = length;
        long count1 = width / slotWidth * length / slotLength;
        long count2 = length / slotWidth * width / slotLength;
        this.slotCount = count1 > count2 ? count1 : count2;
    }

    public long getSlotsCount() {
        return slotCount;
    }

    public JSONObject getAllCarDetails() {
        return new JSONObject(slots);
    }
}
