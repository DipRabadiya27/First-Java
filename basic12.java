public class basic12 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"A",jobTitle.HOD,100000);
        Employee e2 = new Employee(2,"B",jobTitle.Peon,30000);
        Employee e3 = new Employee(3,"C",jobTitle.Principal,1500000);
        Employee e4 = new Employee(4,"D",jobTitle.Prof,70000);
        Employee e5 = new Employee(5,"E",jobTitle.HOD,100000);
        Employee e6 = new Employee(6,"F",jobTitle.Peon,30000);
        Employee e7 = new Employee(7,"G",jobTitle.Prof,70000);
        Employee e8 = new Employee(8,"H",jobTitle.Prof,70000);
        Employee e9 = new Employee(9,"I",jobTitle.HOD,100000);
        Employee e10 = new Employee(10,"J",jobTitle.Peon,30000);

        Employee[] emp = {e1,e2,e3,e4,e5,e6,e7,e8,e9,e10};

        Employee.getTotalSatary(emp);

    }
}

enum jobTitle{
    Peon, Prof, HOD, Principal;
}

class Employee{
    public Employee(int empId, String name, jobTitle jobtitle, int salary) {
        this.empId=empId;
        this.name=name;
        this.jobtitle=jobtitle;
        this.salary=salary;
    }

    public static void getTotalSatary(Employee[] emp) {
        int sum1=0;
        int sum2=0;
        int sum3=0;
        int sum4=0;
        for(int i=0;i<emp.length;i++){
            if(emp[i].jobtitle.equals(jobTitle.Peon)) {
                sum1+=emp[i].salary;
            }else if(emp[i].jobtitle.equals(jobTitle.Prof)) {
                sum2+=emp[i].salary;
            }else if(emp[i].jobtitle.equals(jobTitle.HOD)) {
                sum3+=emp[i].salary;
            }else if(emp[i].jobtitle.equals(jobTitle.Principal)) {
                sum4+=emp[i].salary;
            }
        }
        System.out.println("Peon: " + sum1);
        System.out.println("Prof: " + sum2);
        System.out.println("HOD: " + sum3);
        System.out.println("Principal: " + sum4);
    }

    int empId;
    String name;
    jobTitle jobtitle;
    int salary;
}