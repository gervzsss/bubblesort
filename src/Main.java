import java.util.Scanner;

public class Main {

    public static void ascendingSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1)
            System.out.print(", ");
        }
        System.out.print("]");
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int[] array = new int[5];

        System.out.println("Enter five numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        ascendingSort(array);
        
        printArray(array);

        scan.close();
    }
}
