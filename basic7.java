import java.util.Arrays;

public class basic7 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();

        s1.input("Dip", new int[]{99,96,56,82,54});
        s2.input("Abc", new int[]{45,54,65,49,82});
        s3.input("Xyz", new int[]{45,26,95,86,47});
        s4.input("Pqr", new int[]{95,86,74,85,62});
        s5.input("Stu", new int[]{96,48,95,64,49});

        Student.Show(s1);
        Student.Show(s2);
        Student.Show(s3);
        Student.Show(s4);
        Student.Show(s5);
        
        Student.TotalStudents();

        System.out.println("Total Mark : "+s1.TotalMarks());
        System.out.println("Total Mark : "+s2.TotalMarks());
        System.out.println("Total Mark : "+s3.TotalMarks());
        System.out.println("Total Mark : "+s4.TotalMarks());
        System.out.println("Total Mark : "+s5.TotalMarks());

        System.out.println("Highest Mark of Subject : " + s1.getHighest());
        System.out.println("Highest Mark of Subject : " + s2.getHighest());
        System.out.println("Highest Mark of Subject : " + s3.getHighest());
        System.out.println("Highest Mark of Subject : " + s4.getHighest());
        System.out.println("Highest Mark of Subject : " + s5.getHighest());

        System.out.println("Lowest Mark of Subject : "+s1.getLowest());
        System.out.println("Lowest Mark of Subject : "+s2.getLowest());
        System.out.println("Lowest Mark of Subject : "+s3.getLowest());
        System.out.println("Lowest Mark of Subject : "+s4.getLowest());
        System.out.println("Lowest Mark of Subject : "+s5.getLowest());

        System.out.println("average marks of student : "+s1.getAverage());
        System.out.println("average marks of student : "+s2.getAverage());
        System.out.println("average marks of student : "+s3.getAverage());
        System.out.println("average marks of student : "+s4.getAverage());
        System.out.println("average marks of student : "+s5.getAverage());

        System.out.println("A student is passed Subject : " + s1.getPassCount());
        System.out.println("A student is passed Subject : " + s2.getPassCount());
        System.out.println("A student is passed Subject : " + s3.getPassCount());
        System.out.println("A student is passed Subject : " + s4.getPassCount());
        System.out.println("A student is passed Subject : " + s5.getPassCount());
    }
}

class Student{
    private static int totalStudent=0;
    private static int unique=101;;
    private int rNo;
    private String name;
    private int[] marks;

    Student() {
        this.rNo=unique++;
        this.name="";
        this.marks=null;
        totalStudent++;
    }

    public void input(String name, int[] marks) {
        this.name = name;
        if (marks.length == 5) {
            this.marks = marks;
        } else {
            System.out.println("Note :" + this.name + ", Please Enter marks for all 5 subjects.");
        }
    }

    public static void Show(Student s){
        System.out.println("RollNo : "+s.rNo + ", Name : " + s.name + ", Marks : " + Arrays.toString(s.marks));
    }

    public static void TotalStudents() {
        System.out.println("Total Student: "+totalStudent);
    }

    public  int TotalMarks() {
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        return total;
    }

    public int getHighest(){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<marks.length;i++){
            if(max<marks[i]){
                max=marks[i];
            }
        }
        return max;
    }

    public int getLowest(){
        int min = Integer.MAX_VALUE;
        for(int i=0;i< marks.length;i++){
            min = Math.min(min,marks[i]);
        }
        return min;
    }

    public int getAverage(){
        return TotalMarks() / marks.length;
   }

   public  int getPassCount(){
        int count=0;
        for(int i=0;i<marks.length;i++){
            if(marks[i] >= 50) {
                count++;
            }
        }
        return count;
   }
}