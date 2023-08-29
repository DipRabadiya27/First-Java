class Student {
    int rollNum;
    String studName;
    int mark1;
    int mark2;
    int mark3;
    int totalMarks;

    public void setStudDetails(int rollNum, String studName, int mark1, int mark2, int mark3) {
        this.rollNum = rollNum;
        this.studName = studName;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;

    }

    public void calcualateTotal(){
        totalMarks = (mark1 + mark2 + mark3);
    }

    public void displayStudDeatails(){
        System.out.println("rollNum: "+ rollNum + "\nstudName: "+ studName + "\nTotalMarks: "+ totalMarks);
    }
}

public class basic1{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudDetails(1,"Dip",40,50,60);
        s1.calcualateTotal();
        s1.displayStudDeatails();
        Student s2 = new Student();
        s2.setStudDetails(2,"Dp",48,59,68);
        s2.calcualateTotal();
        s2.displayStudDeatails();
    }
}