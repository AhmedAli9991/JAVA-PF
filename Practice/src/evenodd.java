import javax.swing.JOptionPane;;

public class evenodd {

	public static void main(String[] args) {
		String Number = JOptionPane.showInputDialog("Enter a number");
		int num = Integer.parseInt(Number);
		
		if (num%2==0) {
			JOptionPane.showMessageDialog(null, "It is even");
		}
		else {
			JOptionPane.showMessageDialog(null,"It is odd");
		}
	}
}
