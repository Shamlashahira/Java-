
public class Calculator {

	
	void add() {
		
		System.out.println("Add with no param");
	}
	
	void add(int num1, int num2) {
		
		int sum = num1 +num2;
		System.out.println("Add with 2 parameters. the sum is " +sum);
	}
	
    void add(float  num1, int num2) {
		
		float sum = num1 +num2;
		System.out.println("Add with 2 parameters(float,int). the sum is " +sum);
	}

    void add(int num1, float num2) {
	
	float sum = num1 +num2;
	System.out.println("Add with 2 parameters(int,float). the sum is " +sum);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calculator = new Calculator();
		calculator.add(10.0f,10);
	}

}
