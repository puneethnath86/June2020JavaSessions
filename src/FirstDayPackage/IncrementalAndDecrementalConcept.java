package FirstDayPackage;

public class IncrementalAndDecrementalConcept {

	public static void main(String[] args) {
		//POST INCREMENT
		int a=1;	//
		int b=a++;	//POST increment-LATER, so assign the value first later increment it
		System.out.println(a);//Once value is assigned then the value is incremented to 2
		System.out.println(b);//Value of a is assigned to b, so b=1
		
		//PRE INCREMENT
		int x=1;
		int y=++x;	//PRE increment-FIRST, so first increment the value of x and then assign it to y
		System.out.println(x);
		System.out.println(y);//The value of x would be incremented FIRST to 2 and then assigned to y
		
		//POST DECREMENT
		int i1=1;
		int i2=i1--;	//POST DECREMENT(LATER)-First assign the value of i1 to i2 and then decrement it LATER
		System.out.println(i1);
		System.out.println(i2);//LATER Decrement, so first the value of i1 will be assigned to i2 and then i1 would be decremented
		
		//PRE DECREMENT
		int i3=1;
		int i4=--i3;	//PRE DECREMENT-first decrement then use the value
		System.out.println(i3);		//0 would be printed
		System.out.println(i4);		//out put-->0
		
	}

}
