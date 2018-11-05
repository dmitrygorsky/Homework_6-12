package by.epam.javabasics.task6;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private List<Student> students;

    public Group(List<Student> students) {
        this.students = students;
    }

    public static void printStudentAvgMark(Group group) {

        for (Student student : group.getStudents()) {
            System.out.println(student.getName() + "'s average mark is " + Student.avgMark(student));
        }

    }

    public static double avgGroupMark(Group group) {
        double result;
        double sum = 0;
        List<Double> avgGroupMarks = new ArrayList<>();
        for (Student student : group.getStudents()) {
            avgGroupMarks.add(Student.avgMark(student));
        }
        for (Double d : avgGroupMarks) {
            sum += d;
        }
        result = sum / avgGroupMarks.size();
        return result;
    }

    public static void studentsWithLowMarks(Group group) {

        // по условию низкая оценка - это 2
        double lowMark = 2.0;
        int lowMarksQTY = 0;
        for (Student student : group.getStudents()) {
            for (int i = 0; i < student.getMarks().length; i++) {
                if (student.getMarks()[i] == lowMark) {
                    lowMarksQTY++;
                }
            }
        }
        System.out.println("There are " + lowMarksQTY + " students that have the mark of " + String.format("%.0f", lowMark) + " for at least one exam");
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
