/* TASK #1 */

package org.example;

/* TASK #1 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true){
            System.out.println("Enter a password:");
            String pass=scan.nextLine();

            if(pass.equals("Carrot")){

                System.out.println("The secret is: There is no secret!");
                break;
            }else{
                System.out.println("Wrong, please try again!!");
                continue;

            }

        }


    }
}