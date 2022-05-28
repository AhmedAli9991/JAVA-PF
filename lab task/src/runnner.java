
public class runnner {
	public static void main(String[] args) {
		PhoneBook pb= new PhoneBook();
		pb.addContact("aa","34234","234");
		pb.addContact("bb","34234","234","sda");
		pb.displayContacts();
		System.out.println();
		System.out.println();
		pb.delContact("aa");
		pb.displayContacts();
		System.out.println();
		System.out.println();
		pb.searchContact("9898");
		MyMath mm=new MyMath();
		System.out.println(mm.getMin(2,12,3));
		mm.getMin(2,12,3);
		mm.getMin(2,12);
		MyMath.getMax(2, 1);
		mm.getMax(2,12,3);
		mm.qSolve(2,12,3);
		mm.count();
	}
}
