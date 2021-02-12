package Task_04_DragonAndRiches;
/*
Дракон и его сокровища.
Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона.
Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
выбора сокровищ на заданную сумму.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Dragon {
    public static final String FILE_RICHES = "data\\DragonAndTreasures\\TreasureList.txt";
    public static final String FILE_SELECT_RICHES = "data\\DragonAndTreasures\\TreasureListWorth.txt";
    private String name;
    private List<Treasure> treasureList;

    public Dragon(String name) {
        this.name = name;
        this.treasureList = readTreasure();
    }

    //чтение списка сокровищ из файла и запись в treasureList
    private List<Treasure> readTreasure() {
        try (BufferedReader readerFile = new BufferedReader(new FileReader(Dragon.FILE_RICHES))) {
            String treasureString = readerFile.readLine();
            List<Treasure> treasureList = new ArrayList<>();
            while (treasureString != null) {
                String[] richesArr = treasureString.split(";");
                treasureList.add(new Treasure(richesArr[0], Integer.parseInt(richesArr[1])));
                treasureString = readerFile.readLine();
            }
            return treasureList;
        } catch (IOException e) {
            System.out.println("Список сокровищ не прочитан: " + e);
            return null;
        }
    }

    //вывод в консоль списка сокровищ
    public void printTreasure() {
        for (int i = 0; i < treasureList.size(); i++) {
            System.out.println("[" + i + "] " + treasureList.get(i).toString());
        }
    }

    //Запись в файл списка сокровищ
    private void writeFile(List<Treasure> treasureList, String pathFile, StringBuilder str) {
        try {
            for (Treasure value : treasureList) {
                str.append(value.toString() + "\n");
            }
            Files.writeString(Paths.get(pathFile), str.toString());
        } catch (IOException e) {
            System.out.println("Файл не записан: " + e);
        }
    }

    //Выбор самого дорогого сокровища
    public Treasure selectMaxPrice() {
        Treasure treasureMaxPrice = treasureList.get(0);
        for (Treasure treasure : treasureList) {
            if (treasure.getPrice() > treasureMaxPrice.getPrice()) {
                treasureMaxPrice = treasure;
            }
        }
        return treasureMaxPrice;
    }

    //выбор сокровищ на заданную сумму
    public List<Treasure> selectTreasureAmount(int amount) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int constAmount = amount;
        List<Treasure> list = new ArrayList<>();
        Set<Integer> numberSet = new HashSet<>();
        boolean select = true;
        while (select) {
            while (true) {
                System.out.print("Выберите номер сокровища на сумму " + amount + ": ");
                int index = Integer.parseInt(reader.readLine());
                while (true) {
                    if (numberSet.contains(index)) {
                        System.out.print("Сокровище [" + index + "] " + this.treasureList.get(index).getTitle() +
                                " уже выбрано, введите другой номер: ");
                        index = Integer.parseInt(reader.readLine());
                    } else {
                        break;
                    }
                }
                int residual = amount - this.treasureList.get(index).getPrice();
                if (residual >= 0) {
                    numberSet.add(index);
                    list.add(this.treasureList.get(index));
                    amount -= this.treasureList.get(index).getPrice();
                } else {
                    System.out.println("Недостаточно средств, " + this.treasureList.get(index).getTitle() +
                            " не выбран. Остаток средств: " + amount);
                }
                break;
            }
            select = continueSelect(amount, reader);
        }
        printSelectTreasure(list, constAmount);
        StringBuilder str = new StringBuilder("Список сокровищ на сумму " + constAmount + ":\n");
        writeFile(list, FILE_SELECT_RICHES, str);
        reader.close();
        return list;
    }

    //Продолжение выбора
    private boolean continueSelect(int amount, BufferedReader reader) throws IOException {
        if (amount > 0) {
            System.out.print("Остаток " + amount + ". ");
            while (true) {
                System.out.print("Продолжить выбор (Y/N)? ");
                String continued = reader.readLine();
                if (continued.equalsIgnoreCase("Y")) {
                    return true;
                } else if (continued.equalsIgnoreCase("N")) {
                    return false;
                } else {
                    System.out.println("Попробуй еще раз.");
                }
            }
        } else {
            System.out.println("Нет средств. Выбор закончен.");
            return false;
        }
    }

    //Вывод в консоль выбранного списка сокровищ
    private void printSelectTreasure(List<Treasure> list, int amount) {
        if (list.size() != 0) {
            System.out.println("Список сокровищ на сумму " + amount + ":");
            for (Treasure treasure : list) {
                System.out.println(treasure.toString());
            }
        } else {
            System.out.println("Список сокровищ пуст.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
