
public class Circle extends GeometricObject {
	private int radius;
	private double Area;
	
	public Circle(int r) {
		radius=r;
	}
	@Override
	public void calcarea() {
		Area=pi*(radius*radius);
	}
	@Override
	public String toString()
	{
		calcarea();
		return "circle with radius "+radius+" is drawn"+" Area is "+ Area;
		
	}
}
