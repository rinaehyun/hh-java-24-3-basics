package tutorials.enums;

public class Main {
    public static void main(String[] args) {
        Appointment a1 = new Appointment("1", "java bootcamp", WeekDay.MONDAY);
        System.out.println(a1);
        System.out.println(a1.day());
        System.out.println(a1.day().getGerman());
        System.out.println(WeekDay.FRIDAY);

        if (a1.day() == WeekDay.MONDAY) {
            System.out.println("Termin ist an einem " + WeekDay.MONDAY.getGerman() + ".");
        } else {
            System.out.println("Check your calendar again, please.");
        }
    }
}
