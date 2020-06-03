import java.util.Scanner;
public class Customers {

	private String name,phone;
	private int id,age;
	private Scanner scanner;
	
	
	Customers(){
		scanner = new Scanner(System.in);
	
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	public void printCustomerData() {
		
		System.out.println("Customer ID"+id);
		System.out.println("Customer Name"+name);
		System.out.println("Customer Age"+age);
		System.out.println("Customer Phone"+phone);
	}
	
	public void getCustomerDataFromUser() {
		
		System.out.println("id");
		id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("name");
		name = scanner.nextLine();
		System.out.println("phone");
		phone = scanner.nextLine();
		System.out.println("age");
		age = scanner.nextInt();
	}
}
