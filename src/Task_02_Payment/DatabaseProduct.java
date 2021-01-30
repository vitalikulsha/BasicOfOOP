package Task_02_Payment;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class DatabaseProduct {

    public static List<Product> productList = new ArrayList<Product>() {
        {
            this.add(new Product("Принтер", "Canon", 200));
            this.add(new Product("Принтер", "HP", 300));
            this.add(new Product("Принтер", "Epson", 280));
            this.add(new Product("Ноутбук", "Lenovo", 1000));
            this.add(new Product("Ноутбук", "Apple", 2500));
            this.add(new Product("Ноутбук", "Vaio", 1200));
            this.add(new Product("Планшет", "Samsung", 1300));
            this.add(new Product("Планшет", "Apple", 1900));
            this.add(new Product("Планшет", "Huawei", 1000));
            this.add(new Product("Телевизор", "Samsung", 1300));
            this.add(new Product("Телевизор", "LG", 1000));
            this.add(new Product("Телевизор", "Горизонт", 300));
            this.add(new Product("Пылесос", "Samsung", 350));
            this.add(new Product("Пылесос", "Bosh", 500));
            this.add(new Product("Пылесос", "Витязь", 150));
        }
    };

    //создание уникального списка товаров по наименованию
    private static Set<String> createNameSet() {
        Set<String> nameSet = new TreeSet<>();
        for (Product list : productList) {
            nameSet.add(list.getName());
        }
        return nameSet;
    }

    //ввод наименования товара и проверка его наличия в списке
    private static String readNameProduct(BufferedReader reader) throws IOException {
        System.out.println("Выберите наименование товара из списка: ");
        System.out.print(createNameSet() + " - ");
        String name;
        while (true) {
            name = reader.readLine();
            if (createNameSet().contains(name)) {
                break;
            } else {
                System.out.print("Ничего не найдено, попробуйте еще раз: ");
            }
        }
        return name;
    }

    //Поиск тавара по наименованию
    private static List<Product> searchByNameProduct(BufferedReader reader) throws IOException {
        String name = readNameProduct(reader);
        List<Product> products = new ArrayList<>();
        for (Product product : productList) {
            if (name.equalsIgnoreCase(product.getName())) {
                products.add(product);
            }
        }
        return products;
    }

    //ввод производителя товара и проверка его наличия в списке
    private static String readManufacturerProduct(Set<String> manufacturerSet, BufferedReader reader) throws IOException {
        System.out.println("Выберите производителя товара из списка: ");
        System.out.print(manufacturerSet + " - ");
        String manufacturer;
        while (true) {
            manufacturer = reader.readLine();
            if (manufacturerSet.contains(manufacturer)) {

                break;
            } else {
                System.out.print("Ничего не найдено, попробуйте еще раз: ");
            }
        }
        return manufacturer;
    }

    //Поиск товара
    public static Product searchProduct(BufferedReader reader) throws IOException {
        Product product = null;
        List<Product> list = searchByNameProduct(reader);
        Set<String> manufacturerSet = new TreeSet<>();
        for (Product element : list) {
            manufacturerSet.add(element.getManufacturer());
        }
        String manufacturer = readManufacturerProduct(manufacturerSet, reader);
        for (Product element : list) {
            if (manufacturer.equalsIgnoreCase(element.getManufacturer())) {
                product = element;
                break;
            }
        }
        return product;
    }

    //ввод количества товара
    public static int readQuantity(BufferedReader reader) throws IOException {
        System.out.print("Введите количество товара: ");
        int quantity = Integer.parseInt(reader.readLine());
        return quantity;
    }
}
