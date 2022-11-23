import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test2 {
    File file2 = new File("test2");

    {
        try {
            Scanner sc2 = new Scanner(file2);
        } catch (FileNotFoundException e) {
            System.err.println("Произошла ошибка! Файл не найден " + e.getMessage());
        }
    }
}
