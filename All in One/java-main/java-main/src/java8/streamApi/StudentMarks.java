package java8.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StudentMarks {
    String name;
    String subject;
    int marks;

    public StudentMarks(String name, String subject, int marks) {
        this.name = name;
        this.subject = subject;
        this.marks = marks;
    }

    public static void main(String[] args) {
        StudentMarks studentMarks1 = new StudentMarks("Pankaj", "hindi", 34);
        StudentMarks studentMarks2 = new StudentMarks("Allu", "hindi", 34);
        StudentMarks studentMarks3 = new StudentMarks("Dhaval", "hindi", 35);
        StudentMarks studentMarks4 = new StudentMarks("Mayur", "hindi", 35);

        List<StudentMarks> list = new ArrayList<>();
        list.add(studentMarks1);
        list.add(studentMarks2);
        list.add(studentMarks3);
        list.add(studentMarks4);

        list.stream()
                .filter(p -> p.marks == 34)
                .map(m -> m.marks + 1)
                .forEach(System.out::println);
    }

}
