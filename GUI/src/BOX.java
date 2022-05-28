import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BOX {

	public static void main(String[] args) {
		Adition a = new Adition();
		
	}	
}
	class Adition extends Frame implements ActionListener{
		JTextField t1;
		JTextField t2;
		JButton bu;
		JLabel L;
		public Adition(){
		
			JPanel p = new JPanel();
			JPanel q = new JPanel();
			JPanel r = new JPanel();
			JPanel s = new JPanel();
			t1=new JTextField(30);
			t2=new JTextField(30);
			bu = new JButton("Add");
			L=new JLabel("result");
			p.add(t1);
			q.add(t2);
			r.add(bu);
			s.add(L);
			this.add(p);
			this.add(q);
			this.add(r);
			this.add(s);
			bu.addActionListener(this);
			setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
			setVisible(true);
			setSize(350,200);
		}
		public void actionPerformed(ActionEvent e) {
			int num1= Integer.parseInt(t1.getText());
			int num2= Integer.parseInt(t2.getText());
			int num3=num1+num2;
			L.setText(num3+"");
			
		}
	}
