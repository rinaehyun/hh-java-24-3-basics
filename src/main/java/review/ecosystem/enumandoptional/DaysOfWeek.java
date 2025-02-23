package review.ecosystem.enumandoptional;

public enum DaysOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public static String getDayType(DaysOfWeek day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                return day.name();
            case SATURDAY:
            case SUNDAY:
                return "Weekend";
            default:
                throw new IllegalArgumentException("Invalid day: " + day);
        }

    }
}
