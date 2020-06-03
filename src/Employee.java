
public class Employee {
	
	int id,age;
	String name;
	
	Employee(){
//		id=500;
//		name="Shamla";
//		age = 17;
	}
	Employee(int eid,String ename,int eage){
		id=eid;
		name=ename;
		age = eage;
	}
	
	boolean employeeAgeCheck() {
		boolean result = false;
		if(age>=18)
		{
			System.out.println("You can join");
			result = true;
		}
		else
			System.out.println("You are under age for employment");
		return result;
	}
//	void work()
//	{
//		System.out.println("Employee does his work");
//	}
//	void printEmployeeData() {
//		System.out.println("Employee Id : "+id);
//		System.out.println("Employee Name : "+name);
//		System.out.println("Employee Age : "+age);
//		System.out.println("-----------");
//	}
	//compile	
	public static void main(String[] args) {
//		Employee e1 = new Employee();
//		Employee e2 = new Employee(501,"Suja",21);
//		e1.id = 101;
//		e1.name = "Ramu";
//		e1.age = 22;
//		e1.employeeAgeCheck();
//		e1.printEmployeeData();
//		e2.printEmployeeData();
		
		Employee e1 = new Employee();
		boolean checkResult = e1.employeeAgeCheck();
		if(checkResult == true)
			e1.printEmployeeData();
		
		/*if( e1.employeeAgeCheck() == true)
			e1.printEmployeeData();*/
	}
	void work()
	{
		System.out.println("Employee does his work");
	}
	void printEmployeeData() {
		System.out.println("Employee Id : "+id);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Age : "+age);
		System.out.println("-----------");
	}

		
	}





