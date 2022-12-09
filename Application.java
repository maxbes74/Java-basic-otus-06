import java.io.FileNotFoundException;
import java.io.FileReader;

public class Application {
    public static void main(String[] args) {

        try (FileReader fileReader = new FileReader("test3.txt")) {
            System.out.println("Ок");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Test t = new Test();
        try {
            t.ReadFile();
        } catch (FileNotFoundException e) {
            System.err.println("Что - то произошло в глубинах кода");
        }

        Test2 t2 = new Test2();

        Test3 t3 = new Test3();
        t3.printArr();

        Test4 t4 = new Test4();
        try {
            t4.setDiameter(0);
        } catch (DiameterException e) {
            e.printStackTrace();
        }
    }
}