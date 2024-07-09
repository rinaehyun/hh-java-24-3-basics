package tutorials.immutability.record;

public record Human(String name, int age, String birthday) {

    // Fields (not final, not private, only static !!!)
    public static int humanAge;
    public static final int LEGAL_AGE = 18;

    // Methods
    public void print() {
        System.out.println("Hello");
    }

    // Getters and Setters -> actually, do we need them?
    public int getHumanAge() { return humanAge; }

    public int getLegalAge() { return LEGAL_AGE; }
}
