package FirstDayPackage;

import java.util.ArrayList;

public class ArrayConcept {

	public static void main(String[] args) {
		ArrayConcept ac=new ArrayConcept();
		ac.forLoop1();
		ac.cricData();
		ac.patternPrint();
		ac.arrayList1();
		ac.firstLastArrList();
		ac.retrieveEle();
		ac.updateArrEle();
		ac.removeEle();
		ac.searchEle();
		ac.revArrList();
		ac.arrPortion();
		ac.swap();
		ac.emptyArrList();
		ac.printArrEle();
	}
	
//	Question 1: Write a program to print the following pattern using for loop:
	void forLoop1() {
		int count=0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(i+""+j);
				System.out.print(" ");
				count++;
			}
			System.out.println();
		}
		System.out.println("-----END------");
	}
	
//	Question 2: Write a program to create a static Array, having following cricket data:
//	name, age, team name, DOB, gender, Strike Rate
	void cricData() {
		Object[] cric1=new Object[6];
		cric1[0]="Puneeth Nath";
		cric1[1]=34;
		cric1[2]="Banglore Bulls";
		cric1[3]="29/07/1986";
		cric1[4]='M';
		cric1[5]=100;
		
		Object[] cric2=new Object[6];
		cric2[0]="Jitesh Kothari";
		cric2[1]=33;
		cric2[2]="Delhi devils";
		cric2[3]="16/06/1987";
		cric2[4]='M';
		cric2[5]=93;
		printCricData(cric1);
		printCricData(cric2);
		System.out.println("-----END-----");
	}
	
	void printCricData(Object[] obj) {
		System.out.println("Data for players is below");
		for(int i=0;i<6;i++) {
			System.out.println("Player name is-->"+obj[i]);
		}
		System.out.println(" - - - - ");
	}
	
//	Question 3: Try to print the following pattern on the console:
	void patternPrint() {
		
		for(int i=4;i>=0;i--) {
			System.out.println("n = "+i);
		}
		System.out.println("-----END-----");
	}
	
//	1. Write a Java program to create a new array list, add some colors (string) and print out the collection
	void arrayList1() {
		ArrayList<String> colors=new ArrayList<String>();
		colors.add("Blue");
		colors.add("Red");
		colors.add("Orange");
		colors.add("Magenta");
		colors.add("White");
		for(String s:colors) {
			System.out.println("The color is--> "+s.toString());
		}
		System.out.println("-----END-----");
	}
	
//	2. Write a Java program to insert an element into the array list at the first and last positions.
	void firstLastArrList() {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("");
		System.out.println(arr.size());
		for(int i=0;i<arr.size();i++) {
			if(i==0 || i==arr.size()) {
				arr.add("i");
				System.out.println("Inserting some value at index "+i+" of the array list "+i);
			}
		}
		System.out.println("-----END-----");
	}
//	3. Write a Java program to retrieve an element (at a specified index) from a given array list.
	void retrieveEle() {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		int eleIndex=2;
		for(int i=0;i<5;i++) {
			arr.add(i);
		}
		System.out.println(arr.get(eleIndex));
		System.out.println("-----END-----");
	}
//	4. Write a Java program to update specific array element by given element.
	void updateArrEle() {
		ArrayList<String> arr=new ArrayList<String>();
		int eleIndex=2;
		for(int i=0;i<5;i++) {
			arr.add("RE"+i);
		}
		System.out.println(arr);
		System.out.println("The ele to be replaced at index "+eleIndex+" is : "+arr.get(eleIndex));
		arr.set(eleIndex, "p");
		System.out.println("The ele after replacement at index "+eleIndex+" is : "+arr.get(eleIndex));
		System.out.println(arr);
		System.out.println("-----END-----");
	}
//	5. Write a Java program to remove the third element from a array list. 
	void removeEle() {
		ArrayList<String> arr=new ArrayList<String>();
		int eleIndex=4;
		for(int i=0;i<6;i++) {
			arr.add("removeEle"+i);
		}
		System.out.println(arr);
		System.out.println("The ele to be removed at index "+eleIndex+" is : "+arr.get(eleIndex));
		arr.remove(eleIndex);
		System.out.println(arr);
		System.out.println("-----END-----");
	}
//	6. Write a Java program to search an element in a array list.
	void searchEle() {
		ArrayList<String> arr=new ArrayList<String>();
		int eleIndex=4;
		String search="SE2";
		for(int i=0;i<6;i++) {
			arr.add("SE"+i);
		}
		System.out.println(arr);
		int index=arr.indexOf(search);
		System.out.println("The ele is found at position--> "+index);
		System.out.println("-----END-----");
	}
//	7. Write a Java program to reverse elements in a array list
	void revArrList() {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Java");
		arr.add("Learning");
		arr.add("Is");
		arr.add("Fun");
		String rev="";
		System.out.println("The actual array list is -->  "+arr);
		int size=arr.size();
		for(int i=size-1;i>=0;i--) {
			rev=rev+arr.get(i);
		}
		System.out.println("The reversed array list is --> "+rev);
		System.out.println("-----END-----");
	}
//	8. Write a Java program to extract a portion of a array list.
	void arrPortion() {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Java");
		arr.add("Learning");
		arr.add("Is");
		arr.add("Fun");
		int portion=1;
		System.out.println("The portion of array at given index is-->"+arr.subList(1, 2));
		System.out.println("-----END-----");
	}
//	9. Write a Java program of swap two elements in an array list.
	void swap() {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Java");
		arr.add("Learning");
		arr.add("Is");
		arr.add("Fun");
		System.out.println("Actual array was-->"+arr);
		int fromInd=1;
		int toInd=3;
		String temp="";
		temp=arr.get(fromInd);
		arr.set(fromInd, arr.get(toInd));
		arr.set(toInd, temp);
		System.out.println("Array after replace is-->"+arr);
		System.out.println("-----END-----");
	}
//	10. Write a Java program to empty an array list.
	void emptyArrList() {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Java");
		arr.add("Learning");
		arr.add("Is");
		arr.add("Fun");
		System.out.println("The array list is -->"+arr);
		arr.removeAll(arr);
		System.out.println("The array list after removing all ele is --> "+arr);
	}
//	12. Write a Java program to print all the elements of a ArrayList using the position of the elements
	void printArrEle() {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Java");
		arr.add("Learning");
		arr.add("Is");
		arr.add("Fun");
		for(int i=0;i<arr.size();i++) {
			System.out.println("Array List ele at index "+i+" is -->"+arr.get(i));
		}
		System.out.println("-----END-----");
	}
}
