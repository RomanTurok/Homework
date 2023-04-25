package Lesson28;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            Files.writeString(Paths.get("test.txt"), "* Hello how are u *");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            Files.readAllLines(Path.of("test.txt")).forEach(System.out :: println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
