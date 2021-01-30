package Task_02_Payment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Создать класс Payment с внутренним классом,
с помощью объектов которого можно сформировать покупку из нескольких товаров.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Payment payment = new Payment();
        Payment.Purchase purchase = payment.new Purchase();
        purchase.createShoppingList(reader);
        payment.amountMoneyPay(purchase.getShoppingList());
        payment.printShoppingList(purchase.getShoppingList());
    }



}
