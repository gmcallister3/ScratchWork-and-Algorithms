import java.io.*;
import java.util.*;

public class QuicksortPartition {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        partition(array);
    }
    
    
    public static void partition(int[] array) {
        int p = array[0];
        ArrayList<Integer> lower = new ArrayList<>();
        ArrayList<Integer> upper = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > p) {
                upper.add(array[i]);
            } else if (array[i] < p) {
                lower.add(array[i]);
            }
        }
        int[] outArr = new int[array.length];
        for (int i = 0; i < upper.size(); i++) {
            outArr[lower.size() + 1 + i] = upper.get(i);
        }
        for (int i = 0; i < lower.size(); i++) {
            outArr[i] = lower.get(i);
        }
        outArr[lower.size()] = p;
        
        printArr(outArr);
    }
    
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}