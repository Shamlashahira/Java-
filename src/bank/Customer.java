package bank;

public class Customer {
	
	int id,age;
	String name;
	Pan pan;
	
	public Customer(){
		
		id = 100;
		age =23;
		name = "Sha";
		pan = new Pan();
		pan.setPanNumber("adggjkokhgyu");
		pan.fatherName = "aabbcc";
	}

	public void printCustomerDetails() {
		System.out.println("Customer id: " + id + " name: " + name +" age : " + age);
		pan.printPanDetails();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer = new Customer();
		customer.printCustomerDetails();
	}

}
