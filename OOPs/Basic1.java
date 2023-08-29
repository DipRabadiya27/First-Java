package OOPs;

class Student {
    int rollNum;
    String studName;
    int mark1;
    int mark2;
    int mark3;
    int totalMarks;

    Student(int rollNum, String studName, int mark1, int mark2, int mark3) {
        this.rollNum = rollNum;
        this.studName = studName;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public void calcualateTotal(){
        this.totalMarks = (this.mark1 + this.mark2 + this.mark3);
    }

    public void displayStudDeatails(){
        System.out.println("rollNum"+ rollNum + "\nstudName"+ studName + "\nTotalMarks"+ totalMarks);
    }
}

class Basic1{
    public static void main(String[] args) {
        Student s1 = new Student(1,"Dip",40,50,60);
        // s1.calcualateTotal();
        s1.displayStudDeatails();
    }
}
