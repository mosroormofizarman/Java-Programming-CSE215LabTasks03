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
import java.util.Scanner;
public class GenerateARandomIntegerBetweenMinAndMaxRange01 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.print("Random integer: ");
       int in = input.nextInt();
       
       for(int i=0; i<=in; i++){
           System.out.print(i + " ");
       }
    }
    
}
