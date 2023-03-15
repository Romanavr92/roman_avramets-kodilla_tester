public class Grades {
    int[] grades;
    int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }


    public void add(int value) {
        System.out.println(value);
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
        System.out.println(this.grades[this.size]);
        System.out.println(this.size);
    }

    public int getLastGrade(){
        return this.grades[this.size];
    }

    public double getAverage(){
        int sum = 0;
        for (int i = 0; i < this.grades.length; i++) {
            sum += this.grades[i];
        }

        return sum/this.grades.length;
    }
}