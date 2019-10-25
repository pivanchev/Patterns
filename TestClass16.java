/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

public class TestClass16 {
    
 public static void main(String args[]){
        for(int i=5;i>=1;i--){
            
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            
            for(int j=i*2;j<5*2-1;j++){
                System.out.print(" ");
            }
            
            for(int l=i;l>=1;l--){
                if(l!=5)
                    System.out.print(l);    
            }
            
            System.out.println();
    
        }
 }
}