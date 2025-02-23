package review.oop.staticandinstance;

public class StaticInstance {
    // Fields
    static int totalCount = 0;
    int instanceCount = 0;

    // Constructors
    public StaticInstance() {}

    // Print
    @Override
    public String toString() {
        return "StaticInstance{" +
                "instanceCount=" + instanceCount + ", " +
                "totalCount=" + totalCount +
                '}';
    }

    // Methods
    static int incrementTotalCount() {
        return totalCount++;
    }

    int incrementInstanceCount() {
        return instanceCount++;
    }
}
