public class basic13 {
    public static void main(String[] args) {
        SalarySlip s1 = new SalarySlip(1,"name",1000,2000,3000,4000,5000,6000,7000,8000,9000,10000,11000,12000);
        SalarySlip s2 = new SalarySlip(2,"B",2000,11000,10000,9000,8000,7000,6000,5000,4000,3000,2000,1000);
        SalarySlip s3 = new SalarySlip(3,"C",3000,11000,10000,9000,8000,7000,6000,5000,4000,3000,2000,1000);
        // SalarySlip s4 = new SalarySlip(4,"C",1000,11000,10000,9000,8000,7000,6000,5000,4000,3000,2000,1000);
        // SalarySlip s5 = new SalarySlip(5,"C",1000,11000,10000,9000,8000,7000,6000,5000,4000,3000,2000,1000);
        // SalarySlip s6 = new SalarySlip(6,"C",1000,11000,10000,9000,8000,7000,6000,5000,4000,3000,2000,1000);
        // SalarySlip s7 = new SalarySlip(7,"C",1000,11000,10000,9000,8000,7000,6000,5000,4000,3000,2000,1000);
        // SalarySlip s8 = new SalarySlip(8,"C",1000,11000,10000,9000,8000,7000,6000,5000,4000,3000,2000,1000);
        // SalarySlip s9 = new SalarySlip(9,"C",12000,11000,10000,9000,8000,7000,6000,5000,4000,3000,2000,1000);
        // SalarySlip s10 = new SalarySlip(10,"C",1000,11000,10000,9000,8000,7000,6000,5000,4000,3000,2000,1000);
        SalarySlip salary[] = {s1,s2,s3};
        SalarySlip.getHigh(salary);
    }
}

class Months{
    int January, February, March, April, May, June, July, August, September, October, November, December;
    Months(int january,int february,int march,int april,int may,int june,int july,int august,int september,int october,int november,int december){
        this.January=january;
        this.February=february;
        this.March=march;
        this.April=april;
        this.May=may;
        this.June=june;
        this.July=july;
        this.August=august;
        this.September=september;
        this.October=october;
        this.November=november;
        this.December=december;
    }
}
class SalarySlip extends Months{
    int empId;
    String name;
    SalarySlip(int empId,String name,int january,int february,int march,int april,int may,int june,int july,int august,int september,int october,int november,int december){
        super(january, february, march, april, may, june, july, august, september, october, november, december);
        this.empId=empId;
        this.name=name;
    }

    public static void getHigh(SalarySlip[] salary) {
        int max1=0;
        int max2=0;
        for(int i=0;i<salary.length;i++){
            if(max1<salary[i].January){
                max2=max1;
                max1=salary[i].empId;
            } else if(max2<salary[i].January){
                max2=salary[i].empId;
            }
        }
        System.out.println("Jan: " + max1 +" " + max2);
    }
}