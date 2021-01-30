package Task_01_TextFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;

/*
Задача 1.
Создать объект  класса Текстовый файл, используя классы Файл, Директория.
Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
Переменные: text - содержание текстового файла, filePath - адрес текстового файла, myFile - файл (заготовка)
 */
public class TextFile {
    private String text;
    private MyFile myFile;
    private Path filePath;

    public TextFile(String text, MyFile myFile) {
        this.text = text;
        this.myFile = myFile;
        this.filePath = this.myFile.createFile();
    }

    //создание текстового файла
    public Path createTextFile() {
        try {
            return Files.writeString(filePath, text);
        } catch (NullPointerException | FileAlreadyExistsException e) {
            System.out.println(e);
            return null;
        } catch (IOException e) {
            System.out.println(e);
            return null;
        }
    }

    //переименование файла
    public void renameFile(String newName) {
        File original = myFile.getDirectory().getAddress().resolve(myFile.getName() + '.' + myFile.getType()).toFile();
        File newFile = null;
        try {
            newFile = myFile.getDirectory().getAddress().resolve(newName + '.' + myFile.getType()).toFile();
        } catch (InvalidPathException e) {
            System.out.println(e);
        }
        try {
            if (original.exists() && original.isFile() && original.canWrite()) {
                if (original.renameTo(newFile)) {
                    System.out.println("Файл переименован успешно.");
                    this.filePath = newFile.toPath();
                } else {
                    System.out.println("Файл не переименован.");
                    this.filePath = original.toPath();
                }
            } else {
                System.out.println("Файл не переименован.");
                this.filePath = original.toPath();
            }
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }

    //вывод в консоль содержимого текстового файла
    public void printTextFile() {
        try {
            List<String> list = Files.readAllLines(filePath);
            System.out.println("Содержимое файла:");
            for (String str : list) {
                System.out.println(str);
            }
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    //добавление текста в существующий текстовый файл
    public void addText(String textAdd) {
        try {
            this.filePath = Files.writeString(filePath, textAdd, StandardOpenOption.APPEND);
            System.out.println("Текст успешно добавлен в файл.");
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    //удаление содерживого файла текста в существующий текстовый файл
    public void deleteText() {
        try {
            this.filePath = Files.writeString(filePath, "");
            System.out.println("Содерживое файла успешно удалено.");
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);

        }
    }

    //удаление текстового файла
    public void deleteFile() {
        Path temp = null;
        try {
            this.filePath = Files.writeString(filePath, "");
            Files.delete(this.filePath);
            System.out.println("Файл успешно удален.");
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public MyFile getMyFile() {
        return myFile;
    }

    public void setMyFile(MyFile myFile) {
        this.myFile = myFile;
    }

    public Path getFilePath() {
        return filePath;
    }

    public void setFilePath(Path filePath) {
        this.filePath = filePath;
    }
}
