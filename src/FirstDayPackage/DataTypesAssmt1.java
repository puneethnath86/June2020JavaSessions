package FirstDayPackage;

import java.util.Scanner;

public class DataTypesAssmt1 {

	public static void main(String[] args) {

		dataType();
		sum();
		div();
		operations();
		compute();
		concat();
		totalAmt();
		bytes();
		greatest();
		numTest(-11);	//35
		
		
	}
//	1. Print your name on console
	public static void dataType() {
		String name="Puneeth Nath";
		System.out.println("Hello");
		System.out.println(name);
		System.out.println("----End of prog----");
		System.out.println();
	}
	
//	2. print sum of 2 nos
	public static void sum() {
		int num1=74;
		int num2=36;
		System.out.println("Sum is -->"+(num1+num2));
		System.out.println("----End of prog----");
		System.out.println();
	}
	
//	3. Division of 2 nos.
	public static void div() {
		int num1=50;
		int num2=3;
		System.out.println("Division is--> "+(num1/num2));
		System.out.println("----End of prog----");
		System.out.println();
	}
	
//	4. Write a Java program to print the result of the following operations. Change your test data accordingly.
	public static void operations() 
	{
		int num1=-5;
		int num2=8;
		int num3=6;
		int op1=num1+num2*num3;
		System.out.println("The output is -->"+op1);
		
		int num4=55;
		int num5=9;
		int num6=9;
		int op2=(num4+num5)%num6;
		System.out.println("The output is -->"+op2);
		
		int num7=20;
		int num8=-3;
		int num9=5;
		int num10=8;
		int op3=num7+num8*num9/num10;
		System.out.println("The output is -->"+op3);
		
		int num11=5;
		int num12=15;
		int num13=3;
		int num14=2;
		int num15=8;
		int num16=3;
		int op4=num11+num12/num13*num14-num15%num16;
		System.out.println("The output is -->"+op4);
		System.out.println("----End of prog----");
		System.out.println();
	}
	
//	5. Write a Java program to compute the specified expressions and print the output. Go to the editor
	public static void compute() {
		double d1=25.5;
		double d2=3.5;
		double d3=40.5;
		double d4=4.5;
		double res=((d1*d2-d2*d2)/(d3-d4));
		System.out.println("The result is -->"+res);
		System.out.println("----End of prog----");
		System.out.println();
		System.out.println("----End of prog----");
		System.out.println();
	}
	
//	6. Try to concat "Hello Selenium" with a character 't'
	static void concat() {
		String s1="Hello Selenium";
		char c1='t';
		System.out.println(s1+c1);
		System.out.println("----End of prog----");
		System.out.println();
	}
	
//	7. To 3 int var, Add them and concatenate and generate this output String : 
	static void totalAmt() {
		int i1=100;
		int i2=200;
		int i3=3400;
		int sum=i1+i2+i3;
		System.out.println("Your Toal amount is. "+sum);
		System.out.println("----End of prog----");
		System.out.println();
	}
	
//	8. Output of a byte with OCTA(065)
	static void bytes() {
		byte b3=065;
		System.out.println(b3);
		System.out.println("----End of prog----");
		System.out.println();
	}
	
//	Conditional Op #1-Take three numbers from the user and print the greatest number. 
	static void greatest() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number to be compared");
		int i1=sc.nextInt();
		
		System.out.println("Enter the 2nd number to be compared");
		int i2=sc.nextInt();
		
		System.out.println("Enter the 3rd number to be compared");
		int i3=sc.nextInt();
		
		if(i1>i2 && i1>i3) {
			System.out.println(i1+" is greatest");
		}
		else if(i2>i3) {
			System.out.println(i2+" is greatest");
		}
		else {
			System.out.println(i3+" is greatest");
		}	
		System.out.println("----End of prog----");
		System.out.println();
	}
	
//	Write a Java program to test a number is positive or negative.
	public static void numTest(int num) {
		if(num>=0) {
			System.out.println("number "+num+" is positive");
		}
		else if(num<0){
			System.out.println("number "+num+" is negative");
		}
	}
}
