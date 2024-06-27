package tutorials;

public class IfMethod {

    // hier 'void': Rückgabe-Typ von einer Methode
    // 'main': Methode-Name
    public static void main(String[] args) {
        int myAge = 17;
        int yourAge = 31;

        // call a method ** in a main method **
        myMethod();

        //System.out.println(ageCheck(myAge));
        boolean isFullAge = ageCheck(myAge);
        System.out.println("The result is: " + isFullAge);
    }

    // parameter in Java doesn not have a default value -> 'int age'
    public static boolean ageCheck(int age) {
        System.out.println("Age: " + age);
        boolean result;

        if (age > 18) {
            System.out.println("Ja! Die Person ist volljährig!");
            result = true;
        } else if (age == 18) {
            System.out.println("Ja! Die Person ist genau 18 jahre alt!");
            result = true;
        } else {
            System.out.println("Nein! Die Person ist nicht volljährig!");
            result = false;
        }

        return result;
    }

    public static void myMethod() {
        System.out.println("My Method!");
    }
}
