import java.util.Scanner;
public class Divisibleby7 {
	
int num1;
	
	Scanner sc;
	
	Divisibleby7()
	{
		
		sc = new Scanner(System.in);
	}
	
	void findDivisibility()
	{ 
		if(num1%7== 0) 
			
	 System.out.println("The given number is divisible by 7");
	

		else
			System.out.println("The given number is not divisible by 7");
		
	}
	
	void takeNumberInput()
	{
		
		System.out.println("Please enter number");
		
		num1 =sc.nextInt();
		

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Divisibleby7 db7 = new Divisibleby7();
		db7.takeNumberInput();
		db7.findDivisibility();
	}

}
