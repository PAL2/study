package lesson2;

public class Task13 {

	public static void main(String[] args) {
		double x;
		double y;
		for (x=-4; x <=4; x += 0.5){
			y = 2*(x*x)-5*x-8;
			System.out.println("x=" + x + ", y=" + y);
		}

	}

}
