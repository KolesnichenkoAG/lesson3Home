package lesson3version1;
import java.util.Arrays;
public class Lesson3version1 {
    public static void main(String[] args) {
        System.out.println("Lesson 3 version 1");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("arr.length: " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
        int[] arr2 = new int[100];
        for (int i = 0; i < 100; i++) {
            arr2[i] = i;
            System.out.println("arr2[" + i + "] = " + arr2[i]);
        }
        int[] srarr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < srarr.length; i++) {
            if (srarr[i] < 6) {
                srarr[i] = srarr[i] * 2;
            }
            System.out.print(srarr[i] + " ");
            } System.out.println("");
        int[][] table = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
            if (i == j){
            table [i][j] = 1;
            System.out.print("1 ");
            } else if(i + j == 7){
                table [i][j] = 1;
                System.out.print("1 ");
            }
            else {
            System.out.print(table[i][j] + " ");
            }
            }
            System.out.println();
        }
    }
}

