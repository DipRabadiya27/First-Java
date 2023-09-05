import java.util.Arrays;
import java.util.Scanner;

public class basic7{
    public static void main(String[] args) {
        Student10 s1=new Student10();
        s1.Show();
        s1.Input();
        Student10.TotalStudent();
        System.out.println("Total marks: " + s1.TotalMarks());
        System.out.println("Get Max: " + s1.getHighest());
        System.out.println("Get Min: " + s1.getLowest());
        System.out.println("Get Avg: " + s1.getAverage());
        System.out.println("Get pass count: " + s1.getPassCount());
    }
}

class Student10{
    private static int unique;
    private String name;
    private int rNo;
    private int[] marks=new int[5];

    Student10(){
        this.name="";
        this.rNo=unique += 1;
        this.marks=marks;
    }

    public void Show(){
        System.out.println("rNO: " + this.rNo + "\nname: " + this.name + "\nmarks: " + Arrays.toString(marks));
    }

    public static void TotalStudent(){
        System.out.println("TotalStudent: " + unique);
    }

    public int TotalMarks(){
        int sum=0;
        for(int i=0;i<this.marks.length;i++){
            sum+=marks[i];
        }
        return sum;
    }

    public void Input(){
        Scanner sc = new Scanner (System.in );
        System.out.print("\nEnter the student's Name:");
        this.name=sc.nextLine();
        for(int i=0;i<this.marks.length;i++){
            System.out.print("subject " + (i+1) + ": ");
            this.marks[i]=sc.nextInt();
        }
    }

    public int getHighest(){
        int max=0;
        for(int i=0;i<marks.length;i++){
            if(max<marks[i]){
                max=marks[i];
            }
        }
        return max;
    }

    public int getLowest(){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<marks.length;i++){
            if(min>marks[i]){
                min=marks[i];
            }
        }
        return min;
    }

    public int getAverage(){
        return TotalMarks()/marks.length;
    }

    public int getPassCount(){
        int count=0;
        for(int i=0;i<marks.length;i++){
            if(50<=marks[i]){
                count++;
            }
        }
        return count;
    }

}
