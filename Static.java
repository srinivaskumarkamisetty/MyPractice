package interviewprogrammes;

public class Static {
	static int EmployeeID=1234;
	static String EmployeeName="Vasu";
	static double salary=15000.0;

	public static void Employee() {
		System.out.println("EmployeeID="+EmployeeID);
		System.out.println("EmployeeName="+EmployeeName);
		System.out.println("salary="+salary);
	}
	public static void main(String[] args) {
		Static.Employee();
		
		
	}
}
