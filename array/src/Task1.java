
import java.util.Scanner;

public class Task1 {
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
            if(S1==rows||S1==1||S2==1||S2==columns){
                break;
                }
            }
            System.out.print("Enter Micros's Row: ");
            int m1 = input.nextInt();
            System.out.print("Enter Micros's coloumn: ");
            int m2 = input.nextInt();
            int M1=m1-1;
            int M2=m2-1;
            int j=S1-1;
            int k=S2-1;
            int a=0;
            int b=0;
            int c=0;
            int d=0;
            int x=0;
            while(x==0){
            if(j<micro[j].length-1){
                    if(micro[j+1][k]==0){
                        while(j<micro[0].length-1){
                            micro[j][k]=1;
                            j++;
                            if(micro[M1][M2]==1){
                                System.out.println("Rigth");
                                x=1;
                                break;
                                }
                            }
                        a=1;
                        
                        }
                }
                else if(j>0){
                    if(micro[j-1][k]==0){
                        while(j>=0){
                            micro[j][k]=1;
                            j--;
                            if(micro[M1][M2]==1){
                                System.out.println("Left");
                                x=1;
                                break;
                            }
                    }
                        b=1;
                }
                }
                else if(k==micro.length-1){
                    if(micro[j][k+1]==0){
                        while(j<micro.length-1){
                            micro[j][k]=1;
                            k++;
                            if(micro[M1][M2]==1){
                                System.out.println("Front");
                                x=1;
                                break;
                            }
                    }
                        c=1;
                }
                }
                else if(k>0){
                    if(micro[j][k-1]==0){
                        while(k>=0){
                            micro[j][k]=1;
                            k--;
                            if(micro[M1][M2]==1){
                                System.out.println("Back");
                                x=1;
                                break;
                            }
            
                        }
                        d=1;
                    }
                }
            }
                if(a==1&&b==1&&c==1&&d==1)
                    System.out.println("Over");
        }
    }
    
}
