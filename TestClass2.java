/*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
*/
package patterns;


public class TestClass2 {
    public static void main(String args[]){
        int i;int j;
        
        for(i=1;i<=5;i++){//rows
           
        for(j=1;j<=i;j++){//columns
            if((i+j)%2==0)
                System.out.print("1 ");          
           else
                System.out.print("0 ");
            }
            System.out.println("");
        }
            
    }
} 


