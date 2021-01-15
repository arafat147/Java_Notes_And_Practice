package basicJava;

public class F_NestedClass {

	static String info = "This is nested class";
	int x = 25;
	int y = 30;
	
	public static void main(String[] args) {
		
		//from Tesla class:
		
		System.out.println(Tesla.battery);
		Tesla tl = new Tesla();
		tl.price = 15000;
		tl.teslaDislplay();
		//from Bmw class:
		
		Bmw bw = new Bmw();
		bw.carModel = "M-i 8";
		Bmw.carPrice = 90000;
		
		
		
	}
	
	public static class Tesla{
		
		static String battery = "Tesla has 2 batteries";
		int price = 10000;
		public void teslaDislplay() {
			System.out.println("Tesla has 12*12 Led display");
		}		
		
		}
		
		public static class Bmw{
			
			
			String carModel = "M5";
			static int carPrice = 80000;
		
		
	}
	
		
	
	
	
	

}
