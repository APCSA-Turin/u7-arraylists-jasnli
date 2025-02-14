import java.util.*;

public class UsedCarLot {
    // iv
    private ArrayList<Car> inventory;

    public UsedCarLot() {
        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public void addCar(Car c) {
        inventory.add(c);
    }

    public boolean swap(int i1, int i2) { 
        if (i1 >= inventory.size() || i2 >= inventory.size()) {
            return false;
        }
        if (i1 < 0 || i2 < 0) {
            return false;
        }
        Car temp = inventory.get(i1);
        inventory.set(i1, inventory.get(i2));
        inventory.set(i2, temp);
        return true;
    }
}
