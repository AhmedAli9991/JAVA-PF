import java.io.*;
import java.util.*;
import javax.swing.*; 
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class filing {
	  public static void main(String[] args) {
int[][]list1=new int[4][4];
int c1=1;
int c2=1;
int m1=1;
int m2=2;
if(c1==1&&c2==1) {
	for(int i=0;i<4;i+=2) {
		for(int j=0;j<5;j++) {
			if(i==m1&&j==m2&&m2==3&&m1!=3) {
				System.out.println("down ");	
			}
			if(i==m1&&j==m2&&m2!=3) {
				System.out.println("right ");	
			}
		}	
	}	
	for(int i=1;i<5;i+=2) {
		for(int j=3;j>=0;j--) {
			if(i==m1&&j==m2&&m2==0&&m1!=3) {
				System.out.println("down ");
			}
			if(i==m1&&j==m2&&m2!=0) {
				System.out.println("left ");	
			}
		}
		}
}
}
}
