package Assmt;

import java.util.ArrayList;

public class UniversityClass{
		String name;
		String country;
		String establishedDate;
		ArrayList<String> courses=new ArrayList<String>();
		
//		Parameterized constructor
		public UniversityClass(String name, String country, String establishedDate, ArrayList<String> courses) 
		{
			
			System.out.println("The University name is - "+getName(name));
			System.out.println("Country is - "+getCountry(country));
			System.out.println("Establish date is - "+getEstablishedDate(establishedDate));
			System.out.println("Courses offered is - "+getCourses(courses));
			System.out.println();
		}
		
		public String getName(String name) {
			return this.name=name;
		}
		public String getCountry(String country) {
//			this.country=country;
			return this.country=country;
		}
		public String getEstablishedDate(String establishedDate) {
//			this.establishedDate=establishedDate;
			return this.establishedDate=establishedDate;
		}
		public ArrayList<String> getCourses(ArrayList<String> courses) {
//			this.courses=courses;
			return this.courses=courses;
		}
		
		
		public static void main(String[] args) {
			ArrayList<String> u1=new ArrayList<String>();
			u1.add("BE");
			u1.add("MBA");
			UniversityClass uc=new UniversityClass("LovelyProfessionalUniversity","Honalulu","01/01/2000",u1);
			
			ArrayList<String> u2=new ArrayList<String>();
			u2.add("MCA");
			u2.add("BCA");
			UniversityClass uc2=new UniversityClass("BangaloreUniversity","India","10/10/2010",u2);
			
		}
}
