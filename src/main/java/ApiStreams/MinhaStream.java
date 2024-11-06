package ApiStreams;

import java.util.Collection;
import java.util.List;
import java.util.Set;

class Student {
    private String name;
    private String course;

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
    };

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }
}

public class MinhaStream {
    public static Collection<Student> generateStudents() {
        return Set.of(
                new Student("Maria", "fisica"),
                new Student("Joao", "matematica")
        );
    }

    public static void main(String[] args) {
        Collection<Student> students = generateStudents();
        List<String> courses = students.stream()
                .filter(student -> "Maria".equals(student.getName()))
                .map(Student::getCourse)
                .toList();
    }
}
