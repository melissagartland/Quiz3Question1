package MainPackage;

public class Triangle {
	private int base;
	private int height;
	private int side3;
	
	Triangle tri = new Triangle();
	public Triangle() {

	}
	Triangle(int base, int height, int side3){
		this.base = base;
		this.height = height;
		this.side3 = side3;
	}
	public int getArea(int base, int height){
		int area = (1/2)*base*height;
		return area; 
	}
	public int getPerim(int base, int height, int side3){
		int perim = base + height + side3;
		return perim;
	}
	public String toString(String Description){
		Description = "The triangle has three sides";
		return Description;
	}
}
