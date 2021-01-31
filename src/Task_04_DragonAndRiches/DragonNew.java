package Task_04_DragonAndRiches;
/*
Доработать методы:
printRichesByNumber - вывод в консоль по порядковым номерам
selectRichesAmount - выбор сокоровищ на определенную сумму
printSelectRiches - вывод в консоль выбранного списка сокровищ

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class DragonNew {
    public static final String FILE_RICHES = "src\\Task_04_DragonAndRiches\\RichesList.txt";
    private String name;
    private List<List<Riches>> richesList;

    public DragonNew(String name) {
        this.name = name;
    }

    public DragonNew(String name, List<List<Riches>> richesList) {
        this.name = name;
        this.richesList = richesList;
    }

    //чтение списка сокровищ из файла и запись в richesList
    public void readRichesArr(BufferedReader reader) throws IOException {
        String richesString = reader.readLine();
        List<List<Riches>> richesList = new ArrayList<>();
        while (richesString != null) {
            String[] richesArr = richesString.split(";");
            List<Riches> element = new ArrayList<>();
            for (int i = 0; i < Integer.parseInt(richesArr[2]); i++) {
                element.add(new Riches(richesArr[0], Integer.parseInt(richesArr[1])));
            }
            richesList.add(element);
            richesString = reader.readLine();
        }
        this.richesList = richesList;
    }

    //вывод в консоль списка сокровищ с их номерами и количеством
    public void printRiches() {
        for (int i = 0; i < richesList.size(); i++) {
            for (int j = 0; j < richesList.get(i).size(); j++) {
                System.out.println("[" + i + "] " + richesList.get(i).get(j).toString() +
                        ", quantity = " + richesList.get(i).size());
                break;
            }
        }
    }

    //Вывод в консоль сокровищ по порядковым номерам
    public void printRichesByNumber(int... numbers) {
        System.out.println("Список сокровищ с номерами " + Arrays.toString(numbers) + ":");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < richesList.size(); j++) {
                if (numbers[i] == j) {
                    System.out.println("[" + j + "] " + richesList.get(i).toString());
                    break;
                }
            }
        }
    }

    //Выбор самого дорогого сокровища
    public Riches selectMaxPrice() {
        List<Riches> richesMaxPriceList = richesList.get(0);
        Riches richesMaxPrice = richesMaxPriceList.get(0);
        for (List<Riches> list : richesList) {
            for (Riches value : list) {
                if (value.getPrice() > richesMaxPrice.getPrice()) {
                    richesMaxPrice = value;
                    break;
                }
            }
        }
        return richesMaxPrice;
    }

    //выбор сокровищ на заданную сумму
    /*public List<Riches> selectRichesAmount(int amount, BufferedReader reader) throws IOException {
        List<Riches> list = new ArrayList<>();
        printRiches();
        boolean select = true;
        while (select) {
            while (true) {
                System.out.print("Выберите номер сокровища на сумму " + amount + ": ");
                int index = Integer.parseInt(reader.readLine());
                int residual = amount - this.richesList.get(index).getPrice();
                if (residual >= 0) {
                    list.add(this.richesList.get(index));
                    amount -= this.richesList.get(index).getPrice();
                } else {
                    System.out.println("Недостаточно средств, " + this.richesList.get(index).getTitle() +
                            " не выбран. Остаток средств: " + amount);
                    break;
                }
                if (amount == 0) {
                    System.out.println("Нет средств. Выбор закончен.");
                    break;
                }
            }
            select = continueSelection(reader);
        }
        printSelectRiches(list);
        return list;
    }*/

    //Продолжение выбора
    public boolean continueSelection(BufferedReader reader) throws IOException {
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
    }

    //Вывод в консоль выбранного списка сокровищ
    public void printSelectRiches(List<Riches> list) {
        if (list.size() != 0) {
            System.out.println("Список выбранных сокровищ: ");
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
}
