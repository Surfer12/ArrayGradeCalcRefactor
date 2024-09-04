public class DisplayResults {
    public static void showResults(GradeBook gradeBook) {
        System.out.println("------------------------------");
        System.out.println("| Student | Grades | Avg | Grade |");
        System.out.println("------------------------------");

        for (Student student : gradeBook.getStudents()) {
            System.out.printf("| %-8s | %-6s | %.2f | %-5c |\n",
                    student.getName(),
                    student.getGrades().toString(),
                    student.calculateAverage(),
                    GradeCalculator.determineFinalGrade(student.calculateAverage()));
        }

        System.out.println("------------------------------");
        System.out.printf("Class Average: %.2f\n", gradeBook.calculateClassAverage());
    }
}
