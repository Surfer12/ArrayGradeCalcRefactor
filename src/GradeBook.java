import java.util.ArrayList;
import java.util.List;

public class GradeBook {
    private List<Student> students;

    public GradeBook() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public double calculateClassAverage() {
        if (students.isEmpty()) {
            return 0.0;
        }
        double sum = students.stream().mapToDouble(Student::calculateAverage).sum();
        return sum / students.size();
    }
}
