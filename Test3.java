public class Test3 {

    public void printArr() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.exit(777);
        }

    }
}