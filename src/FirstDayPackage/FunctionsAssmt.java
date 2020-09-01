package FirstDayPackage;

public class FunctionsAssmt {

	public static void main(String[] args) {
		FunctionsAssmt f=new FunctionsAssmt();
		f.sum(10, -2);
		f.prod(5,4);
		f.circle(2.12);
		f.maxNum(9, 5, 8);
		f.minNum(10,24,1);
		f.oddEven(13);
		f.voterEligibility(19);
		f.primeNo(18);
		f.printGrade(41);
		f.factorial(5);
	}
	
//	1. Write a program to print the sum of two numbers entered by user by defining your own method.
	void sum(int a, int b) {
		System.out.println("The sum of "+a+" and "+b+" is = "+(a+b));
		System.out.println("---- E N D ----");
	}
	
//	2. Define a method that returns the product of two numbers entered by user.
	void prod(int a, int b) {
		System.out.println("The PROD of "+a+" and "+b+" is = "+(a*b));
		System.out.println("---- E N D ----");
	}
//	3. Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
	void circle(double r) {
		System.out.println("Area of the circle with radius "+r+" is = "+(3.14*r*r));
		System.out.println("Circumference of the circle with radius "+r+" is = "+(2*3.14*r));
		System.out.println("---- E N D ----");
	}
//	4. Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
	void maxNum(int a,int b, int c) {
		if(a>b && a>c) {
			System.out.println(a+" is the greatest");
		}
		else if(b>c) {
			System.out.println(b+" is the greatest");
		}
		else {
			System.out.println(c+" is the greatest");
		}
		System.out.println("---- E N D ----");
	}
	void minNum(int a,int b, int c) {
		if(a<b && a<c) {
			System.out.println(a+" is the smallest");
		}
		else if(b<c) {
			System.out.println(b+" is the smallest");
		}
		else {
			System.out.println(c+" is the smallest");
		}
		System.out.println("---- E N D ----");
	}
//	5. Define a program to find out whether a given number is even or odd.
	void oddEven(int a) {
		if(a%2==0) {
			System.out.println("The number - "+a+" is EVEN");
		}
		else
			System.out.println("The number - "+a+" is ODD");
		System.out.println("---- E N D ----");
	}
//	6. A person is elligible to vote if his/her age is greater than or equal to 18. 
//	Define a method to find out if he/she is elligible to vote.
	void voterEligibility(int age) {
		if(age<18) {
			System.out.println("Still a minor can not vote");
		}
		else {
			System.out.println("Congratulations!! You are eligible to vote");
		}
		System.out.println("---- E N D ----");
	}
//	7. Define a method to find out if number is prime or not.
	void primeNo(int n) {
		int temp;
		boolean isPrime=true;
		if(n==0 || n==1) {
			System.out.println("Number is less than/equal to 1 hence not a prime");
		}
		else {
			for(int i=2;i<=n/2;i++){
				temp=n%i;
				if(temp==0){
					isPrime=false;
					break;
				}
			}
			System.out.println("Check of PRIME for the entered number "+n+" is --> "+isPrime);
		}
		System.out.println("---- E N D ----");
	}
//	8. Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
	void printGrade(int marks) {
		String grade="";
		if(marks>=91 && marks<=100) {
			grade="AA";
		}
		else if(marks>=81 && marks<91) {
			grade="AB";
		}
		else if(marks>=71 && marks<81) {
			grade="BB";
		}else if(marks>=61 && marks<71) {
			grade="BC";
		}else if(marks>=51 && marks<61) {
			grade="CD";
		}else if(marks>=41 && marks<51) {
			grade="DD";
		}
		else if(marks<=40) {
			grade="FAIL";
		}
		System.out.println("Student marks is "+marks+" and  grade is "+grade);
		System.out.println("---- E N D ----");
	}
	
//	9. Write a program to print the factorial of a number by defining a method named 'Factorial'.
	void factorial(int n) {
		int f=1;
		int a=0,c=0,b=1;
		if(n==0 || n==1) {
			f=n;
			System.out.println("Factorial is --> "+f);
		}
		else {
			for(int i=2;i<=n;i++) {
				f=f*i;
			}
		}
		System.out.println(f);
		System.out.println("---- E N D ----");
	}
}
