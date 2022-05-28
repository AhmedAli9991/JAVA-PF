import java.util.Random;

public class Runner {

	public static void main(String[] args) {
		Address[]arr = new Address[10];
		Random rand=new Random();
		int[]check=new int[10];
	
		for(int i=0;i<10;i++) {
			int y=rand.nextInt(1000);
			for(int j=0;j<10;j++){
				while(y==check[j]){
					 y=rand.nextInt(1000);		
				}
			}
			String a=400+"";
			String b=y+"";
			arr[i]=new Address(a,b);		
		}
		int x=rand.nextInt(10);
		arr[x].print();
	}

}
