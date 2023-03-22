package Lesson20;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> word1 = new HashMap<>();
        word1.put("Сніг" , "Eng - Snow; Ger - Schee; Jap - 雪;");
        word1.put("Вода" , "Eng - Water; Ger - Wasser; Jap - 水;");
        word1.put("Автомобіль" , "Eng - Car; Ger - Machine; Jap - マシーン;");
        word1.put("Хліб" , "Eng - Bread ; Ger - Brot; Jap - パン;");
        word1.put("Сумка" , "Eng - Bag; Ger - Tasche; Jap - バッグ;");
        word1.put("Гроші" , "Eng - Money; Ger - Geld; Jap - お金;");
        word1.put("Куртка" , "Eng - Jacket; Ger - Jacke; Jap - ジャケット;");
        word1.put("Цибуля" , "Eng - Onion; Ger - Zwiebel; Jap - タマネギ;");
        word1.put("Вітер" , "Eng - Wind; Ger - Wind; Jap - 風;");
        word1.put("Стіл" , "Eng - Table; Ger - Tisch; Jap - テーブル;");


        System.out.println(word1.get("Сніг"));


        Map<String, List<String>> word2 = new HashMap<>();
        word2.put(" Stil ", List.of(" Eng - Table; ", "Ger - Tisch; ", "Jap - テーブル; " ) );
        System.out.println(word2);



    }

}
