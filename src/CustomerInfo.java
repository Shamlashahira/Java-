
public class CustomerInfo {

	
	void addInfo() {

		SilverCustomer customer = new  SilverCustomer();
		customer.getCustomerDataFromUser();
		customer.luckyDraw(101);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		new CustomerInfo().addCustomer();
	}

}
