package Task_01_TextFile;

import java.io.*;
import java.nio.file.*;

/*
Задача 1.
Создать объект  класса Текстовый файл, используя классы Файл, Директория.
Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
Переменные: text - содержание текстового файла, filePath - адрес текстового файла, myFile - файл (заготовка)
 */
public class TextFile {
    private String text;
    private MyFile myFile;

    public TextFile(String text, MyFile myFile) {
        this.text = text;
        this.myFile = myFile;
    }

    //создание текстового файла
    public Path createTextFile() {
        try {
            return Files.writeString(myFile.getFilePath(), text);
        } catch (Exception e) {
            System.out.println("Текстовый файл не создан: " + e);
            return null;
        }
    }

    //переименование файла
    public void renameFile(String newName) {
        File original = myFile.getFilePath().toFile();
        File newFile = null;
        try {
            newFile = myFile.getDirectory().getPath().resolve(newName + '.' + myFile.getType()).toFile();
        } catch (InvalidPathException e) {
            System.out.println("Новое имя файла введено некорректно: " + e);
        }
        //проверка переименования файла
        try {
            if (original.exists() && original.isFile() && original.canWrite()) {
                if (original.renameTo(newFile)) {
                    System.out.println("Файл переименован успешно.");
                    myFile.setFilePath(newFile.toPath());
                    myFile.setName(newName);
                } else {
                    System.out.println("Файл не переименован.");
                }
            } else {
                System.out.println("Файл не переименован.");
            }
        } catch (NullPointerException e) {
            System.out.println("Файл не переименован: " + e);
        }
    }

    //вывод в консоль содержимого текстового файла
    public void printTextFile() {
        StringBuilder text = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(myFile.getFilePath().toString()))) {
            String str = reader.readLine();
            while (str != null) {
                text.append(str);
                text.append(System.lineSeparator());
                str = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка вывода файла в консоль: " + e);
        }
        System.out.println("Содержимое файла \"" + myFile.getFilePath().toString() + "\":\n" + text.toString());
    }

    //добавление текста в существующий текстовый файл
    public void addText(String textAdd) {
        try {
            Path filePath = Files.writeString(myFile.getFilePath(), textAdd, StandardOpenOption.APPEND);
            myFile.setFilePath(filePath);
            System.out.println("Текст успешно добавлен в файл \"" + myFile.getName() + '.' + myFile.getType() + "\".");
        } catch (NullPointerException | IOException e) {
            System.out.println("Текст не добавлен в файл: " + e);
        }
    }

    //удаление содерживого файла текстового файла
    public void deleteText() {
        try {
            Path filePath = Files.writeString(myFile.getFilePath(), "");
            myFile.setFilePath(filePath);
            System.out.println("Содерживое файла \"" + myFile.getName() + '.' + myFile.getType() + "\" успешно удалено.");
        } catch (NullPointerException | IOException e) {
            System.out.println("Ошибка удаления содержимого файла: " + e);
        }
    }

    //удаление текстового файла
    public void deleteFile() {
        File file = myFile.getFilePath().toFile();
        String nameFile = myFile.getName() + '.' + myFile.getType();
        if (file.delete()) {
            System.out.println("Файл \"" + nameFile + "\" успешно удален.");
        } else {
            System.out.println("Файл \"" + nameFile + "\" не обнаружен.");
        }
    }
}
