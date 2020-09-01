package FirstDayPackage;

import java.util.Arrays;
import java.util.List;

public class defaultMethodClass implements defaultMethodsInterface{

	public static void main(String[] args) {
		defaultMethodClass obj=new defaultMethodClass();
//		Sum method is defined in interface defaultMethodsInterface
		obj.sum();
		
		List<Integer> values=Arrays.asList(1,2,3,4,5,6,7);
//		values.forEach(i->System.out.println(i));
		values.forEach(System.out::println);
	}

}
