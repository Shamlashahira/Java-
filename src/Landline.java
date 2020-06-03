
public class Landline {

	String	Colour,place,Model;
	int number;
	Landline(){
		System.out.println("This is a Landline");
		Colour = "Black";
		number = 44551244;
		place = "Office";
	}
	void Type() {
		System.out.println( place + " landline no " + number);
	}
	void Colour(){
		System.out.println("It is " + Colour +" in colour");
	}
}
