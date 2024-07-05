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
        countWithInstance.incrementInstanceCount();
        System.out.println(countWithInstance);
    }
}
