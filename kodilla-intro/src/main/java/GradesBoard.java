public class GradesBoard {
    public static void main(String[] args) {
        Grades grades = new Grades();

        grades.getAverage();
        grades.add(5);
        grades.add(3);
        grades.getAverage();
        System.out.println(grades.getAverage());

        System.out.println(grades.getLastGrade());

    }
}
