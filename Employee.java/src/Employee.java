class EmployeeTest {
	private String firstName;
	private String lastName;
	private double salary;
	
	public EmployeeTest(String fName, String lName, double sal) {
		if(fName!=null) firstName=fName;
		if(lName!=null) lastName=lName;
		if(sal>0.0) {
			salary = sal;
		}
		else {
			salary=0.0;
		}
	}
	public String getFirstname() {
		return firstName;
	}
    public String getLastName() {
		return lastName;
	}
	public double getSalary() {
		return salary;
	}
	
	public void setfirstName(String fName) {
		if(fName !=null)
			firstName=fName;
	}
	public void setLastName(String lName) {
		if(lName != null)
			lastName=lName;
	}
	public void setSalary(double sal) {
		if(sal>0.0) {
			salary=sal;
		}
		else {
			salary=0.0;
		}
	}
}

class Employee extends EmployeeTest{
	public Employee(String fName, String lName, double sal) {
		super(fName, lName, sal);
	}

	public static void main(String[] args) {
		Employee employee1=new Employee("Rohan","gs",35000.00);
		Employee employee2=new Employee("Sunny","Ahuja",55000.00);
		
		System.out.printf("\nNO:\t NAME\t\t\tMONTHLY SALARY\n");
		
		System.out.printf("1:\t %s %s\t\t$%.2f\n", employee1.getFirstname(), employee1.getLastName(),employee1.getSalary());
		System.out.printf("1:\t %s %s\t\t$%.2f\n", employee2.getFirstname(), employee2.getLastName(),employee2.getSalary());
		
		employee1.setSalary((employee1.getSalary()+employee1.getSalary()*0.1));	
		employee2.setSalary((employee2.getSalary()+employee2.getSalary()*0.1));
		
		System.out.printf("\nCongratulations !! Your salary is hiked by 10 percent.\n");
		System.out.printf("1:\t %s %s\t\t$%.2f\n", employee1.getFirstname(), employee1.getLastName(),employee1.getSalary());
		System.out.printf("1:\t %s %s\t\t$%.2f\n", employee2.getFirstname(), employee2.getLastName(),employee2.getSalary());
		
		System.out.println("*******   Thank you   ********");
	}
}

