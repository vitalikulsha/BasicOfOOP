package Task_01_TextFile;
/*
Переменная name - имя файла, тип файла, директория
Метод createFile() - создание файла
 */

import java.io.IOException;
import java.nio.file.*;

public class MyFile {
    private String name;
    private String type;
    private Directory directory;

    public MyFile(String name, String type, Directory directory) {
        this.name = name;
        this.type = type;
        this.directory = directory;
    }

    //создание файла
    public Path createFile() {
        try {
            return Files.createFile(Paths.get(directory.getAddress() + "\\" + name + '.' + type));
        } catch (NullPointerException | FileAlreadyExistsException | AccessDeniedException e) {
            System.out.println("Файл не создан: " + e);
            return null;
        } catch (IOException e) {
            System.out.println(e);
            return null;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
