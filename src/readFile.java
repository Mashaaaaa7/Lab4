import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readFile {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("src\\input.txt"))) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

    }

}