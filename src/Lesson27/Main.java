package Lesson27;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        String a = " Hi how are u";

        try (OutputStream os = new FileOutputStream("newFile.txt");
             ObjectOutputStream oos = new ObjectOutputStream(os)) {
            oos.writeObject(a);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (InputStream is = new FileInputStream("newFile.txt");
             ObjectInputStream ois = new ObjectInputStream(is)) {
             String b = a;
            System.out.println(a);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
