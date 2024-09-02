package Custom_Exception;

public class CustomExceptionTest1 {

    public static void main(String[] args) throws AgeLessthanZeroException {

        validateVoteAge(9);
        validateAge(-5);

    }

    public static void validateAge(int age) throws AgeLessthanZeroException {
        if (age < 0) {
            throw new AgeLessthanZeroException();
        } else {
            System.out.println("no exception found");
        }
    }

    public static void validateVoteAge(int age) throws AgeLessthanZeroException {
        if (age < 18) {
            // using parameter in custom exception
            throw new AgeLessthanZeroException("Something went wrong!");
        } else {
            System.out.println("allowed to vote");
        }
    }
}
