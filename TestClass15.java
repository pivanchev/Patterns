/*
1        1
12      21
123    321
1234  4321
1234554321
 */
package patterns;

public class TestClass15{
    
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            
            for(int j=i*2;j<5*2;j++){
                System.out.print(" ");
            }
            
            for(int l=i;l>=1;l--){
                System.out.print(l);
            }
            
            System.out.println();
        }
    }
    
}