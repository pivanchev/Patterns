/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;


public class TestClass10 {
    
    public static void main(String args[]){
        
        for(int i=1;i<=7;i++){
            
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            
            int temp=1;
            for(int k=1;k<=7-i+1;k++){
                
                System.out.print(temp + " ");
                temp=temp*2;
                
                
            }
            System.out.println();
        }
    }
    
}
