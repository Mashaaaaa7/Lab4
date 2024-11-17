import java.io.FileWriter;
import java.io.IOException;

public class CustomAgeException extends Exception { //Exception-исключение
    public CustomAgeException(String message) {
        super(message);//принимает строку message, которую использует для сообщения об ошибке.
    }
}

class CheckAge {

    public static void main(String[] args) {
        int age = 1100;

        try {
            checkAge(age);
            System.out.println("Возраст корректен");
        } catch (CustomAgeException e) {
            System.err.println("Ошибка: " + e.getMessage());
            logException(e); // пишет исключения в файл
        }
    }

    private static void checkAge(int age) throws CustomAgeException { //метод, который проверяет возраст throw-бросить
        if (age < 0 || age > 120) {
            throw new CustomAgeException("Недопустимый возраст: " + age);
        }
    }

    private static void logException(Exception e) {
        try (FileWriter writer = new FileWriter("error.log", true)) { // открываем файл для записи
            writer.write(e.getMessage() + "\n"); // записываем сообщение об ошибке
        } catch (IOException ex) {
            System.err.println("Ошибка при записи в файл: " + ex.getMessage());
        }
    }
}