import java.io.FileNotFoundException;

public class Application {
    public static void main(String[] args) {


        Test t = new Test();
        try {
            t.ReadFile();
        } catch (FileNotFoundException e) {
            System.out.println("Что - то произошло в глубинах кода");
        }


        Test2 t2 = new Test2();


        Test3 t3 = new Test3();
        t3.printArr();
    }
}

