package Task_01_TextFile;

import java.lang.constant.DynamicCallSiteDesc;

/*
Задача 1.
Создать объект  класса Текстовый файл, используя классы Файл, Директория.
Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */
public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory("data/temp");
        MyFile myFile = new MyFile("text", "txt", directory);
        TextFile textFile = new TextFile(text, myFile);
        textFile.createTextFile();
        textFile.renameFile("Янка Купала - Хто ты гэткi");
        textFile.printTextFile();
        textFile.addText(textAdd);
        textFile.deleteText();
        textFile.deleteFile();
    }

    static String text = "Хто ты гэткі?\n" +
            "— Свой, тутэйшы.\n" +
            "Чаго хочаш?\n" +
            "— Долі лепшай.\n" +
            "Якой долі?\n" +
            "— Хлеба, солі.\n";
    static String textAdd = "А што болей?\n" +
            "— Зямлі, волі.\n" +
            "Дзе радзіўся?\n" +
            "— Ў сваёй вёсцы.\n" +
            "Дзе хрысціўся?\n" +
            "—  ры дарожцы.\n" +
            "Чым асвенчан?\n" +
            "—  роўю, потам.\n" +
            "Чым быць хочаш?\n" +
            "—  Не быць скотам.\n";
}
