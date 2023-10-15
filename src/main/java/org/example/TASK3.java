/* TASK #3 */

package org.example;

import java.util.Scanner;

public class TASK3 {

    public static void main(String[] args) {

            Scanner scan=new Scanner(System.in);
            int num=0;
            int sum=0;
            while(true){
                System.out.print("Enter a number: ");
                num=scan.nextInt();
                if(num==0){
                    break;
                }else{
                    sum+=num;
                }
            }
            System.out.println(sum);


    }
}
