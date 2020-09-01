package FirstDayPackage;

public class StringConcepts {

	public static void main(String[] args) {
		String s1="Hello World";
		String s2="Hi World";
		System.out.println(s1);
		System.out.println(s1+s2);
		
		int a=10;
		int b=20;
		System.out.println(a+b); 	//This would print the sum of a and b
		System.out.println(" " + a + b); 	//This would print 1020 since a string is being concatenated to the calculation
		System.out.println("Hi " + (a + b) + " There!!");	//Since we are putting(), it would be given precedence and a+b would be done first
		
		String c="Hello";
		String d="World";
		int e=12;
		int f=15;
		char g='5';
		char h='a';
		System.out.println(g+h);	//g+h would give sum of ascii values of char a
	}

}
