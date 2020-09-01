package FirstDayPackage;

public class LoopsConcepts {

	public static void main(String[] args) {
		loopsBatman();
		loopIncBatman();
		doWhileLoop();
		HelloWorld();
		multiple7();
	}
	
//	1. WAP to print following output:
	static void loopsBatman() {
		for(int i=0;i<4;i++) {
			System.out.println("I am Batman");
			System.out.println();
		}
	}
	
//	2. WAP to print following output:
	static void loopIncBatman() {
		for(int i=1;i<10;i++) {
			System.out.println("I am Batman "+i);
			System.out.println();
		}
	}
	
//	3. WAP to print 10 to 1 using for, while and do-while loop
	static void doWhileLoop() {
		int i=10;
		do {
			System.out.println(i);
			i--;
		}while(i>0);
	}
	
//	4. Write a program in Java to print "Hello World" ten times using while loop
	static void HelloWorld() {
		int i=0;
		while(i<10) {
			System.out.println("Hello World!!");
			i++;
		}
	}
	
//	5. Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered
	static void multiple7() {
		int i=1;
		while(i<=10) {
			if(i%7==0) {
				break;
			}
			else {
				System.out.println(i);
				i++;
			}
		}
	}

}
