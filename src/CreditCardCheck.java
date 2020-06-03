//import java.util.Scanner;
//public class CreditCardCheck {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Scanner in = new Scanner(System.in);
//        int count = 0;
//        long array[] = new long [16];
//       do
//       {
//        count = 0;
//       array = new long [16];
//        System.out.print("Enter your Credit Card Number : ");
//        long number = in.nextLong();
//        for (int i = 0; number != 0; i++) {
//        array[i] = number % 10;
//        number = number / 10;
//        count++;
//        }
//       }
//        while(count < 13); 
//        if ((array[count - 1] == 4) || (array[count - 1] == 5) || (array[count - 1] == 3 && array[count - 2] == 7)){
//            if (isValid(array) == true) {
//                System.out.println("\n The Credit Card Number is Valid. ");
//        } else {
//            System.out.println("\n The Credit Card Number is Invalid. ");
//        }
//        } else{
//          System.out.println("\n The Credit Card Number is Invalid. ");
//        }
//    }
//
//    public static boolean isValid(long[] array) {
//        int total = sumOfDoubleEvenPlace(array) + sumOfOddPlace(array);        
//        if ((total % 10 == 0)) {
//         for (int i=0; i< array.length; i++){
//            System.out.println(array[i]);}
//            return true;
//        } else {
//          for (int i=0; i< array.length; i++){
//            System.out.println(array[i]);}
//            return false;
//        }
//    }
//
//    public static int getDigit(int number) {
//        if (number <= 9) {
//            return number;
//        } else {
//            int firstDigit = number % 10;
//            int secondDigit = (int) (number / 10);
//            return firstDigit + secondDigit;
//        }
//    }
//
//    public static int sumOfOddPlace(long[] array) {
//        int result = 0;
//        for (int i=0; i< array.length; i++)
//        {
//        while (array[i] > 0) {
//            result += (int) (array[i] % 10);
//            array[i] = array[i] / 100;
//         }}
//         System.out.println("\n The sum of odd place is " + result);
//        return result;
//    }
//
//    public static int sumOfDoubleEvenPlace(long[] array) {
//        int result = 0;
//        long temp = 0;
//        for (int i=0; i< array.length; i++){
//        while (array[i] > 0) {
//             temp = array[i] % 100;
//             result += getDigit((int) (temp / 10) * 2);
//            array[i] = array[i] / 100;
//           }
//        }
//        System.out.println("\n The sum of double even place is " + result);
//        return result;
//    }
//     
//	}

import java.util.Scanner;
public class CreditCardCheck {

	String cardNumber;
	int[] intCardNumbers,reverseCardNumber;
	Scanner scanner;
	
	CreditCardCheck(){
		intCardNumbers = new int[16];
		reverseCardNumber = new int[16];
		scanner = new Scanner(System.in);
	}
	
	void getCardNumber() {
		System.out.println("Please enter your 16 digit card number without any space");
		cardNumber =scanner.nextLine();
		if(cardNumber.length() !=16)
		{
			System.out.println("Invalid card number. Please try entering again!!!");
			getCardNumber();
		}
	}
	
	void convertStringCardNumberToIntArray() {	
		for (int i = 0; i < cardNumber.length(); i++) {
			intCardNumbers[i]= Integer.parseInt(cardNumber.substring(i,(i+1)).toString());
		}
	}
	void reverseCardNumber() {
		int j = 15;
		for (int i = 0; i < intCardNumbers.length; i++) {
			reverseCardNumber[j] = intCardNumbers[i];
			j--;
		}
	}
	boolean validateCard() {
		boolean result = false;
		int sum =0;
		for (int i = 0; i < reverseCardNumber.length; i++) {
			if(i%2 !=0)
			{
				reverseCardNumber[i] = reverseCardNumber[i]*2;
				if(reverseCardNumber[i]>9)
				{
					reverseCardNumber[i] = reverseCardNumber[i]-9;
				}
			}
			sum = sum + reverseCardNumber[i];
		}
		if(sum%10 == 0)
			result = true;
		return result;
	}
	void printCardStatus() {
		if(validateCard()==true)
			System.out.println("Valid Card");
		else
			System.out.println("Dont Cheat");
	}
	public static void main(String[] args) {
		CreditCardCheck cardValidation = new CreditCardCheck();
		cardValidation.getCardNumber();
		cardValidation.convertStringCardNumberToIntArray() ;
		cardValidation.reverseCardNumber();
		cardValidation.printCardStatus();
	}

}
