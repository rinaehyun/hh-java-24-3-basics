package review.ecosystem.enumandoptional;

public record Person(
        String id,
        String name,
        DaysOfWeek favoriteDay,
        Gender gender
) {
}
