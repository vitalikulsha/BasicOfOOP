package Task_04_DragonAndRiches;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Dragon {
    public static final String FILE_RICHES = "data\\DragonAndRiches\\RichesList.txt";
    public static final String FILE_SELECT_RICHES = "data\\DragonAndRiches\\SelectRiches.txt";
    public static final String FILE_RICHES_BY_NUMBER = "data\\DragonAndRiches\\RichesByNumber.txt";
    private String name;
    private List<Riches> richesList;

    public Dragon(String name) {
        this.name = name;
    }

    public Dragon(String name, List<Riches> richesList) {
        this.name = name;
        this.richesList = richesList;
    }

    //чтение списка сокровищ из файла и запись в richesList
    public void readRiches(BufferedReader reader) throws IOException {
        String richesString = reader.readLine();
        List<Riches> richesList = new ArrayList<>();
        while (richesString != null) {
            String[] richesArr = richesString.split(";");
            richesList.add(new Riches(richesArr[0], Integer.parseInt(richesArr[1])));
            richesString = reader.readLine();
        }
        this.richesList = richesList;
    }


    //вывод в консоль списка сокровищ
    public void printRiches() {
        for (int i = 0; i < richesList.size(); i++) {
            System.out.println("[" + i + "] " + richesList.get(i).toString());
        }
    }

    //Вывод в консоль сокровищ по порядковым номерам
    public void printRichesByNumber(int... numbers) {
        List<Riches> list = new ArrayList<>();
        System.out.println("Список сокровищ с номерами " + Arrays.toString(numbers) + ":");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < richesList.size(); j++) {
                if (numbers[i] == j) {
                    System.out.println("[" + j + "] " + richesList.get(i).toString());
                    list.add(richesList.get(i));
                    break;
                }
            }
        }
        StringBuilder str = new StringBuilder("Список сокровищ с номерами " + Arrays.toString(numbers) + ":\n");
        writeFile(list, FILE_RICHES_BY_NUMBER, str);
    }

    //Запись в файл списка сокровищ
    private void writeFile(List<Riches> richesList, String pathFile, StringBuilder str) {
        try {
            for (Riches value : richesList) {
                str.append(value.toString() + "\n");
            }
            Files.writeString(Paths.get(pathFile), str.toString());
        } catch (FileAlreadyExistsException e) {
            e.printStackTrace();
        } catch (NullPointerException | AccessDeniedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Выбор самого дорогого сокровища
    public Riches selectMaxPrice() {
        Riches richesMaxPrice = richesList.get(0);
        for (Riches riches : richesList) {
            if (riches.getPrice() > richesMaxPrice.getPrice()) {
                richesMaxPrice = riches;
            }
        }
        return richesMaxPrice;
    }

    //выбор сокровищ на заданную сумму
    public List<Riches> selectRichesAmount(int amount, BufferedReader reader) throws IOException {
        int constAmount = amount;
        List<Riches> list = new ArrayList<>();
        Set<Integer> numberSet = new HashSet<>();
        boolean select = true;
        while (select) {
            while (true) {
                System.out.print("Выберите номер сокровища на сумму " + amount + ": ");
                int index = Integer.parseInt(reader.readLine());
                while (true) {
                    if (numberSet.contains(index)) {
                        System.out.print("Сокровище [" + index + "] " + this.richesList.get(index).getTitle() +
                                " уже выбрано, введите другой номер: ");
                        index = Integer.parseInt(reader.readLine());
                    } else {
                        break;
                    }
                }
                int residual = amount - this.richesList.get(index).getPrice();
                if (residual >= 0) {
                    numberSet.add(index);
                    list.add(this.richesList.get(index));
                    amount -= this.richesList.get(index).getPrice();
                } else {
                    System.out.println("Недостаточно средств, " + this.richesList.get(index).getTitle() +
                            " не выбран. Остаток средств: " + amount);
                }
                break;
            }
            select = continueSelect(amount, reader);
        }
        printSelectRiches(list, constAmount);
        StringBuilder str = new StringBuilder("Список сокровищ на сумму " + constAmount + ":\n");
        writeFile(list, FILE_SELECT_RICHES, str);
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
    private void printSelectRiches(List<Riches> list, int amount) {
        if (list.size() != 0) {
            System.out.println("Список сокровищ на сумму " + amount + ":");
            for (Riches riches : list) {
                System.out.println(riches.toString());
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

    public List<Riches> getRichesList() {
        return richesList;
    }

    public void setRichesList(List<Riches> richesList) {
        this.richesList = richesList;
    }
}
