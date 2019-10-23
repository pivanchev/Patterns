/*    
        1
      1 2
    1 2 3
  1 2 3 4
1 2 3 4 5 
 */
package patterns;


public class TestClass4 {
    
    public static void main(String args[]){
        for(int i=0;i<=5;i++)
        {
            for(int k=6;k>=i;k--){
                System.out.print("  ");
            }
                
            
            for(int j=1;j<=i;j++)
            {
                System.out.print(j + " ");
            
        }
        System.out.println(" ");
    }
    } 
}
    