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
public class NumberRangeAndDivisibleByAnyNumberDescendingOrder01 {
    public static void main(String[] args) {
        int i = 150;
        while (i > 100) {
            if (i % 8 == 0) {
                System.out.print(i + " ");
            }
            i--;
        }
    }
}
