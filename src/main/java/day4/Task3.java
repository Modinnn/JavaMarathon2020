package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random r = new Random();
        int m = 12;
        int n = 8;
        int[][] array = new int[m][n];
        int sumMax = 0;
        int lineNumberMax = 0;

        for (int i = 0; i < m; i++) {
            int sumCurrentLine = 0;
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = r.nextInt(50);
                sumCurrentLine += array[i][j];
            }
            if (sumCurrentLine > sumMax) {
                sumMax = sumCurrentLine;
                lineNumberMax = i;
            }
        }
        System.out.println(lineNumberMax);
    }
}
