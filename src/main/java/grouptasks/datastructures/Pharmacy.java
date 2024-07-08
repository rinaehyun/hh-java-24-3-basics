package grouptasks.datastructures;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    // Fields
    Map<String, Medication> map = new HashMap<>();
    int count;

    // Constructors
    public Pharmacy() {}

    public Pharmacy(Map<String, Medication> map) {
        this.map = map;
        //this.count = count;
    }

    // Methods
    public void save(Medication medication) {
        map.put(medication.getName(), medication);
    }

    public Medication find(String name) {
        if (map.containsKey(name)) {
            return map.get(name);
        }
        return null;
    }

    public void delete(String name) {
        map.remove(name);
    }


    // Getters and Setters
    public int getCount() { return count; }

    // Comparisons

    // Print

    @Override
    public String toString() {
        return "Pharmacy { " +
                "map = " + map +
                " }";
    }
}
