import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }

    public double calculateAverage() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        int sum = grades.stream().mapToInt(Integer::intValue).sum();
        return (double) sum / grades.size();
    }
}
