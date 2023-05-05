import java.util.Arrays;
import java.util.Scanner;

public class Problem {
 public static void selectionSort(int[] array) {
             int minIndex, temp, n = array.length;
             for (int i = 0; i < n - 1; i++) {
                 minIndex = i;
                 for (int j = i + 1; j < n; j++) {
                     if (array[j] < array[minIndex]) {
                         minIndex = j;
                     }
                 }
                 temp = array[minIndex];
                 array[minIndex] = array[i];
                 array[i] = temp;
            }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

             int n = sc.nextInt();
             int[] array = new int[n];

             for (int i = 0; i < n; i++) {
                 array[i] = sc.nextInt();
             }

             selectionSort(array);
             System.out.print("[");
             for (int i = 0; i < n - 1; i++) { System.out.print(array[i] + ", ");}
             System.out.println(array[n - 1] + "]"); 
  }
}