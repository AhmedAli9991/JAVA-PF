import javax.swing.JOptionPane;

public class dialogbox {

	public static void main(String[] args) {
		
		String amount1 = JOptionPane.showInputDialog("Enter amount of money");
		int amount = Integer.parseInt(amount1);
		int num1 = amount/5000;
		int amount2 = amount-(num1*5000);
		int num2 = amount2/1000;
		int amount3 = amount2-(num2*1000);
		int num3  = amount3/500;
		int amount4 = amount3-(num3*500);
		int num4  = amount4/100;
		int amount5 = amount4-(num4*100);
		int num5 = amount5/50;
		int amount6 = amount5-(num5*50);
		int num6 = amount6/20;
		int amount7 = amount6-(num6*20);
		int num7 = amount7/10;
		int amount8 = amount7-(num7*10);
		JOptionPane.showMessageDialog(null, "number of 5000's "+num1+" number of 1000's "+num2+
				" number of 500's "+num3+" number of 100's "+num4+" number of 50's "
				+num5+" number of 20's "+num6+" number10's "+num7+" amount in coins "+amount8);
	}
}
