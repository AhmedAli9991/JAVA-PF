
import java.util.*;
//Ahmed Ali(SP19-BCS-95)&&Agha Muhmmad Wasiq Khan(SP19-BCS-094)

public class Assingment4Pf {
	
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number of rows");
        int row = input.nextInt();
        System.out.println("Enter number of columns");
        int colomn = input.nextInt();
        
        int R1 = 0;
        int C1 = 0;
        int R2 = 0;
        int C2 = 0;
        
        while(true){
            if((row >= 2 && row <= 15) && (colomn >= 2 && colomn <= 15)){
                break;
            }
            else{
                System.out.println("Enter number of rows");
                row = input.nextInt();

                System.out.println("Enter number of columns");
                colomn = input.nextInt();
            }
        }
        
        char[][] arr = new char[row][colomn];
        char[][] ans = new char[row][colomn];
        
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < colomn; j++){
                arr[i][j] = input.next().charAt(0);
            }
        }
        for(int i = 0; i < row; i++){
            for(int j = 0; j < colomn; j++){
                if(arr[i][j] == 'R'){
                    ans[i][j] = arr[i][j];
                }
                else{
                    ans[i][j] = '0';
                }
            }
        }
        
        for(int i = 0; i < row; i++){
            System.out.println();
            for(int j = 0; j < colomn; j++){
                System.out.print(ans[i][j]+ " ");
            }
        }
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < colomn; j++){
                if(ans[i][j] == 'R'){
                    C1 = C1 + 1;
                }
            }
            if(C1 > C2){
                    C2 = C1;
                }
                C1 = 0;
            }
        
        C2 --;
        System.out.println(" ");
        System.out.println(C2);
        
        for(int i = 0; i < colomn; i++){
            for(int j = 0; j < row; j++){
                if(ans[j][i] == 'R'){
                    R1 = R1 + 1;
                }
            }
            if(R1 > R2){
                    R2 = R1;
                }
            R1 = 0;
        }
        
        R2 --;
        System.out.println(R2);
    }
}