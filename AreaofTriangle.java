package oops;

	class Triangle {
		void Area(double base, double height, int i) {
			double area = 0.5 * base * height;
			System.out.println("Base: "+ base);
			System.out.println("Height: " + height);
			System.out.println("Area of the Triangle: " + area);
		}
	}
public class AreaofTriangle{
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.Area(10.0, 5.0, 0);
	}
}
