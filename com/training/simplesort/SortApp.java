import java.io.*;
import java.util.*;

class SortApp {

    public static void main(String args[]) {
        int arraySize;
        System.out.println("# Please input size of array: ");
        Scanner sc = new Scanner(System.in);
        try {
            arraySize = sc.nextInt();
            MyArray a = new MyArray(arraySize);
            a.fillIn();
            System.out.println("# Unsorted ");
            a.printArray();

            System.out.println("# Choose type of sort: ");
            System.out.println("  1 - Bubble sort");
            System.out.println("  2 - Selection sort");
            System.out.println("  3 - Insertion sort");

            int number = sc.nextInt();
            switch (number) {
                case (1):
                    a.bubbleSort();
                    break;
                case (2):
                    a.selectionSort();
                    break;
                case (3):
                    a.insertionSort();
                    break;
                default:
                    System.out.println("# Wrong input");
            }

            System.out.println("# Sorted ");
            a.printArray();
        } catch (InputMismatchException eX) {
            System.out.println("# Wrong input");
        }


    }
}