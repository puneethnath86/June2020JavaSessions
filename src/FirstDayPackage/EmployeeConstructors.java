package FirstDayPackage;

public class EmployeeConstructors {

	int empID;
	String name;
	String deisgnation;
	double sal;
	int age;
	boolean fullTime;
	
	public static void main(String[] args) {
		EmployeeConstructors e1=new EmployeeConstructors(10,"Saanvi", "consultant",10.12,12,true);
		System.out.println(e1.empID+" "+e1.age);
	}

	public EmployeeConstructors(int empID, String name, String deisgnation, double sal, int age, boolean fullTime) {
		this.empID = empID;
		this.name = name;
		this.deisgnation = deisgnation;
		this.sal = sal;
		this.age = age;
		this.fullTime = fullTime;
	}

}
