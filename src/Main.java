import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            var reader = new FileReader("file.txt");
            var value = reader.read();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e){
            System.out.println("Could not read input");        }
    }
}