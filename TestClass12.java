/*
5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
 */
package patterns;

public class TestClass12 {
    
    public static void main(String args[]){
        
        for(int i=1;i<=5;i++){
            
            for(int j=5;j>=i;j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        
        for(int i=1;i<=5;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            
            System.out.println();
            
        }
        
        
        
        
    }
    
}
