package review.oop.setandmap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Medication medication1 = new Medication("Ferro Sanol", 5.99, true);
        Medication medication2 = new Medication("Medicine2", 10.99, false);
        Medication medication3 = new Medication("Medicine3", 20.5, true);

        Map<String, Medication> medicationMap = new HashMap<>();
        medicationMap.put(medication1.name, medication1);
        medicationMap.put(medication2.name, medication2);

        Pharmacy pharmacy1 = new Pharmacy(medicationMap);

        System.out.println(pharmacy1);


        // getCount() method
        System.out.println(pharmacy1.getCount());

        // save() method
        pharmacy1.save(medication3);
        System.out.println(pharmacy1);

        // find() method
        System.out.println(pharmacy1.find("Medicine2"));

        // delete() method
        pharmacy1.delete("Medicine2");
        System.out.println(pharmacy1);
    }
}
