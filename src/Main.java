public class Main {
    public static void main(String[] args) {
        GradeBook gradeBook = new GradeBook();
        InputReaders.readStudentData(gradeBook);
        DisplayResults.showResults(gradeBook);
    }
}
