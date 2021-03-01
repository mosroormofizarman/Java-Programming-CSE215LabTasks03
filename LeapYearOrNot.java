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
public class LeapYearOrNot {
    public static void main(String[] args) {
        boolean leapyear = false;
        
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        
        if(in%400==0){
           leapyear = true; 
        }
        else if(in%4==0 && in%100!=0){
            leapyear = true;
        }
        else{
            leapyear = false;
        }
        
        if(leapyear){
            System.out.println(in + " is a leap year.");
        }
        else{
            System.out.println(in + " is not a leap year.");
        }
    }
}
