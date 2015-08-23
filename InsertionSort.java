import java.io.*;
import java.util.*;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arLength = scan.nextInt();
        int[] ar = new int[arLength];
        for (int i = 0; i < arLength; i++) {
            ar[i] = scan.nextInt();
        }
        insertionSort(ar);
    }
    
    //Insertion sort algorithm to order ints from least to greatest
    public static void insertionSort(int[] ar) {
        for (int i = 1; i < ar.length; i++) {
            //If the element i is in the correct order
            if (ar[i] >= ar[i - 1]) {
                printArr(ar);
            //If the element i is less than the one to the left
            } else {
                //Use insertion sort algorithm
                int V = ar[i];
                for (int j = i; j > 0; j--) {
                    if (ar[j] < ar[j - 1]) {
                        ar[j] = ar[j - 1];
                        ar[j - 1] = V;
                    }
                    //Special case for j = 1 and need to change to 0 ind
                    if (j == 1 && ar[j] < ar[j - 1]) {
                        ar[j] = ar[j - 1];
                        ar[0] = V;
                    }
                }
                printArr(ar);
            }
        }
    }
    
    public static void printArr(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println("");
    }
}