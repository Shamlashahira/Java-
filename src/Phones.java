
public class Phones {

	void addPhones() {
		Landline ll = new Landline();
		ll.Type();
		ll.Colour();
		System.out.println("--------------------------");
		Cordless cd = new Cordless();
		cd.Type();
		cd.cdColour();
		System.out.println("--------------------------");
		Mobile mb = new Mobile();
		mb.Type();
		mb.Model();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phones phones = new Phones();
		phones.addPhones();
	}

}
