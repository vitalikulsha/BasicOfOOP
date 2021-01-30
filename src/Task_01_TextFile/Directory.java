package Task_01_TextFile;
/*
Переменная address - адрес деректории
Методы createDirectories() - создание директории
 */

import java.io.IOException;
import java.nio.file.*;

public class Directory {
    private Path address;

    public Directory(String address) {
        this.address = createDirectories(address);
    }

    //создание директории
    public Path createDirectories(String address) {
        try {
            return Files.createDirectories(Paths.get(address));
        } catch (InvalidPathException | NullPointerException e) {
            System.out.println("Директория не создана:" + e);
            return null;
        } catch (IOException e) {
            System.out.println(e);
            return null;
        }
    }

    public Path getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = Paths.get(address);
    }
}
