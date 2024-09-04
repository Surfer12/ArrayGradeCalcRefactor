import java.util.Scanner;

public class InputReaders {
    private static final Scanner scanner = new Scanner(System.in);

    public static void readStudentData(GradeBook gradeBook) {
        while (true) {
            System.out.print("Enter student name (or 'done' to finish): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }
            Student student = new Student(name);
            readStudentGrades(student);
            gradeBook.addStudent(student);
        }
    }

    private static void readStudentGrades(Student student) {
        while (true) {
            System.out.print("Enter grade for " + student.getName() + " (or -1 to finish): ");
            int grade = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            if (grade == -1) {
                break;
            }
            if (InputValidator.isValidScore(String.valueOf(grade))) {
                student.addGrade(grade);
            } else {
                System.out.println("Invalid grade. Please try again.");
            }
        }
    }
}
