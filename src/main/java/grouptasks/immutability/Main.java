package grouptasks.immutability;

public class Main {
    public static void main(String[] args) {
        Species speciesRecord = new Species("animal", 1500);

        Animal animalDog = new Animal(12478, "XX", "Dog", 5,
                new Owner("ABCD", 30, "Stuttgart"), speciesRecord);
        Animal animalCat = new Animal(3874, "LL", "Cat", 3,
                new Owner("CDEF", 28, "Hamburg"), speciesRecord);
        Animal animalTiger = new Animal(99872, "TT", "Tiger", 8,
                new Owner("IEJ", 36, "Berlin"), speciesRecord);
        Animal animalLion = new Animal(2234, "AA", "Lion", 10,
                new Owner("KSE", 34, "Frankfurt"), speciesRecord);
        Animal animalLion2 = new Animal(2234, "AA", "Lion", 10,
                new Owner("KSE", 34, "Frankfurt"), speciesRecord);

/*
        // Check if methods are automatically generated
        System.out.println(animalDog.id());
        System.out.println(animalCat.name());

        System.out.println(animalLion.equals(animalLion2));

        System.out.println(animalLion.hashCode());
        System.out.println(animalLion2.hashCode());

        System.out.println(animalTiger);
*/

        // Add Owner Record as a field of another Record
        System.out.println(" *** with Owner Record *** ");
        System.out.println(animalDog);
        System.out.println(animalDog.owner());

        System.out.println(animalDog.owner().address());
        System.out.println(animalLion.owner().equals(animalLion2.owner()));


        // Add Species Record
        System.out.println(" *** with Species Record *** ");
        System.out.println(animalDog);
        System.out.println(animalDog.speciesRecord());
        System.out.println(animalDog.speciesRecord().foodInGram());

        System.out.println(animalDog.speciesRecord().equals(animalCat.speciesRecord()));
    }
}
