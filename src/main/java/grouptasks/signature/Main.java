package grouptasks.signature;

public class Main {
    public static void main(String[] args) {

        // Test a static method
        System.out.println(Count.incrementTotalCount());

        // Test an instance method
        Count countWithInstance = new Count();
        System.out.println(countWithInstance.incrementInstanceCount());

        // Print the current values of totalCount and instanceCount
        Count.incrementTotalCount();
        System.out.println(Count.totalCount);
        Count.totalCount = 300;

        Count count = new Count(10);
        count.setInstanceCount(count.getInstanceCount() + 5);
        count.incrementInstanceCount();
        System.out.println(count);
    }
}
