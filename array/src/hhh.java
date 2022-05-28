import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input
 
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
         */
        //Scanner
        Scanner s = new Scanner(System.in);
        int tc = Integer.parseInt(s.nextLine());                 // Reading input from STDIN
        for(int i=0;i<tc;i++){
            String []nm = s.nextLine().split(" ");
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);
            String []xy = s.nextLine().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            
            String []lm = s.nextLine().split(" ");
            int u = Integer.parseInt(lm[0]);
            int v = Integer.parseInt(lm[1]);
            
            if(x==1&&y==1){
                //case 1
                if((u&1)==1){
                    if(v==m){
                        if(u==n)
                        System.out.println("Over");
                        else
                        System.out.println("Back");
                    }
                    else{
                        System.out.println("Right");
                    }
                }
                else{
                    if(v==1){
                        if(u==n)
                        System.out.println("Over");
                        else
                        System.out.println("Back");
                    }else{
                        System.out.println("Left");
                    }
                }
            }
            if(x==1&&y==m){
                //case 1
                if((u&1)==1){
                    if(v==1){
                         if(u==n)
                         System.out.println("Over");
                         else
                         System.out.println("Back");
                    }
                    else{
                        System.out.println("Left");
                    }
                }
                else{
                    if(v==m){
                        if(u==n)
                         System.out.println("Over");
                         else
                         System.out.println("Back");
                    }else{
                        System.out.println("Right");
                    }
                }
            }
            if(x==n&&y==1){
                //case 1
                int t = n-u+1;
                if((t&1)==1){
                    //even row
                    if(v==m){
                        if(u==1)
                         System.out.println("Over");
                        else
                         System.out.println("Front");
                    }else{
                        System.out.println("Right");
                    }
                }
                else{
                    //odd row
                    if(v==1){
                         if(u==1)
                         System.out.println("Over");
                         else
                         System.out.println("Front");
                    }
                    else{
                        System.out.println("Left");
                    }
                }
            }
            if(x==n&&y==m){
                 int t = n-u+1;
                if((t&1)==1){
                    //even row
                    if(v==1){
                         if(u==1)
                         System.out.println("Over");
                         else
                         System.out.println("Front");
                    }else{
                        System.out.println("Left");
                    }
                }
                else{
                    //odd row
                    if(v==m){
                        if(u==1)
                        System.out.println("Over");
                        else
                        System.out.println("Front");
                    }
                    else{
                        System.out.println("Right");
                    }
                }
            }
            
            
            
            
        }
 
        
 
        // Write your code here
 
    }
}