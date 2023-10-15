package org.example;

public class TASK9 {

    public static void main(String[] args) {
    int Row1 = 5;
    int Row2 = 10;

    drawNumbersPiramid(Row1);
    System.out.println();
    drawNumbersPiramid(Row2);
}
public static void drawNumbersPiramid(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
