package grouptasks.datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Pharmacy {
    // Fields
    Map<String, Medication> map = new HashMap<>();
    int count;

    // Constructors
    public Pharmacy() {}

    public Pharmacy(Map<String, Medication> map) {
        this.map = map;
    }

    public Pharmacy(Map<String, Medication> map, int count) {
        this.map = map;
        this.count = count;
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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy pharmacy = (Pharmacy) o;
        return count == pharmacy.count && Objects.equals(map, pharmacy.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map, count);
    }


    // Print
    @Override
    public String toString() {
        return "Pharmacy { " +
                "map = " + map +
                " }";
    }
}
