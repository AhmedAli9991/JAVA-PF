
public class Rectangle extends GeometricObject {
	private int length;
	private int width;
	private int Area;
	
	public Rectangle(int w,int l) {
		width=w;
		length=l;
	}
	@Override
	public void calcarea() {
		Area=length*width;
	}
	@Override
	public String toString()
	{	calcarea();
		return "rectangle with width "+width+" height "+length+" is drawn"+" Area is "+ Area;
		
	}
}
