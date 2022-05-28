import java.util.Random;

public class Runner {

	public static void main(String[] args) {
		final int nRooms = 10;
		Random rand=new Random();
		Adress[]add=new Adress[nRooms];
		int[]cap=new int[nRooms];
		int[]ch=new int[nRooms];
		for(int i=0;i<nRooms;i++) {
			int y=rand.nextInt(10);
			cap[i]=4;
			ch[i]=y;
			for(int j=0;j<10;j++) {
				if(ch[j]==y)
					cap[j]--;
			}
		}
		for(int i=10;i<nRooms;i++) {
			for(int j=0;j<10;j++) {
				if(ch[i]==ch[j]) {
					cap[j]=cap[i];
				}
			}
		}
		Student stu = new Student("Ahmed","22312","6",ch[1]+"",cap[1]);
		stu.print();
		
	}

}
