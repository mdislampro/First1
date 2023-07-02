package homep;

public class RatCat {

	public static void main(String[] args) {

		int rat = 2;
		int cat1 = 8;
		int cat2 = 5;
		
		int pocat1 = 0;
		int pocat2 = 0;
		
		if(rat< cat1) {
			pocat1=cat1-rat;
		}else{
			pocat1=rat-cat1;
		}
		
		if(rat<cat2) {
			pocat2=cat2-rat;
		}else {
			pocat2=rat-cat2;
		}
		
		if(pocat1<pocat2) {
			System.out.println("Cat1 will catch the rat");
		}else if(pocat1>pocat2) {
			System.out.println("Cat2 will catch the rat");
		}else if(pocat1==pocat2) {
			System.out.println(" rat will escape away");
		}
	}

}
