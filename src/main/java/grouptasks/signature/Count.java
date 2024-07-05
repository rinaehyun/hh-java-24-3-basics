package grouptasks.signature;

public class Count {
    // Fields
    public static int totalCount = 0;
    private int instanceCount = 0;

    // Methods
    public static int incrementTotalCount() {
        return totalCount += 1;
    }

    public int incrementInstanceCount() {
        return instanceCount += 1;
    }

    @Override
    public String toString() {
        return "Count{ " +
                "instanceCount = " + instanceCount +
                ", totalCount = " + totalCount +
                " }";
    }
}
