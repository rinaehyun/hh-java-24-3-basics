package practices.composition;

public class Person {
    // Compasition: has - a relationship
    private Job job;

    public Person(String role) {
        this.job = new Job();
        job.setRole(role);
        job.setSalary(1000L);
    }

    public long getSalary() { return job.getSalary(); }

    public String getRole() { return job.getRole(); }

    public void setRole(String role) {
        job.setRole(role);
    }
}
