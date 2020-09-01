package FirstDayPackage;

public class DataTypesClass {

	public static void main(String[] args) {
	/**
	 * @author Puneeth
	 */
		
		byte b1=127;
		byte b2=-122;
		System.out.println("Printing value of b1 : "+b1);
		System.out.println("Printing value of b2 : "+b2);
		
		short s1=32000;
		short s2=-32700;
		System.out.println("Printing value of s1 : "+s1);
		System.out.println("Printing value of s2 : "+s2);

		int i1=2000000000;
		int i2=-2000000000;
		System.out.println("Printing value of i1 : "+i1);
		System.out.println("Printing value of i2 : "+i2);
		System.out.println(b1+s1+i1);

		long l1=200000000000000000l;	//append with a "l"
		long l2=-2077667564574363534l;
		System.out.println("Printing value of l1 : "+l1);
		System.out.println("Printing value of l2 : "+l2);

		float f1=8768.9878976f;
		float f2=(float)-6775479667586.986756756547;
		System.out.println("Printing value of f1 : "+f1);
		System.out.println("Printing value of f2 : "+f2);
		System.out.println(b1+s1+i1+l2+f2);
		
		double d1=8768.9887677586568766768767676;
		System.out.println("Printing value of d1 : "+d1);
		
		boolean t=true;
		boolean f=false;
		System.out.println(t);
		
		char c='$';
		char num='1';
		char gender='M';
		System.out.println("Printing c :"+c);
		System.out.println("Printing num : "+num);
		System.out.println("Printing gender : "+gender);
		
		char c1='a';
		char c2='b';
		System.out.println(c1+c2);
	}

}
