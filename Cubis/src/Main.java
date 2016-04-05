

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variable Declaration
		int employeeCount = 13;
		int yearsLeft;
		String[] names = new String[employeeCount];
		Employee.description = "fool";

		
		Employee emp = new Employee("Chris Schraepen", 31);
		
		
		emp.sayHello();
		emp.comment();
		yearsLeft = emp.calculateYearsToRetirement();
		
		System.out.println(yearsLeft);
		
		names[0] = emp.getName();
		
	}
}
