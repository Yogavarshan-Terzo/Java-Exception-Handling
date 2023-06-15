import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            var reader = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}