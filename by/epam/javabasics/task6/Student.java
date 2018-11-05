package by.epam.javabasics.task6;

public class Student {

    private int[] marks;
    private String name;

    public Student(int[] marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    public static double avgMark(Student student) {
        double result;
        double sum = 0;
        for (int i = 0; i < student.getMarks().length; i++) {
            sum += student.getMarks()[i];
        }
        result = sum / student.getMarks().length;
        return result;
    }

    public static void bestStudentsQTY(Group group) {

        // предположим, что отличник имеет средний балл 4.5 и выше
        double bestMark = 4.5;
        double[] avgMarks = new double[group.getStudents().size()];
        for (int i = 0; i < avgMarks.length; i++) {
            avgMarks[i] = avgMark(group.getStudents().get(i));
        }

        int bestStudents = 0;

        for (int i = 0; i < avgMarks.length; i++) {
            if (avgMarks[i] >= bestMark) {
                bestStudents++;
            }
        }

        System.out.println("There are " + bestStudents + " students with average mark of " + bestMark + " or higher");
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
