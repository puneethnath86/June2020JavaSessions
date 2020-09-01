package FirstDayPackage;

import java.util.ArrayList;

public class streamAPIs1 
{
	public static void main(String[] args) {
		ArrayList<Integer> values=new ArrayList<Integer>();
		for(int i=0;i<5;i++) {
			values.add(i);
		}
		values.forEach(i -> System.out.println(i));
		System.out.println();
		values.stream().forEach(System.out::println);
	}
}
