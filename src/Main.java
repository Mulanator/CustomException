public class Main {
    public static void main(String[] args) throws AgeLessZeroException {
        //validateAge(-3);
        validateAge(3);
    }

    private static void validateAge(int age) throws AgeLessZeroException {
        if (age <= 0) {
            throw new AgeLessZeroException("Alter ungültig.");
        }

        if (age == 3) {
            throw new AgeLessZeroException(new RuntimeException());
        }
    }
}