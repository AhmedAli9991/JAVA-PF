//madeby AhmedAli(SP19-BCS-096)&&Agha Muhammad Wasiq khan(SP19-BCS-094) 

import java.util.Scanner;

public class Question1 {
        public static void main(String[]args){
        int [][]micro;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of test cases: ");
        int test_cases = input.nextInt();
        for(int i=0;i<test_cases;i++ ){
            int S1;
            int S2;
            System.out.print("Eneter Number of rows: ");
            int rows = input.nextInt();
            System.out.print("Enter Number of colums: ");
            int columns = input.nextInt();
            micro = new int[rows][columns];
            while(true){
            System.out.print("Enter S1 coordinate of the corner from where distribution starts: ");
            S1 = input.nextInt();
            System.out.print("Enter S2 coordinate of the corner from where distribution starts: ");
            S2 = input.nextInt();
            if(S1==rows&&2==columns||S1==1&&S2==1||S1==1&&S2==columns||S1==rows&&S1==rows){
                break;
                }
            }
            System.out.print("Enter Micros's Row: ");
            int m1 = input.nextInt();
            System.out.print("Enter Micros's coloumn: ");
            int m2 = input.nextInt();
            int M1 = m1-1;
            int M2 = m2-1;
            int j = S1-1; 
            int k = S2-1; 
            int x = 1;
            try {
            while(x==1){
                if(k==0&&k<micro[0].length){
                	micro[j][k]=1;
                	while(k<micro[0].length){
                		k++;
                		micro[j][k]=1;
                        if(micro[M1][M2]==1){
                            System.out.println("Right");
                        	x=0;
                            break;
                        }
                    }
                }
                if(micro[M1][M2]==1){break;}
                else if(k==columns-1) {
                	micro[j][k]=1;
                	while(k>=0) {
                		k--;
                		micro[j][k]=1;
                        if(micro[M1][M2]==1){
                            System.out.println("Left");
                        	x=0;
                            break;
                        }
                	}
                }if(micro[M1][M2]==1){break;}
                if(j==0) {
            		micro[j][k]=1;
                    int c = 0;
                	while(c==0) {
                        k++;
                		micro[j][k]=1;    
                        c=1;
                        if(micro[M1][M2]==1){
                            System.out.println("Front");
                        	x=0;
                            break;
                        }
                        
                	}
                }if(micro[M1][M2]==1){break;}
                if(k==rows-1) {
                	micro[j][k]=1;
                    int c = 0;
                	while(c==0) {
                		k--;
                		micro[j][k]=1;
                        c=1;
                        if(micro[M1][M2]==1){
                            System.out.println("Back");
                        	x=0;
                            break;
                        }
                	}
                }if(micro[M1][M2]==1){break;}
                if(micro[M1+1][M2+1]==1&&micro[M1-1][M2-1]==1&&micro[M1+1][M2]==1&&micro[M1-1][M2]==1&&micro[M1][M2+1]==1&&micro[M1][M2+1]==1){
                	System.out.println("Over");
                	break;
                }
            }
        }catch(IndexOutOfBoundsException ex) {
        	System.out.println("Over");
        	}
        }
        
    }
}
