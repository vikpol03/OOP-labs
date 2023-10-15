package org.example;

import java.util.Scanner;

public class TASK6 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of times to repeat the text: ");
        int timesToPrint = scanner.nextInt();
        for(int i = 0; i<timesToPrint;i++)
        {printText();}
        scanner.close();
}
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
