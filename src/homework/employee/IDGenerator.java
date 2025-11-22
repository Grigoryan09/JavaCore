package homework.employee;

public class IDGenerator {

    private static int counter = 1;

    public static String generateID() {
        return String.format("A%04d", counter++);
    }
}
