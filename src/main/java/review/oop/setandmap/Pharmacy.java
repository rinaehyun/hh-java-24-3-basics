package review.oop.setandmap;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    // Fields
    Map<String, Medication> medicationMap;

    // Constructors
    public Pharmacy() {
        this.medicationMap = new HashMap<>();
    }

    public Pharmacy(Map<String, Medication> medicationMap) {
        this.medicationMap = new HashMap<>(medicationMap);
    }

    // Print
    @Override
    public String toString() {
        return "Pharmacy{" +
                "medicationMap=" + medicationMap +
                '}';
    }

    // Methods
    public int getCount() {
        return medicationMap.size();
    }

    public void save(Medication medication) {
        medicationMap.put(medication.name, medication);
    }

    public Medication find(String medicationName) {
        if (medicationMap.containsKey(medicationName)) {
            return medicationMap.get(medicationName);
        }
            return null;
    }

    public void delete(String medicationName) {
        medicationMap.remove(medicationName);
    }
}
