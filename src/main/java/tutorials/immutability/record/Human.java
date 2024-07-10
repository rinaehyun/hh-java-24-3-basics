package tutorials.immutability.record;

// only 'private final' variables as parameters
public record Human(String name, int age, String birthday) {
    // Fields (not final, not private, only static !!!)
    private static int humanAge;
    public static final int LEGAL_AGE = 18;

    // Methods
    public void print() {
        System.out.println("Hello");
    }

    // Getters and Setters -> actually, do we need them?
    public static int getHumanAge() { return humanAge; }

    public static int getLegalAge() { return LEGAL_AGE; }

}
