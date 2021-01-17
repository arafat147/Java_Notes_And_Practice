package javaMentoring;

public class Nested_Class_Mentoring {//top level class:
	
	public static void main(String[] args) {
		
		System.out.println(Acura.display);
		
		Acura ac = new Acura();
		ac.acuraEngine();
		
		Acura.Honda ah = new Acura.Honda();
		System.out.println(ah.wheelSize);
		
	}
	
	
	
	

	public static class Acura{
		
		static String display = "10 inch display";
		public void acuraEngine() {
			System.out.println("acura will have V8 engine");
		}
		
		public static void main(String[] args) {
			
			Honda.wheelWidth = 255.75;
			System.out.println(Honda.wheelWidth);
			
		}
		
		public static class Honda{
			
			String engine = "v6";
			int wheelSize = 21;
			
			static double wheelWidth = 235.55;
			
			
			
		}
		
		
		
	}
	
	
	
}
