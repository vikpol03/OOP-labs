/* TASK #4 */

package org.example;

import java.util.Scanner;

public class TASK4 {

    public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.print("Enter a number: ");
            int first=scan.nextInt();
            int last=scan.nextInt();
            while(first<=last){

                System.out.println(first);
                first++;

            }

    }
}
