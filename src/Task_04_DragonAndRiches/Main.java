package Task_04_DragonAndRiches;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Задача 4.
Создать консольное приложение, удовлетворяющее следующим требованиям:
• Приложение должно быть объектно-, а не процедурно-ориентированным.
• Каждый класс должен иметь отражающее смысл название и информативный состав.
• Наследование должно применяться только тогда, когда это имеет смысл.
• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
• Классы должны быть грамотно разложены по пакетам.
• Консольное меню должно быть минимальным.
• Для хранения данных можно использовать файлы.
Дракон и его сокровища.
Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона.
Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и 
выбора сокровищ на заданную сумму.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader readerFile = new BufferedReader(new FileReader(Dragon.FILE_RICHES));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Dragon dragon = new Dragon("Дрогон");
        dragon.readRiches(readerFile);
        dragon.printRichesByNumber(0, 49, 20, 15, 30, 45, 87, 74);
        System.out.println("Самое дорогое сокровище: " + dragon.selectMaxPrice());
        dragon.printRiches();
        dragon.selectRichesAmount(500000, reader);

        reader.close();
    }
}
