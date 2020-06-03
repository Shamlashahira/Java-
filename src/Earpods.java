
public class Earpods {

	void addMusic() {
		HeadPhone hp = new HeadPhone();
		hp.Type();
		hp.Model();
		System.out.println("--------------------------");
		BluetoothHeadphone bth = new BluetoothHeadphone();
		bth.Type();
		bth.Colour();
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Earpods ea = new Earpods();
		ea.addMusic();
	}

}
