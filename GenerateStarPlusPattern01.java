/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSE215LabTasks03;

/**
 *
 * @author ArMan
 */
public class GenerateStarPlusPattern01 {
    public static void main(String[] args){
        for(int i=0; i<5; i++){
            int k = (2*i)+1;
            if(i%2==0){
                for(int j=1; j<= k; j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j=1; j<=k; j++){
                    System.out.print("+");
                }
            }
            System.out.println();
        }
    }
}
