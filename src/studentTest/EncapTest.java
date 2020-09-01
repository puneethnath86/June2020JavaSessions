package studentTest;

public class EncapTest {
	public static void main(String[] args) 
	{
		StudentData stu1=new StudentData();
		stu1.setStdId(101);
		stu1.setStdRollNo(11);
		stu1.setStdName("Jitesh Kothari");
		
		System.out.println("Student Name is -> "+stu1.getStdName()+" RollNum is-> "
		+stu1.getStdRollNo()+" and student ID is-> "+stu1.getStdId());
		
		StudentData stu2=new StudentData();
		stu2.setStdId(102);
		stu2.setStdRollNo(22);
		stu2.setStdName("Nimith Kanabar");
		
		System.out.println("Student Name is -> "+stu2.getStdName()+" RollNum is-> "
		+stu2.getStdRollNo()+" and student ID is-> "+stu2.getStdId());
		
		StudentData stu3=new StudentData();
		stu3.setStdId(103);
		stu3.setStdRollNo(38);
		stu3.setStdName("Puneeth Nath");
		
		System.out.println("Student Name is -> "+stu3.getStdName()+" RollNum is-> "
		+stu3.getStdRollNo()+" and student ID is-> "+stu3.getStdId());
	}
}
