package by.epam.javabasics.task6;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student Vasya = new Student(new int[]{2, 5, 5, 4}, "Vasya");
        Student Petya = new Student(new int[]{5, 4, 4, 4}, "Petya");
        Student Lesha = new Student(new int[]{3, 3, 2, 4}, "Lesha");
        Student Masha = new Student(new int[]{4, 5, 5, 5}, "Masha");
        Student Katya = new Student(new int[]{5, 5, 5, 5}, "Katya");

        students.add(Vasya);
        students.add(Petya);
        students.add(Lesha);
        students.add(Masha);
        students.add(Katya);

        Group group = new Group(students);

        Group.printStudentAvgMark(group);
        System.out.println("----------------------------------------");
        Student.bestStudentsQTY(group);
        System.out.println("----------------------------------------");
        Group.studentsWithLowMarks(group);
        System.out.println("----------------------------------------");
        System.out.println("Average group mark is " + Group.avgGroupMark(group));
    }
}
