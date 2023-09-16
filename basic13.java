public class basic13 {

	public static void main(String[] args) {
		SalarySlip[][] Total = new SalarySlip[4][12];
		//person1
		SalarySlip[] s1Array = new SalarySlip[12];
		s1Array[0] = new SalarySlip(1, "s1jan", 10, Month.Jan);
		s1Array[1] = new SalarySlip(1, "s1feb", 10, Month.Feb);
		s1Array[2] = new SalarySlip(1, "s1mar", 10, Month.Mar);
		s1Array[3] = new SalarySlip(1, "s1apr", 10, Month.Apr);
		s1Array[4] = new SalarySlip(1, "s1may", 10, Month.May);
		s1Array[5] = new SalarySlip(1, "s1jun", 10, Month.Jun);
		s1Array[6] = new SalarySlip(1, "s1jul", 10, Month.Jul);
		s1Array[7] = new SalarySlip(1, "s1aug", 10, Month.Aug);
		s1Array[8] = new SalarySlip(1, "s1sep", 10, Month.Sep);
		s1Array[9] = new SalarySlip(1, "s1oct", 10, Month.Oct);
		s1Array[10] = new SalarySlip(1, "s1nov", 10, Month.Nov);
		s1Array[11] = new SalarySlip(1, "s1dec", 10, Month.Dec);
		
		//person2
		SalarySlip[] s2Array = new SalarySlip[12];
		s2Array[0] = new SalarySlip(1, "s2jan", 30, Month.Jan);
		s2Array[1] = new SalarySlip(1, "s2feb", 10, Month.Feb);
		s2Array[2] = new SalarySlip(1, "s2mar", 10, Month.Mar);
		s2Array[3] = new SalarySlip(1, "s2apr", 10, Month.Apr);
		s2Array[4] = new SalarySlip(1, "s2may", 10, Month.May);
		s2Array[5] = new SalarySlip(1, "s2jun", 10, Month.Jun);
		s2Array[6] = new SalarySlip(1, "s2jul", 10, Month.Jul);
		s2Array[7] = new SalarySlip(1, "s2aug", 10, Month.Aug);
		s2Array[8] = new SalarySlip(1, "s2sep", 10, Month.Sep);
		s2Array[9] = new SalarySlip(1, "s2oct", 10, Month.Oct);
		s2Array[10] = new SalarySlip(1, "s2nov", 10, Month.Nov);
		s2Array[11] = new SalarySlip(1, "s2dec", 10, Month.Dec);

		//person3
		SalarySlip[] s3Array = new SalarySlip[12];
		s3Array[0] = new SalarySlip(1, "s3jan", 50, Month.Jan);
		s3Array[1] = new SalarySlip(1, "s3feb", 20, Month.Feb);
		s3Array[2] = new SalarySlip(1, "s3mar", 10, Month.Mar);
		s3Array[3] = new SalarySlip(1, "s3apr", 10, Month.Apr);
		s3Array[4] = new SalarySlip(1, "s3may", 10, Month.May);
		s3Array[5] = new SalarySlip(1, "s3jun", 10, Month.Jun);
		s3Array[6] = new SalarySlip(1, "s3jul", 10, Month.Jul);
		s3Array[7] = new SalarySlip(1, "s3aug", 10, Month.Aug);
		s3Array[8] = new SalarySlip(1, "s3sep", 10, Month.Sep);
		s3Array[9] = new SalarySlip(1, "s3oct", 10, Month.Oct);
		s3Array[10] = new SalarySlip(1, "s3nov", 10, Month.Nov);
		s3Array[11] = new SalarySlip(1, "s3dec", 10, Month.Dec);
		
		//person4
		SalarySlip[] s4Array = new SalarySlip[12];
		s4Array[0] = new SalarySlip(1, "s4jan", 5, Month.Jan);
		s4Array[1] = new SalarySlip(1, "s4feb", 30, Month.Feb);
		s4Array[2] = new SalarySlip(1, "s4mar", 10, Month.Mar);
		s4Array[3] = new SalarySlip(1, "s4apr", 10, Month.Apr);
		s4Array[4] = new SalarySlip(1, "s4may", 10, Month.May);
		s4Array[5] = new SalarySlip(1, "s4jun", 10, Month.Jun);
		s4Array[6] = new SalarySlip(1, "s4jul", 10, Month.Jul);
		s4Array[7] = new SalarySlip(1, "s4aug", 10, Month.Aug);
		s4Array[8] = new SalarySlip(1, "s4sep", 10, Month.Sep);
		s4Array[9] = new SalarySlip(1, "s4oct", 10, Month.Oct);
		s4Array[10] = new SalarySlip(1, "s4nov", 10, Month.Nov);
		s4Array[11] = new SalarySlip(1, "s4dec", 10, Month.Dec);
		
		Total[0] = s1Array;
		Total[1] = s2Array;
		Total[2] = s3Array;
		Total[3] = s4Array;
		
		SalarySlip.Max2(Total);

	}

}

enum Month{
    Jan,Feb,Mar,Apr,May,Jun,Jul,Aug,Sep,Oct,Nov,Dec
}

class SalarySlip {
	private int empId;
	private String name;
	private long salary;
	private Month month;
	
	public SalarySlip(int empId, String name, long salary, Month month) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.month = month;
	}
	
	public static void Print(long[] arr1,long[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i] +" "+arr2[i]);
		}
	}
	
	
	public static void Max2(SalarySlip[][] salary) {
		long[] Max1MonthWiseSalary = new long[12];
		long[] Max2MonthWiseSalary = new long[12];
		
		for (SalarySlip[] salarySlip : salary) {
			for (SalarySlip M : salarySlip) {
				if(M.month==Month.Jan) {
					if(M.salary>Max1MonthWiseSalary[0]) {
						Max2MonthWiseSalary[0] = Max1MonthWiseSalary[0]; 
						Max1MonthWiseSalary[0] = M.salary;
					}else if(M.salary<Max1MonthWiseSalary[0] && M.salary>Max2MonthWiseSalary[0]) {
						Max2MonthWiseSalary[0] = M.salary;
					}
				}else if(M.month==Month.Feb) {
					if(M.salary>Max1MonthWiseSalary[1]) {
						Max2MonthWiseSalary[1] = Max1MonthWiseSalary[1]; 
						Max1MonthWiseSalary[1] = M.salary;
					}else if(M.salary<Max1MonthWiseSalary[1] && M.salary>Max2MonthWiseSalary[1]) {
						Max2MonthWiseSalary[1] = M.salary;
					}
				}else if(M.month==Month.Mar) {
					if(M.salary>Max1MonthWiseSalary[2]) {
						Max2MonthWiseSalary[2] = Max1MonthWiseSalary[2]; 
						Max1MonthWiseSalary[2] = M.salary;
					}else if(M.salary<Max1MonthWiseSalary[2] && M.salary>Max2MonthWiseSalary[2]) {
						Max2MonthWiseSalary[2] = M.salary;
					}
				}else if(M.month==Month.Apr) {
					if(M.salary>Max1MonthWiseSalary[3]) {
						Max2MonthWiseSalary[3] = Max1MonthWiseSalary[3]; 
						Max1MonthWiseSalary[3] = M.salary;
					}else if(M.salary<Max1MonthWiseSalary[3] && M.salary>Max2MonthWiseSalary[3]) {
						Max2MonthWiseSalary[3] = M.salary;
					}
				}
				else if(M.month==Month.May) {
					if(M.salary>Max1MonthWiseSalary[4]) {
						Max2MonthWiseSalary[4] = Max1MonthWiseSalary[4]; 
						Max1MonthWiseSalary[4] = M.salary;
					}else if(M.salary<Max1MonthWiseSalary[4] && M.salary>Max2MonthWiseSalary[4]) {
						Max2MonthWiseSalary[4] = M.salary;
					}
				}
				else if(M.month==Month.Jun) {
					if(M.salary>Max1MonthWiseSalary[5]) {
						Max2MonthWiseSalary[5] = Max1MonthWiseSalary[5]; 
						Max1MonthWiseSalary[5] = M.salary;
					}else if(M.salary<Max1MonthWiseSalary[5] && M.salary>Max2MonthWiseSalary[5]) {
						Max2MonthWiseSalary[5] = M.salary;
					}
				}
				else if(M.month==Month.Jul) {
					if(M.salary>Max1MonthWiseSalary[6]) {
						Max2MonthWiseSalary[6] = Max1MonthWiseSalary[6]; 
						Max1MonthWiseSalary[6] = M.salary;
					}else if(M.salary<Max1MonthWiseSalary[6] && M.salary>Max2MonthWiseSalary[6]) {
						Max2MonthWiseSalary[6] = M.salary;
					}
				}
				else if(M.month==Month.Aug) {
					if(M.salary>Max1MonthWiseSalary[7]) {
						Max2MonthWiseSalary[7] = Max1MonthWiseSalary[7]; 
						Max1MonthWiseSalary[7] = M.salary;
					}else if(M.salary<Max1MonthWiseSalary[7] && M.salary>Max2MonthWiseSalary[7]) {
						Max2MonthWiseSalary[7] = M.salary;
					}
				}
				else if(M.month==Month.Sep) {
					if(M.salary>Max1MonthWiseSalary[8]) {
						Max2MonthWiseSalary[8] = Max1MonthWiseSalary[8]; 
						Max1MonthWiseSalary[8] = M.salary;
					}else if(M.salary<Max1MonthWiseSalary[8] && M.salary>Max2MonthWiseSalary[8]) {
						Max2MonthWiseSalary[8] = M.salary;
					}
				}else if(M.month==Month.Oct) {
					if(M.salary>Max1MonthWiseSalary[9]) {
						Max2MonthWiseSalary[9] = Max1MonthWiseSalary[9]; 
						Max1MonthWiseSalary[9] = M.salary;
					}else if(M.salary<Max1MonthWiseSalary[9] && M.salary>Max2MonthWiseSalary[9]) {
						Max2MonthWiseSalary[9] = M.salary;
					}
				}else if(M.month==Month.Nov) {
					if(M.salary>Max1MonthWiseSalary[10]) {
						Max2MonthWiseSalary[10] = Max1MonthWiseSalary[10]; 
						Max1MonthWiseSalary[10] = M.salary;
					}else if(M.salary<Max1MonthWiseSalary[10] && M.salary>Max2MonthWiseSalary[10]) {
						Max2MonthWiseSalary[10] = M.salary;
					}
				}else if(M.month==Month.Dec) {
					if(M.salary>Max1MonthWiseSalary[11]) {
						Max2MonthWiseSalary[11] = Max1MonthWiseSalary[11]; 
						Max1MonthWiseSalary[11] = M.salary;
					}else if(M.salary<Max1MonthWiseSalary[11] && M.salary>Max2MonthWiseSalary[11]) {
						Max2MonthWiseSalary[11] = M.salary;
					}
				}
			}
		}
		Print(Max1MonthWiseSalary,Max2MonthWiseSalary);
	}
		
}