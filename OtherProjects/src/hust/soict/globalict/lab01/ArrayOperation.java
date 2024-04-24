package hust.soict.globalict.lab01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperation {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] m = new int[size];
        

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            m[i] = scanner.nextInt();
        }
       
        Arrays.sort(m);
        
        
        int sum = 0;
        
        for (int i = 0; i < m.length; i++) {
            sum += m[i];
        }
        double average = (double) sum / size;
        
        System.out.println("Sorted array: " + Arrays.toString(m));
        System.out.println("Sum of array: " + sum);
        System.out.println("Average value of array: " + average);
        
        scanner.close();
    }
}

