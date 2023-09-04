import java.util.Arrays;

public class basic4 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "A", 40, 50, 60);
        // s1.setStudDetails(1, "A", 40, 50, 60);
        Student s2 = new Student(2, "B", 50, 60, 70);
        // s2.setStudDetails(2, "B", 50, 60, 70);
        Student s3 = new Student(3, "C", 60, 70, 80);
        // s3.setStudDetails(3, "C", 60, 70, 80);
        Student s4 = new Student(4, "D", 70, 80, 90);
        // s4.setStudDetails(4, "D", 70, 80, 90);
        Student s5 = new Student(5, "E", 30, 40, 50);
        // s5.setStudDetails(5, "E", 30, 40, 50);
        // s1.calcualatePer();
        // s2.calcualatePer();
        // s3.calcualatePer();
        // s4.calcualatePer();
        // s5.calcualatePer();
        Student stud[]= {s1,s2,s3,s4,s5};
        Student.getTop3Student(stud);
        int[] arr={1,2,3,4,5};
    }
}

class Student {
    int rollNum;
    String studName;
    int mark1;
    int mark2;
    int mark3;
    double Perc;

    Student(int rollNum, String studName, int mark1, int mark2, int mark3) {
        this.rollNum = rollNum;
        this.studName = studName;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.Perc=(mark1+mark2+mark3)/3;

    }

    public double Per() {
        return Perc;
    }

    public static void getTop3Student(Student stud[]) {
        for (int i = 0; i < stud.length; i++) {
            for (int j = 0; j < stud.length-1; j++) {
                if (stud[j].Perc < stud[j + 1].Perc) {
                    Student temp = stud[j];
                    stud[j] = stud[j + 1];
                    stud[j + 1] = temp;
                }
            }
        }

        Student max1 = stud[0];
        Student max2 = stud[1];
        Student max3 = stud[2];

        System.out.println(max1.Perc + " " + max1.studName);
        System.out.println(max2.Perc + " " + max2.studName);
        System.out.println(max3.Perc + " " + max3.studName);
    }
}