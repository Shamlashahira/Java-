
public class TypeChangeExample {

	
	void changeType()
	{
		int iNum1 =10;
		float fNum2 = 20.34f;
		double dNum3 = 34.22;
//		int result = (int)fNum2;//explicit casting
		float result = (float)dNum3;
		System.out.println(result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new TypeChangeExample().changeType();
	}

}
