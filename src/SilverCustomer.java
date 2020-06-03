import java.util.Random;
public class SilverCustomer extends Customers{

Random random = new Random();
	SilverCustomer()
	{
		name = "Shahira";
		id = 12;
		phone = "9445056302";
		category= "Silver";
		info = "Lucky draw";
	}
	
	void luckyDraw() {
		System.out.println("Hi " +name +"\n"+"Customer id :" +id +"\n"+"You are a "+category +" customer "+"\n"+"Earning a " +info);
	}
}
