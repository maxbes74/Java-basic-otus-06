import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public void ReadFile() throws FileNotFoundException {
        File file = new File("test");
        Scanner sc = new Scanner(file);
    }

}

