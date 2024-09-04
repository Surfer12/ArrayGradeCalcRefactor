public class InputValidator {
    private static final int MIN_GRADE = 0;
    private static final int MAX_GRADE = 100;

    public static boolean isValidName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Error: Name cannot be empty.");
            return false;
        }
        if (!name.matches("^[a-zA-Z\\s]+$")) {
            System.out.println("Error: Name should only contain letters and spaces.");
            return false;
        }
        return true;
    }

    public static boolean isValidGrade(String input) {
        try {
            int grade = Integer.parseInt(input);
            return isValidScore(grade);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a numeric grade.");
            return false;
        }
    }

    public static boolean isValidScore(int score) {
        if (score < MIN_GRADE || score > MAX_GRADE) {
            System.out.println("Error: Grade must be between " + MIN_GRADE + " and " + MAX_GRADE + ".");
            return false;
        }
        return true;
    }

    public static boolean isValidStudentCount(String input) {
        try {
            int count = Integer.parseInt(input);
            if (count <= 0) {
                System.out.println("Error: Number of students must be positive.");
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a numeric value for student count.");
            return false;
        }
    }

    public static boolean isExitCommand(String input) {
        return input.equalsIgnoreCase("done") || input.equalsIgnoreCase("exit") || input.equals("-1");
    }
}