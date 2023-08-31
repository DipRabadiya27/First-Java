public class basic5 {
    public static void main(String[] args) {
        Holiday h1 = new Holiday("Holy",13,"April");
        Holiday h2 = new Holiday("Diwali",14,"Nov");
        Holiday h3 = new Holiday("Utt",14,"April");
        System.out.println(Holiday.inSamemonth(h1,h3));
        Holiday arrHoliday[] = {h1, h2, h3};
        System.out.println(Holiday.getAvg(arrHoliday));
    }
}

 class Holiday {
    private String name;
    private int day;
    private String month;

    Holiday(String name,int day,String month){
        this.name=name;
        this.day=day;  
        this.month=month;
    }

    public int getDay(){
        return day;
    }
    public String getMonth(){
        return month;
    }

    public static boolean inSamemonth(Holiday h1,Holiday h2){
        if((h1.getMonth()).equals(h2.getMonth())){
            return true;
        }
        return false;
    }

    public static double getAvg(Holiday[] arrHoliday) {
        int total = 0;
        for (int i = 0; i < arrHoliday.length; i++) {
            total = total + arrHoliday[i].day ;
        }
        return (double) total/arrHoliday.length;
    }
}