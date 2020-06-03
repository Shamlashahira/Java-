
public class Movie {

	
	int id;
	String name,actorname,duration;
	
	// CONSTRUCTOR
	
	
	Movie(){
		id=100;
		name="Avatar";
		duration = "150 minutes";
		actorname ="Azar";
	}
	
	//
	
	
	Movie(int mid,String mname,String mduration,String mactorname){
		id=mid;
		name=mname;
		duration = mduration;
		actorname = mactorname;
	}
	
	void printMovieDetails() {
		System.out.println("Movie Id : "+id);
		System.out.println("Movie Name : "+name);
		System.out.println("Movie Duration : "+duration);
		System.out.println("Movie Actorname : "+actorname);
		System.out.println("-----------");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movie m1 = new Movie();
		Movie m2 = new Movie(101,"Lion King","180 minutes","Simba");
		m1.printMovieDetails();
		m2.printMovieDetails();
	}

}
