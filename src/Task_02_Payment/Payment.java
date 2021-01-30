package Task_02_Payment;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static Task_02_Payment.DatabaseProduct.*;

/*
Создать класс Payment с внутренним классом,
с помощью объектов которого можно сформировать покупку из нескольких товаров.
 */
public class Payment {
    private int amountMoney;

    //Вычисление суммы денег к   оплате за список товаров
    public void amountMoneyPay(Map<Product, Integer> shoppingList) {
        int sum = 0;
        for (Map.Entry<Product, Integer> pair : shoppingList.entrySet()) {
            sum += pair.getKey().getPrice() * pair.getValue();
        }
        this.amountMoney = sum;
    }

    //вывод в консоль списка покупок и суммы к оплате
    public void printShoppingList(Map<Product, Integer> shoppingList) {
        System.out.println("Список покупок:");
        for (Map.Entry<Product, Integer> pair : shoppingList.entrySet()) {
            System.out.println(pair.getKey().toString() + " - " + pair.getValue() + " шт.");
        }
        System.out.println("Сумма к оплате: " + amountMoney + " у.е.");
    }

    public class Purchase {
        private Map<Product, Integer> shoppingList;

        public Map<Product, Integer> getShoppingList() {
            return shoppingList;
        }

        public void setShoppingList(Map<Product, Integer> shoppingList) {
            this.shoppingList = shoppingList;
        }

        //Создание списка покупок
        public void createShoppingList(BufferedReader reader) throws IOException {
            Map shoppingList = new HashMap<Product, Integer>();
            boolean search = true;
            while (search) {
                Product product = searchProduct(reader);
                Integer quantity = readQuantity(reader);
                shoppingList.put(product, quantity);
                while (true) {
                    System.out.print("Продолжить выбор товара (Y/N)? - ");
                    String continuation = reader.readLine();
                    if (continuation.equalsIgnoreCase("Y")) {
                        search = true;
                        break;
                    } else if (continuation.equalsIgnoreCase("N")) {
                        search = false;
                        break;
                    } else {
                        System.out.println("Давайте попробуем еще раз.");
                    }
                }
            }
            this.shoppingList = shoppingList;
        }
    }
}
