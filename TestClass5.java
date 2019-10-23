/*
   1 
   1 1 
  1 2 1 
 1 3 3 1 
1 4 6 4 1 
 */
package patterns;


public class TestClass5 {
    
    public static void main(String args[]){
        
        for(int i=1;i<=10;i++){
            
            for(int j=10;j>i;j--){
                System.out.print(" ");
            }
            
            int temp=1;
            for(int k=1;k<=i;k++){
                System.out.print(temp + " ");
                temp=temp*(i-k)/(k);
           
            }
            System.out.println();
        }
        
    }  
}
