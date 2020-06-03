import java.util.Scanner;
public class PrimeInRange {

	
	int minNumber,maxNumber;
	Scanner scanner;
	
	public PrimeInRange()
	{
		minNumber = maxNumber =0;
		scanner = new Scanner(System.in);
	}
	
	void getNumbersFromUser()
	{
		
		System.out.println("Please enter minimum number");
		
		minNumber =scanner.nextInt();
		
		System.out.println("Please enter maximum number");
		
		maxNumber =scanner.nextInt();
		
		if(minNumber>=maxNumber)
		{
			System.out.println("Incorrect entries...try again");
			getNumbersFromUser();
		}
		

	}
	
	boolean CheckIfPrimeOrNot(int num)
	{
		
		boolean result = true;
		
		for(int i=2;i<num-1;i++)
		{
			if(num%i==0)
			{
				result = false;
				break;
			}
		}
		return result;
	}
	
	void checkRangeForPrime() {
		getNumbersFromUser();
		for(int i=minNumber; i<=maxNumber; i++)
		{
			System.out.println(i+ "-");
			
			if(CheckIfPrimeOrNot(i) ==true)
				
				System.out.println("Prime");
			else
				System.out.println("Not prime");

		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrimeInRange pin = new PrimeInRange();
		pin.checkRangeForPrime();
		
	}

}
