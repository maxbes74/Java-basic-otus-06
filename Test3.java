import java.util.Arrays;

public class Test3 {

    public void printArr() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            System.out.println("Вывод  элемента n = " + arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Длина массива = " + arr.length);
            System.out.println("Массив = " + Arrays.toString(arr));

        }

    }
}