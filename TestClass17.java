/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;


public class TestClass17 {
    
    public static void main(String args[]){
        
        for(int i=1;i<=10;i++){
            
            for(int j=10;j>i;j--){
                
                System.out.print(" ");
                  
            }
            
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
        
    }
    
}
