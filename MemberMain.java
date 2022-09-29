class Member
{
	String name;
	int age;
	long phoneNumber;
	String address;
	double Salary;
	
	public void  printSalary(double salary) 
	{
		System.out.println("salary is "+salary); 
	}
}

class Employee extends Member
{
	String specialization;
	
	
	public void showDetails() 
	{
		System.out.println("Name of the employee is "+name);
		System.out.println("age of the employee is "+age);
		System.out.println("phone Number of the employee is "+phoneNumber);
		System.out.println("Address of the employee is "+address);
		System.out.println("Specialization of the employee is "+specialization);
	}
	public void  printSalary(double salary) 
	{
		System.out.println("salary is "+salary); 
	}
}
class Manager extends Member
{
	String department;
	public void showDetails() 
	{
		System.out.println("Name of the Manager is "+name);
		System.out.println("age of the Manager is "+age);
		System.out.println("phone Number of the Manager is "+phoneNumber);
		System.out.println("Address of the Manager is "+address);
		System.out.println("Department of the Manager is "+department);
	}
	public void  printSalary(double salary) 
	{
		System.out.println("salary is "+salary); 
	}
}
class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager man = new Manager();
		Employee e = new Employee();
		man.name="Nagesh";
		man.age=23;
		man.department="IT";
		man.phoneNumber=9988776655L;
		man.address="karvenagar";
		man.printSalary(35000);
		man.showDetails();
		
		e.name="Vicky";
		e.age=40;
		e.specialization="Contracor";
		e.phoneNumber=8765432980L;
		e.address="pune";
		e.printSalary(15000);
		e.showDetails();
		
		

	}

}
