
public class Runner {

	public static void main(String[] args) {

		GeometricObject[]objarray=new GeometricObject[4];
		objarray[0]=new Rectangle(4,6);
		objarray[1]=new Circle(9);
		objarray[2]=new Rectangle(9,5);
		objarray[3]=new Circle(7);
		for(int i=0;i<4;i++) {
			System.out.println(objarray[i].toString());
		}
		
	}

}
