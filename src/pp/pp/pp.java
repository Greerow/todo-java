package pp.pp;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
public class pp {
    public static void main(String[] args) {
        Path p = Path.of("note.txt");

        // Строка, которую нужно записать в файл
        String text = "Сегодня отличный день!";

        try {
            Files.writeString(p, text, StandardCharsets.UTF_8);
            System.out.println("Файл успешно записан!");
        } catch (IOException e) {
            System.out.println("Ошибка при записи файла: " + e.getMessage());
        }
    }
}
