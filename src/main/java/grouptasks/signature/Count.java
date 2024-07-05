package grouptasks.signature;

import java.util.Objects;

public class Count {
    // Fields
    public static int totalCount = 0;
    private int instanceCount = 0;

    // Constructors
    public Count() {
    }

    public Count(int instanceCount) {
        this.instanceCount = instanceCount;
    }

    // Methods
    public static int incrementTotalCount() {
        return totalCount += 1;
    }

    public int incrementInstanceCount() {
        return instanceCount += 1;
    }

    // Getters and Setters
    public int getInstanceCount() {
        return instanceCount;
    }

    public void setInstanceCount(int instanceCount) {
        this.instanceCount = instanceCount;
    }

    // Comparisons
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Count count = (Count) o;
        return instanceCount == count.instanceCount;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(instanceCount);
    }

    // Print
    @Override
    public String toString() {
        return "Count{ " +
                "instanceCount = " + instanceCount +
                ", totalCount = " + totalCount +
                " }";
    }
}
