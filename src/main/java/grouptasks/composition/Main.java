package grouptasks.composition;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Developer");
        System.out.println(p1.getSalary());
        System.out.println(p1.getRole());

        p1.setRole("Software Engineer");
        System.out.println(p1.getRole());
    }
}
