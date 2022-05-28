import javax.swing.JOptionPane;

public class BMI {

	public static void main(String[] args) {
		
		String weight = JOptionPane.showInputDialog("please enter weight");
		String h1 = JOptionPane.showInputDialog("enter number of feet");
		String h2 = JOptionPane.showInputDialog("enter number of inches");
		int W = Integer.parseInt(weight); 
		int height1 = Integer.parseInt(h1);
		int height2 = Integer.parseInt(h2);
		int H1 = height1*12;
		int H2 = H1+height2;
		double height_in_meters = H2*0.0254;
		double BMI = W/(height_in_meters*height_in_meters);
		if (BMI>25) {
			if(BMI>30) {JOptionPane.showMessageDialog(null, "You are obeese");
			}
			else {
				JOptionPane.showMessageDialog(null, "You are over weight");
			}
		}
		else if (BMI<=25 & BMI>=18.5) 
				JOptionPane.showMessageDialog(null, "You are healthy");
		else 
				JOptionPane.showMessageDialog(null, "You are underweight");
			
			
		
		
	}

}
