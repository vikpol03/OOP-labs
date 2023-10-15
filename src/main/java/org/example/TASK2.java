/* TASK #2 */

package org.example;

import java.util.Scanner;

public class TASK2 {

    public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int sum=0;
            int read=0;
            while(read<3){
                System.out.print("Enter a number: ");
                sum+=scan.nextInt();
                read++;
            }
            System.out.println("Sum"+sum);


        }

}
