package org.accessspecifier;

public class AccessSpecifier1 extends AccessSpecifier {

	
	private void empId(String string) {
		System.out.println("Employee id is : "+string);
	}
	public static void main(String[] args) {
		AccessSpecifier1 a = new AccessSpecifier1();
		a.empId("1234");
	}
}
