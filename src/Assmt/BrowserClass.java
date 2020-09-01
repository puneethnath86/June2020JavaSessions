package Assmt;

import java.util.ArrayList;

public class BrowserClass{
		String bowserName;
		String vendorName;
		double currentVersion;
		ArrayList<String> plugins=new ArrayList<String>();
		
//		Parameterized constructor
		public BrowserClass(String bowserName, String vendorName, String establishedDate, ArrayList<String> courses) 
		{
			
			System.out.println("The Bowser name is - "+getbowserName(bowserName));
			System.out.println("vendor Name is - "+getvendorName(vendorName));
			System.out.println("current Version is - "+getcurrentVersion(currentVersion));
			System.out.println("plugins offered is - "+getplugins(plugins));
			System.out.println();
		}
		
		public String getbowserName(String bowserName) {
			return this.bowserName=bowserName;
		}
		public String getvendorName(String vendorName) {
			return this.vendorName=vendorName;
		}
		public double getcurrentVersion(double currentVersion) {
			return this.currentVersion=currentVersion;
		}
		public ArrayList<String> getplugins(ArrayList<String> plugins) {
			return this.plugins=plugins;
		}
		
		
		public static void main(String[] args) {
			ArrayList<String> p1=new ArrayList<String>();
			p1.add("GMAIL");
			p1.add("DRIVE");
			BrowserClass bc1=new BrowserClass("Chrome","Google LLC","ChromeBeta84",p1);
			
			ArrayList<String> p2=new ArrayList<String>();
			p2.add("YahooToolbar");
			p2.add("GoogleSearchToolbar");
			
			BrowserClass bc2=new BrowserClass("InternetExplorer","Microsoft","IE11",p2);
			
		}
}
