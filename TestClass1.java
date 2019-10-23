/*
* 
* * 
* * * 
* * * * 
* * * * * 
*/
package patterns;

public class TestClass1 {
    
    public static void main(String args[]){
       int i;
       int j;
       
       for(i=1;i<=5;i++){//rows
           for(j=1;j<=i;j++){//columns
               System.out.print("* ");
            }
           System.out.println("");
       }
    
    }
}