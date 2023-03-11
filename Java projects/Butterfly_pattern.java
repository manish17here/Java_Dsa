import java.util.Scanner;
public class Butterfly_pattern {
    public static void main(String[] args) {
        int n=4;
        //for top quarter of left side
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
              

            }
            // for top spaces in left side 
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            // for top spaces in right side
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            // for top right corner stars

            for(int rt=1;rt<=i;rt++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print("*");
            }

             // for bottom spaces in left side 
             for(int k=2;k<=i;k++){
                System.out.print(" ");
            }
            

            // for the spaces of right side bottom

            for(int k=2;k<=i;k++){
                System.out.print(" ");
            }
             // for bottom right corner stars
             for(int rb=n;rb>=i;rb--){
                System.out.print("*");
            }


           

            
            System.out.println();
        }
      

        
       
     
        
      
    }
    
}

// Manish Deshpande 
