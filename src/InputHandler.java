import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputHandler {
    private Scanner scanner;

    public InputHandler() {
        scanner = new Scanner(System.in);
    }

    public List<Student> getStudentData() {
        List<Student> students = new ArrayList<>();
        while (true) {
            System.out.print("Enter student name (or 'done' to finish): ");
            String name = scanner.nextLine();
            if (InputValidator.isExitCommand(name)) {
                break;
            }
            if (InputValidator.isValidName(name)) {
                Student student = new Student(name);
                getStudentGrades(student);
                students.add(student);
            }
        }
        return students;
    }

    private void getStudentGrades(Student student) {
        System.out.println("Enter grades for " + student.getName() + " (-1 to finish):");
        while (true) {
            System.out.print("Grade: ");
            String input = scanner.nextLine();
            if (InputValidator.isExitCommand(input)) {
                break;
            }
            try {
                int grade = Integer.parseInt(input);
                if (InputValidator.isValidScore(grade)) {
                    student.addGrade(grade);
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter a numeric grade.");
            }
        }
    }
}