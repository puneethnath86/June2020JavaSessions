package FirstDayPackage;

public class StringAssigment1 {

	public static void main(String[] args) {
		checkEquality();
		removeSpaces();
		firstLastChar();
		containsOperation();
		reverse();
		lastHalf();
		occurenceOfChar();
		solution1();
		breakString();
		printMiddle();
		intParsing();
	}
//	1.  Write a program to check two different strings equality.
	static void checkEquality() {
		String s1="Selenium Automation";
		String s2="Selenium Automation";
		if(s1.equals(s2)) {
			System.out.println("Both the strings are same");
		}
		else {
			System.out.println("Strings are not same");
		}
		System.out.println("----End of prog-----");
		System.out.println();
	}
//	2. Remove all  spaces in a String . 
	static void removeSpaces() {
		String s1="         Hello      Everyone       ";
		System.out.println("String before removing spaces is -->"+s1);
		String s3=s1.replace("      ", " ").trim();
		System.out.println("String after removing spaces is -->"+s3);
		System.out.println("----End of prog-----");
		System.out.println();
	}
	
//	3. Write a program that will  print out last character and first character of a word.
	static void firstLastChar() {
		String s1="pneumonoultramicroscopicsilicovolcanoconiosis";
		System.out.println("First char of the word is -->"+s1.charAt(0));
		System.out.println("Last char of the word is -->"+s1.charAt(s1.length()-1));
		System.out.println("----End of prog-----");
		System.out.println();
	}
//	4. Write a program to verify a word or a character contains in the sentence.
	static void containsOperation() {
		String s1="This string will be used to check contains method of the String class";
		String s2="1method";
		if(s1.contains(s2)) {
			System.out.println("The actual string contains the word -->"+s2);
		}
		else if(s1.contains("k")) {
			System.out.println("The actual string contains the word -->k");
		}
		else {
			System.out.println("The actual string DOES NOT contains the word/char sequence");
		}
		System.out.println("----End of prog-----");
		System.out.println();
	}
//	5.Write a function/ method to reverse your own name.
	static void reverse() {
		String name="Puneeth";
		String rev="";
		int size=name.length();
		for(int i=size-1;i>=0;i--) {
			rev=rev+(name.charAt(i));
		}
		System.out.println(rev);
		System.out.println("----End of prog-----");
		System.out.println();
	}
	
//	6. Write a program that gives you last half of the string
	static void lastHalf() {
		String s1="I want to become an automation architect";
		int size=s1.length()/2;
		String s2=s1.substring(size, s1.length());
		System.out.println(s2);
		System.out.println("----End of prog-----");
		System.out.println();
	}
	
//	7.Write a program to get the 3rd  “ e “ of the string .
	static void occurenceOfChar() {
		String s1="Welcome to Naveen Automation Lab !";
		int firstIndex=s1.indexOf("e");
		int secondIndex=s1.indexOf("e", firstIndex+1);
		System.out.println(s1.indexOf("e", secondIndex+1));
		System.out.println("----End of prog-----");
		System.out.println();
	}
//	8. Write a method which gives index of (-1) if string is not available. 
//	it should return integer. if String is present, then it should return the specific index.
	static void solution1() {
		String s1="This is Puneeth and I want to be an automation architect";
		String s2="zzz";
		if(s1.contains(s2)) {
			int i=s1.indexOf(s2);
			System.out.println("The string "+s2+" is present in the actual string at the location "+i);
		}
		else {
			System.out.println("The string "+s2+" is NOT present in the actual string and index is -1");
		}
		System.out.println("----End of prog-----");
		System.out.println();
	}
	
//	9. Write a program that breaks a whole string into small strings, and print out its all values . (Hint: split, loop) 
	static void breakString() {
		String s1="Hello everyone and stay safe";
		String[] s2=s1.split(" ");
		int size=s2.length;
		for(int i=0;i<size;i++) {
			System.out.println(s2[i]);
		}
		System.out.println("----End of prog-----");
		System.out.println();
	}

//	10. Assume that a string consists of 3 words, print out the middle one. 
	static void printMiddle() {
		String s1="Naveen is rockstar";
		String[] sArr=s1.split(" ");
		int size=sArr.length;
		int index=size/2;
		System.out.println(sArr[index]);
		System.out.println("----End of prog-----");
		System.out.println();
	}
	
//	11. get only numeric part from this String:	String s = "your transaction id is: 12345 and reference id is 34567";
	static void intParsing() {
		String s = "your transaction id is: 12345 and reference id is 34567";
		String[] arrTrid=s.split(":");
		String s2=arrTrid[1];
		String trid=s2.substring(1,6);
		System.out.println("The TransactionID is --> "+trid);
		String arrRef[]=arrTrid[1].split("is");
		System.out.println("The reference ID is -->"+arrRef[1].trim());
	}
}
