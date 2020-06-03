import java.util.Scanner;
public class PrimeOrNot
{
   public static void main(String args[])
   {		
	int	abc;
	boolean isPrime=true;
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter Number:");
	int num=scan.nextInt();
     
	for(int i=2;i<=num/2;i++)
	{
          abc=num%i;
	   if(abc==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	
	if(isPrime)
	   System.out.println(num + " is a Prime Number");
	else
	   System.out.println(num + " is not a Prime Number");
   }
}

//import java.util.Scanner;
//public class PrimeOrNot
//{
//   public static void main(String args[])
//   {		
//	int	abc;
//	boolean isPrime=true;
//	Scanner scan= new Scanner(System.in);
//	System.out.println("Enter Number:");
//	int num=scan.nextInt();
//        scan.close();
//	for(int i=2;i<=num/2;i++)
//	{
//          abc=num%i;
//	   if(abc==0)
//	   {
//	      isPrime=false;
//	      break;
//	   }
//	}
//	
//	if(isPrime)
//	   System.out.println(num + " is a Prime Number");
//	else
//	   System.out.println(num + " is not a Prime Number");
//   }
//}