package tutorials.enums;

public enum WeekDay {
    MONDAY("Montag"),
    TUESDAY("Dienstag"),
    WEDNESDAY("Mittwoch"),
    THURSDAY("Donnerstag"),
    FRIDAY("Freitag"),
    SATURDAY("Samstag"),
    SUNDAY("Sonntag");

    private final String german;

    WeekDay(String german) {
        this.german = german;
    }

    public String getGerman() {
        return german;
    }
}
