import java.util.Scanner;
public class BetweenTwoNumbers {

	
int min,max;
	
	Scanner sc;
	
	BetweenTwoNumbers()
	{
		
		sc = new Scanner(System.in);
	}
	
	void findBetweenTwoNumbers()
	{ 
////		
     if(min == max)
			
	 System.out.println("Invalid number");
	

		else 
			for(int i=min+1;i<max;i++)
			{
			System.out.println(i);
		
			}
     
	}
	
	void takeNumberInput()
	{
		
		System.out.println("Please enter minimum number");
		
		min =sc.nextInt();
		

		System.out.println("Please enter maximum number");
		
		max =sc.nextInt();
		

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BetweenTwoNumbers btn = new BetweenTwoNumbers();
		btn.takeNumberInput();
		btn.findBetweenTwoNumbers();

	}

}
