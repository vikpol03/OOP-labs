package org.example;

public class TASK8 {

    public static void main(String[] args) {
    int numRows1 = 5;
    int numRows2 = 10;
    drawStarsPiramid(numRows1);
        System.out.println();
    drawStarsPiramid(numRows2);
}
public static void drawStarsPiramid(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
