import java.util.Arrays;
import java.util.Scanner;

public class basic7 {
    public static void main(String[] args) {
        Student8 s1 = new Student8();
        Student8 s2 = new Student8();
        s1.Show();
        s1.input();
        s2.input();

        s1.Show();
        s2.Show();
        
        Student8.TotalStudents();

        System.out.println("Total Mark : "+s1.TotalMarks());
        System.out.println("Total Mark : "+s2.TotalMarks());

        System.out.println("Highest Mark of Subject : " + s1.getHighest());
        System.out.println("Highest Mark of Subject : " + s2.getHighest());

        System.out.println("Lowest Mark of Subject : "+s1.getLowest());
        System.out.println("Lowest Mark of Subject : "+s2.getLowest());

        System.out.println("average marks of student : "+s1.getAverage());
        System.out.println("average marks of student : "+s2.getAverage());

        System.out.println("A student is passed Subject : " + s1.getPassCount());
        System.out.println("A student is passed Subject : " + s2.getPassCount());
    }
}

class Student8{
    private static int unique;
    private int rNo;
    private String name;
    private int[] marks=new int[5];

    public Student8() {
        Student8.unique += 1;
        this.rNo=Student8.unique;
        this.name=null;
        this.marks=marks;
    }

    public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name");
		this.name = sc.next();
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Enter marks of subject "+(i+1));	
			this.marks[i]=sc.nextInt();
		}
	}

    public void Show(){
        System.out.println("Details of student");
        System.out.println("RollNo : "+ this.rNo + ", \nName : " + this.name + ", \nMarks : " + Arrays.toString(this.marks));
    }

    public static void TotalStudents() {
        System.out.println("Total Student: " + Student8.unique);
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
            if(max<this.marks[i]){
                max=this.marks[i];
            }
        }
        return max;
    }

    public int getLowest(){
        int min = Integer.MAX_VALUE;
        for(int i=0;i< marks.length;i++){
            if(min>this.marks[i]){
                min=this.marks[i];
            }
        }
        return min;
    }

    public int getAverage(){
        return TotalMarks() / marks.length;
   }

   public  int getPassCount(){
        int count=0;
        for(int i=0;i<this.marks.length;i++){
            if(this.marks[i] >= 50) {
                count++;
            }
        }
        return count;
   }
}