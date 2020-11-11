
public class Main {

	public static void main(String[] args) {
		Volvo240 v = new Volvo240();
		
		v.incrementSpeed(2);
		
		System.out.println(v.getPos());


		System.out.println(v.getCurrentSpeed());

		v.move();
		System.out.println(v.getPos());
		
		v.turnLeft();
		System.out.println(v.getDirection());
		
		Saab95 s = new Saab95(); 
		
	
		System.out.println(s.getDirection());

		// System.out.println(v.getPos());
		// System.out.println(v.getDirection());
		
	
		

	}
}
